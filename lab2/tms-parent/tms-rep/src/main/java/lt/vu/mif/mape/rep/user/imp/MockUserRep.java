package lt.vu.mif.mape.rep.user.imp;

import lt.vu.mif.mape.model.user.User;
import lt.vu.mif.mape.rep.user.UserRep;

import java.util.HashMap;
import java.util.Map;

public class MockUserRep implements UserRep {

    private Map<Long, User> userMap = new HashMap<Long, User>();
    private Long id = 0L;

    public Long save(User user) {
        userMap.put(id++, user);
        return id;
    }

    public User find(Long id) {
        return userMap.get(id);
    }
}
