package lt.vu.mif.mape.tms.facade.impl.user;

import lt.vu.mif.mape.ext.mail.MailSender;
import lt.vu.mif.mape.tms.facade.UserFacade;
import lt.vu.mif.mape.tms.model.factory.TMSFactory;
import lt.vu.mif.mape.tms.model.user.User;
import lt.vu.mif.mape.tms.rep.UserRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RealUserFacade implements UserFacade{

    private TMSFactory tmsFactory;
    private UserRep userRep;
    private MailSender mailSender;

    @Autowired
    public RealUserFacade(TMSFactory tmsFactory, UserRep userRep,MailSender mailSender) {
        this.tmsFactory = tmsFactory;
        this.userRep = userRep;
        this.mailSender = mailSender;
    }

    @Override
    public boolean registerUser(String name, String password, String email) {
        if (userRep.findByName(name) != null) {
            return false;
        }
        User user = tmsFactory.createUser(name, password);
        user.setEmail(email);
        mailSender.sendEmail(email,"Greetings");
        userRep.save(user);
        return true;
    }

    @Override
    public boolean login(String name, String password) {
        User user = userRep.findByName(name);
        if (user == null) {
            return false;
        }
        return user.checkPassword(password);
    }
}
