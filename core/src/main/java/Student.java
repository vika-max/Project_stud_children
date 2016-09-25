import java.util.Map;

public class Student extends User{
    String firstname;
    String lastname;
    Student(String login1, String password1, String firstname1, String lastname1)
    {
        super(login1, password1);
        firstname = firstname1;
        lastname = lastname1;
    }

   public UserType getType(){
        return UserType.TYPE_STUDENT;
    }

    /* Редактирование студента - общий случай*/
    void editStudent(String login1, String password1, String firstname1, String lastname1) {
        firstname = firstname1;
        lastname = lastname1;
        super.editLogin(login1);
        super.editPassword(password1);
    }


    /* Редакторование логина студента */
    void editLogin(String login1) {
        super.editLogin(login1);
    }
    /* Редакторование пароля студента */
    void editPassword(String password1) {
        super.editLogin(password1);
    }
    /* Редакторование имени студента */
    void editFirstName(String firstname1) {
        firstname = firstname1;
    }
    /* Редакторование фамилии студента */
    void editLastName(String lastname1) {
        lastname = lastname1;
    }

    /* Получение логина студента*/
    String getLogin() {
        return super.getLogin();
    }

    /* Получение пароля студента*/
    String getPassword() {
        return super.getPassword();
    }

    /* Получение имени студента*/
    String getFirstname() {
        return firstname;
    }
    /* Получение фамилии студента */
    String getLastname() {
        return firstname;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (!firstname.equals(other.firstname)) return false;
        if (!lastname.equals(other.lastname)) return false;
        if(!super.equals(other)) {return false;}
            return true;
    }

    public int hashCode() {
        int hashCode1 = login.hashCode();
        return hashCode1;
    }
}

