package lt.vu.mif.mape.ui;

import lt.vu.mif.mape.tms.facade.UserFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserFacade userFacade;

    @Autowired
    public UserController(UserFacade userFacade) {
        this.userFacade = userFacade;
    }

    @RequestMapping("/register")
    public String register(@RequestParam(value="name") String name, @RequestParam(value="password") String password, @RequestParam(value="email") String email ,Model model) {
        model.addAttribute("name", name);
        model.addAttribute("password", password);
        model.addAttribute("email", email);
        boolean registration = userFacade.registerUser(name, password, email);
        if (registration){
            return "successfully registered";
        }
        return "registration failure";
    }

    @RequestMapping("/login")
    public String login(@RequestParam(value="name") String name, @RequestParam(value="password") String password, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("password", password);
        boolean login = userFacade.login(name, password);
        if (login){
            return "successfully logged in";
        }
        return "login failure";
    }

}
