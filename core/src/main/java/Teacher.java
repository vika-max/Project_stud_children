public class Teacher extends User{
  String firstname;
  String lastname;
  //  int id_passport;

    Teacher(String login1, String password1, String firstname1, String lastname1)
    {
        super(login1, password1);
        firstname = firstname1;
        lastname = lastname1;
    }

    void editTeacher(String login1, String password1, String firstname1, String lastname1) {
        firstname = firstname1;
        lastname = lastname1;
        super.editLogin(login1);
        super.editPassword(password1);
    }
    /* Редакторование логина учителя */
    void editLogin(String login1) {
        super.editLogin(login1);
    }
    /* Редакторование пароля учителя */
    void editPassword(String password1) {
        super.editLogin(password1);
    }
    /* Редакторование имени учителя */
    void editFirstName(String firstname1) {
        firstname = firstname1;
    }
    /* Редакторование фамилии учителя */
    void editLastName(String lastname1) {
        lastname = lastname1;
    }

    /* Получение логина учителя*/
    String getLogin() {
        return super.getLogin();
    }

    /* Получение пароля учителя*/
    String getPassword() {
        return super.getPassword();
    }

    /* Получение имени учителя*/
    String getFirstname() {
        return firstname;
    }
    /* Получение фамилии учителя*/
    String getLastname() {
        return firstname;
    }

    public UserType getType(){
        return UserType.TYPE_TEACHER;
    }

    void setFirstname(String firstname1){
        firstname = firstname1;
    }

    void setLastname(String lastname1){
        lastname = lastname1;
    }

    /* Переопределение метода equals*/
   public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
           return false;
       Teacher other = (Teacher) obj;
       if (!(firstname.equals(other.getFirstname()))) {
            return false;
        }
        if (!lastname.equals(other.getLastname())) return false;

        if (!super.equals(other)) {
           return false;
        }
        return true;
    }
    public int hashCode() {
        int hashCode1 = login.hashCode();
        return hashCode1;
    }

}
