package lt.vu.mif.mape.model.user.impl;

import lt.vu.mif.mape.model.user.User;

public class SimpleUser implements User {

    private String name;
    private String password;


    public boolean checkPassword(String password) {
        //TODO encryption
        return this.password.equals(password);
    }

    //region getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    //endregion
}
