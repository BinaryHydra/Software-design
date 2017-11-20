package lt.vu.mif.mape.rep.user;

import lt.vu.mif.mape.model.user.User;

public interface UserRep {

    Long save(User user);

    User find(Long id);
}
