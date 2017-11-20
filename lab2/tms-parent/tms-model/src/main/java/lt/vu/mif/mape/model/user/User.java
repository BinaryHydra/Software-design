package lt.vu.mif.mape.model.user;

public interface User {
    public String getName();

    public void setName(String name);

    public boolean checkPassword(String password);

    public void setPassword(String password);
}
