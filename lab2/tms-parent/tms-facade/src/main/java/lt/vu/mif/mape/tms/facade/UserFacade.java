package lt.vu.mif.mape.tms.facade;

public interface UserFacade {

    boolean registerUser(String name, String password, String email);

    boolean login(String name, String password);
}
