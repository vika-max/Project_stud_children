/**
 * Created by mvika on 22.09.16.
 */
public class StudentCourse {
    Course course;
    Student student;
    StudentCourse(Student student1, Course course1) {
        course = course1;
        student = student1;
    }
    /* Получение курса */
    Course getCourse() {
        return course;
    }
    /* Получение студента*/
    Student getStudent() {
        return student;
    }
    /* Редактирование курса*/
    void getEditCourse(Course course1){
        course = course1;
    }

    /* Редактирование имени курса */
    void editCoursename(String coursename) {
        course.editName(coursename);
    }

    /* Редактирование учителя */
    void editCourseTeacher(Teacher teacher){
        course.editTeacher(teacher);
    }

    /* Редактирование студента*/
    void editStudent(Student student1) {
        student = student1;
    }

    /* Редактирование имени студента*/
    void editFirstStudentName(String studentfirstname) {
        student.editFirstName(studentfirstname);
    }

    /* Редактирование фамилии студента */
    void editLastStudentName(String studentlastname) {
        student.editLastName(studentlastname);
    }

    public boolean equals(Object obj) {
        System.out.printf(" equals StudentCourse");
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        StudentCourse other = (StudentCourse) obj;
        if (!course.equals(other.course)) {
            return false;
        }
        if (!student.equals(other.student)) {
            return false;
        }
        return true;}

    public int hashCode() {
        String courseName = course.getCoursename();
        String studentLogin = student.getLogin();
        int hashCode1 = courseName.hashCode() + studentLogin.hashCode();
  //      System.out.printf(" hashcode StudentCourse" + hashCode1+ "\n");
        return  hashCode1;
    }
}

