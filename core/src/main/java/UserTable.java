import java.util.HashMap;
import java.util.Map;


public class UserTable {
    Map<String, User> userTable = new HashMap<>();

    UserTable() {
        Administrator admin = new Administrator();
        String adminlogin = "admin";
        admin.setLogin(adminlogin);
        admin.setPassword("admincourse");
        userTable.put(adminlogin, admin);
    }

    Map<String, Student> getStudentTable() {
        Map<String, Student> studenttable = new HashMap<>();
        int i;
        for (Map.Entry<String, User> entry : userTable.entrySet()) {
            if (entry.getValue().getType() == UserType.TYPE_STUDENT) {
                studenttable.put(entry.getValue().getLogin(), (Student) entry.getValue());
            }
        }
        return studenttable;
    }

    Map<String, Teacher> getTeacherTable() {
        Map<String, Teacher> teacherttable = new HashMap<>();
        int i;
        for (Map.Entry<String, User> entry : userTable.entrySet()) {
            if (entry.getValue().getType() == UserType.TYPE_STUDENT) {
                teacherttable.put(entry.getValue().getLogin(), (Teacher) entry. getValue());
            }
        }
        return teacherttable;
    }


    void add(String firstname, String lastname, String login, String password, UserType type){

        if (type == UserType.TYPE_STUDENT) {
            Student student = new Student();
            student.setLogin(login);
            student.setPassword(password);
            student.setFirstname(firstname);
            student.setLastname(lastname);
            userTable.put(login, student);
        }
        if (type == UserType.TYPE_TEACHER) {
            Teacher teacher = new Teacher();
            teacher.setLogin(login);
            teacher.setPassword(password);
            teacher.setFirstname(firstname);
            teacher.setLastname(lastname);
            userTable.put(login, teacher);
        }

    }

    Administrator getAdmin(){
        return (Administrator)userTable.get("admin");
    }

    User searchUser(String login)
    {
        return userTable.get(login);
    }
}
