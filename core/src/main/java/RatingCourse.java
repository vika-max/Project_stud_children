
import java.util.HashMap;
import java.util.Map;


public class RatingCourse {

    StudentCourse studentCourse;

    Map<String, Rating> studentTable = new HashMap<>();

    RatingCourse(Student student1, Course course1) {
        studentCourse = new StudentCourse(student1, course1);
    }

    /* Функция, которая меняет курс
    * */
    void editStudentCourse(StudentCourse studentCourse1) {
        studentCourse = studentCourse1;
    }

    /* Функция, которая меняет имя курса - исправление опечатки
    * */
    void editCourseName(String studentname) {
        studentCourse.editCoursename(studentname);
    }

    /* Функция, которая меняет учителя - исправление опечатки
    * */
    void editTeacher(Teacher teacher) {
        studentCourse.editCourseTeacher(teacher);
    }

    /* Функция которая возвращает студент-курс
     * */
    StudentCourse getStudentCourse(){
        return studentCourse;
    }

    /* Функция, которая возвращает массив оценок
     * */
    public Map<String, Rating> getRatingTable() {
        return studentTable;
    }

  /*  public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        RatingCourse other = (RatingCourse) obj;
        if (!studentCourse.equals(other.studentCourse)) {
            return false;
        }
        if (!studentTable.equals(other.studentTable)) {
            return false;
        }
        return true;}*/


}