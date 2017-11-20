package lt.vu.mif.mape.model.user;

public interface UserFactory {

    User create(String name, String password);
}
