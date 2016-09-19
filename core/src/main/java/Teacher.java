public class Teacher extends User{
    String firstname;
    String lastname;
  //  int id_passport;

    public UserType getType(){
        return UserType.TYPE_TEACHER;
    }


    void setFirstname(String firstname1){
        firstname = firstname1;
    }

    void setLastname(String lastname1){
        lastname = lastname1;
    }

    String getFirstname(){
        return firstname;
    }

    String getLastname(){
        return lastname;
    }
}
