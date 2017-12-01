package lt.vu.mif.mape.tms.rep;

import lt.vu.mif.mape.tms.model.user.User;

public interface UserRep {

    Long save(User user);

    User find(Long id);

    User findByName(String name);
}
