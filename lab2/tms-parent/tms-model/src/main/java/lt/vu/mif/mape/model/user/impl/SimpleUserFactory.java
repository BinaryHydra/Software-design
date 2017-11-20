package lt.vu.mif.mape.model.user.impl;

import lt.vu.mif.mape.model.user.User;
import lt.vu.mif.mape.model.user.UserFactory;
import org.springframework.stereotype.Component;

@Component
public class SimpleUserFactory implements UserFactory {

    public User create(String name, String password) {
        SimpleUser user = new SimpleUser();
        user.setName(name);
        user.setPassword(password);
        return user;
    }
}
