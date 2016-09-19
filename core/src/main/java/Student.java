public class Student extends User{
    String firstname;
    String lastname;
    //int birth_certificate;
    CourseMap courseMap =  new CourseMap();

    public UserType getType(){
        return UserType.TYPE_STUDENT;
    }

    /* Массив курсов*/
    public CourseMap SeeMyCourse(){
        return courseMap;
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

    void setAddCourseStudent(Course course1){
        courseMap.add(course1);
    }



}

