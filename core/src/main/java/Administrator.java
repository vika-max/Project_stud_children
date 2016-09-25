import java.util.Map;



class Administrator extends User {

    Administrator(){
        super("admin", "user");
    }

    public UserType getType() {
        return UserType.TYPE_ADMINISTRATOR;
    }


}

