import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import static org.junit.Assert.*;

public class StudentInputTest {

    AccessDAO userDataBase = new AccessDAO();

    @Before
    public void init() {
        /* Для того, чтобы студент и учитель и курс были в базе анных их должен администратор добавить*/
        String login = "student1";
        String coursename = "Mexanica";
        Administrator admin = userDataBase.admin;
        Student student = userDataBase.addInStudentTableAndReturn( "student1", "123", "Petja", "Ivanov");
        Teacher teacher = userDataBase.addInTeacherTableAndReturn( "teacher1", "111", "Lidia", "Sidorova");

        userDataBase.addInCourseTable(coursename);
        userDataBase.addStudentCourse(student.getLogin(),coursename);



        /* C*/

    /*    student.addCourse(userDataBase.searchCourse(coursename));
        Course course = userDataBase.searchCourse(coursename);
        course.addRatingStudent(student, "Homework", 4);
*/
        System.out.println("Before");
    }

    @After
    public void fini() {
        // userStorage.clear();
        System.out.println("After");
    }

    @Test
    /* Имитация входа студента - "тип уже проверили"*/
    public void testStudentCourse() {

        String login = "student1";

        Student student1 = (Student) userDataBase.getUserInUserTable(login);

        String coursename = "Mexanica";
        Course course = userDataBase.getCourse(coursename);

        Map<String, Course> courseMap = userDataBase.getStudentCourseMap(student1);

        Course course1 = courseMap.get(coursename);

        assert(course1.equals(course));

    }
}