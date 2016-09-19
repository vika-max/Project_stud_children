import java.util.HashMap;
import java.util.Map;


public class DataBase {

    UserTable userTable = new UserTable();
    Map<String, Course> courseTable= new HashMap<>();

    Map<String, Student> getallStudent(){
        return userTable.getStudentTable();
    }

    Map<String, Teacher> getallTeacher(){
        return userTable.getTeacherTable();
    }

    Administrator getAdmin(){
        return userTable.getAdmin();
    }

    void add(String firstname, String lastname, String login, String password, UserType type) {
        userTable.add(firstname, lastname, login, password, type);
    }

    User search(String login) {
        return userTable.searchUser(login);
    }

}
