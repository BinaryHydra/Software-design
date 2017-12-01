package lt.vu.mif.mape.tms.model.user;

public interface User {
    String getName();

    void setName(String name);

    boolean checkPassword(String password);

    void setPassword(String password);

    void setId(Long id);

    Long getId();

    String getEmail();

    void setEmail(String email);
}
