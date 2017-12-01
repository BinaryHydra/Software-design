package lt.vu.mif.mape.tms.rep.impl;

import lt.vu.mif.mape.tms.model.user.User;
import lt.vu.mif.mape.tms.rep.UserRep;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//@Repository
public class MemoryUserRep implements UserRep {

    private Map<Long, User> userMap = new HashMap<Long, User>();
    private Long id = 0L;

    public Long save(User user) {
        userMap.put(++id, user);
        return id;
    }

    public User find(Long id) {
        return userMap.get(id);
    }

    @Override
    public User findByName(String name) {
        List<User> users = userMap.entrySet().stream().map(Map.Entry::getValue)
                .filter(user -> user.getName().equals(name))
                .collect(Collectors.toList());
        if (users.size() > 1) {
            throw new IllegalStateException("found more than one user with same userName");
        }
        if (users.isEmpty()) {
            return null;
        }
        return users.get(0);
    }
}
