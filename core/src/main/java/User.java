public abstract class User {
    String login;
    String password;

    void setLogin(String log){
        login = log;
    }

    void setPassword(String pass){
        password = pass;
    }

    String getLogin(){
    return login;}

    String getPassword(){
    return password;}

    public abstract UserType getType();

}