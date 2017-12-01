package lt.vu.mif.mape.tms.config;

import lt.vu.mif.mape.tms.bl.VelocityCalculator;
import lt.vu.mif.mape.ext.mail.MailSender;
import lt.vu.mif.mape.tms.facade.CommentFacade;
import lt.vu.mif.mape.tms.facade.TaskFacade;
import lt.vu.mif.mape.tms.facade.UserFacade;
import lt.vu.mif.mape.tms.facade.impl.comment.RealCommentFacade;
import lt.vu.mif.mape.tms.facade.impl.task.RealTaskFacade;
import lt.vu.mif.mape.tms.facade.impl.user.RealUserFacade;
import lt.vu.mif.mape.tms.model.factory.TMSFactory;
import lt.vu.mif.mape.tms.rep.CommentRep;
import lt.vu.mif.mape.tms.rep.TaskRep;
import lt.vu.mif.mape.tms.rep.UserRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FacadeConfig {

    private final TMSFactory tmsFactory;
    private final UserRep userRep;
    private final TaskRep taskRep;
    private final CommentRep commentRep;
    private final VelocityCalculator velocityCalculator;
    private final MailSender mailSender;
    @Autowired
    public FacadeConfig(TMSFactory tmsFactory, UserRep userRep, TaskRep taskRep, CommentRep commentRep, MailSender mailSender, VelocityCalculator velocityCalculator) {
        this.tmsFactory = tmsFactory;
        this.userRep = userRep;
        this.taskRep = taskRep;
        this.commentRep = commentRep;
        this.velocityCalculator = velocityCalculator;
        this.mailSender = mailSender;
    }

    @Bean
    TaskFacade taskFacade() {
        return new RealTaskFacade(tmsFactory, userRep, taskRep, velocityCalculator);
    }

    @Bean
    UserFacade userFacade() {
        return new RealUserFacade(tmsFactory, userRep, mailSender);
    }

    @Bean
    CommentFacade commentfacade(){
        return new RealCommentFacade(tmsFactory, commentRep, taskRep, userRep);
    }

}
