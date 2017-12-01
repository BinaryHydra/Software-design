package lt.vu.mif.mape.tms.model.user.impl;

public class ClientUser {
        private String password;
        private Long id;
        private String email;

        public boolean checkPassword(String password) {
            //TODO encryption
            return this.password.equals(password);
        }

        //region getters and setters
        public String getName() {
            return email;
        }

        public void setName(String name) {
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        //endregion
}
