public abstract class User {
    public String login;
    public String password;
    User(String login1, String password1) {
        login = login1;
        password = password1;
    }

    void editLogin(String log){
        login = log;
    }

    void editPassword(String pass){
        password = pass;
    }

    String getLogin(){
    return login;}

    String getPassword(){
    return password;}

    public User getUser(){
        return this;
  }

    public abstract UserType getType();

    /* Переопределение метода equals*/
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (!login.equals(other.login)) {
            return false;
        }
        if (!password.equals(other.password)) {
            return false;
        }
    return true;}

    public int hashCode() {
        int hashCode1 = login.hashCode();
        return hashCode1;
    }
}