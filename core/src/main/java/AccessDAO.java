import java.util.HashMap;
import java.util.Map;

/**
 * Created by root on 21.09.16.
 */
/*Реализованные методы
*   - Добавление студента
*   - Добавление студента и возвращение его
*   - Удаление студента
*   - Редактирование студента общий случай
*   - Редакторование логина студента
*   - Редакторование пароля студента
*   - Редакторование имени студента
*   - Редакторование фамилии студента
*   - Получение пароля студента логину
*   - Получение имени студента по логину
*   - Получение фамилии студента по логину
*   - Получение студента по логину
*   - Добавление учителя
*   - Добавление учителя и возвращение его
*   - Удаление учителя
*   - Редактирование учителя общий случай
*   - Редакторование логина учителя
*   - Редакторование пароля учителя
*   - Редакторование имени  учителя
*   - Редакторование фамилии учителя
*   - Получение пароля учителя по логину
*   - Получение имени учителя  по логину
*   - Получение фамилии учителя по логину
*   - Получение учителя по логину
*   - Добавление курса
*   - Добавление курса и возращение его
*   - Редактирование курса
*   - Изменения учителя на курс
*   - Удаление курса
*   - Записать студента на курс "по ключам"
*   - Получить список оценок по заданному курсу заданного  студента
*   - Получить список курсов студента
*   - Получить список группы
*   - Возвращение user в таблице User по логину
* */

/* Предусмотреть рекурсивное удаление из таблиц и изменение логина*/

public class AccessDAO {

    AccessDAO(){
        useTable.put(admin.getLogin(), admin);
    }
    /* Таблица курсов */
    Map<String, Course> courseTable = new HashMap<>();
    /* Таблица учеников - ключ логин */
    Map<String, Student> studentTable = new HashMap<>();
    /* Таблица учителей - ключ логин*/
    Map<String, Teacher> teacherTable = new HashMap<>();

    Administrator admin = new Administrator();

    /* Таблица упеваемости Успеваемость(Курс, студент) */
    Map<StudentCourse, RatingCourse> ratingCourseTable = new HashMap<>();

    /* Сборная таблица паролей и логинов учителей и учеников (Временная?
     или меняющееся с добавлением нового студента или ученика
      ключ логин*/
    Map<String, User> useTable = new HashMap<>();

    /* Добавление студента */
    void addInStudentTable(String login, String password, String firstname, String lastname) {
        Student student = new Student(login, password, firstname, lastname);
        studentTable.put(login, student);
        useTable.put(login, student);
    }

    /* Добавление студента и вовращение его */
    Student addInStudentTableAndReturn(String login, String password, String firstname, String lastname) {
        Student student = new Student(login, password, firstname, lastname);
        studentTable.put(login, student);
        useTable.put(login, student);
        return student;
    }

    /* Удаление студента */
    void deleteInStudentTable(String login) {
        studentTable.remove(login);
        useTable.remove(login);
    }

    /* Редактирование студента общий случай*/
    void editInStudentTable(String oldlogin, String newlogin, String password, String firstname, String lastname) {
        Student student1 = studentTable.get(oldlogin);
        student1.editStudent(newlogin, password, firstname, lastname);
    }

    /* Редакторование логина студента */
    void editLoginStudent(String oldlogin, String newlogin) {
        Student student = studentTable.get(oldlogin);
        studentTable.remove(oldlogin);
        student.editLogin(newlogin);
        studentTable.put(newlogin, student);
    }

    /* Редакторование пароля студента */
    void editPasswordStudent(String login, String password) {
        Student student = studentTable.get(login);
        student.editPassword(password);
    }

    /* Редакторование имени студента */
    void editFirstNameStudent(String login, String firstname) {
        Student student = studentTable.get(login);
        student.editFirstName(firstname);
    }

    /* Редакторование фамилии студента */
    void editLastNameStudent(String login, String lastname) {
        Student student = studentTable.get(login);
        student.editLastName(lastname);
    }

    /* Получение пароля студента логину */
    String getPasswordStudent(String login) {
        Student student = studentTable.get(login);
        return student.getPassword();
    }

    /* Получение имени студента по логину */
    String getFirstNameStudent(String login) {
        Student student = studentTable.get(login);
        return student.getFirstname();
    }

    /* Получение фамилии студента по логину */
    String getLastNameStudent(String login) {
        Student student = studentTable.get(login);
        return student.getLastname();
    }

    /* Получение студента по логину*/
    Student getStudent(String login) {
        return studentTable.get(login);
    }

    /* Добавление учителя */
    void addInTeacherTable(String login, String password, String firstname, String lastname) {
        Teacher teacher = new Teacher(login, password, firstname, lastname);
        teacherTable.put(login, teacher);
        useTable.put(login, teacher);
    }
    /* Добавление учителя и возвращения его */
    Teacher addInTeacherTableAndReturn(String login, String password, String firstname, String lastname) {
        Teacher teacher = new Teacher(login, password, firstname, lastname);
        teacherTable.put(login, teacher);
        useTable.put(login, teacher);
        return  teacher;
    }

    /* Удаление учителя */
    void deleteInTeacherTable(String login) {
        teacherTable.remove(login);
        useTable.remove(login);
    }

    /* Редактирование учителя общий случай */
    void addInTeacherTable(String oldlogin, String newlogin, String password, String firstname, String lastname) {
        Teacher teacher1 = teacherTable.get(oldlogin);
        teacher1.editTeacher(newlogin, password, firstname, lastname);
    }

    /* Редакторование логина учителя */
    void editLoginTeacher(String oldlogin, String newlogin) {
        Teacher teacher = teacherTable.get(oldlogin);
        teacher.editLogin(newlogin);
        teacherTable.remove(oldlogin);
        teacher.editLogin(newlogin);
        teacherTable.put(newlogin, teacher);
    }

    /* Редакторование пароля учителя */
    void editPasswordTeacher(String login, String password) {
        Teacher teacher = teacherTable.get(login);
        teacher.editPassword(password);
    }

    /* Редакторование имени  учителя */
    void editFirstNameTeacher(String login, String firstname) {
        Teacher teacher = teacherTable.get(login);
        teacher.editFirstName(firstname);
    }

    /* Редакторование фамилии учителя */
    void editLastNameTeacher(String login, String lastname) {
        Teacher teacher = teacherTable.get(login);
        teacher.editLastName(lastname);
    }

    /* Получение пароля учителя по логину*/
    String getPasswordTeacher(String login) {
        Teacher teacher = teacherTable.get(login);
        return teacher.getPassword();
    }

    /* Получение имени учителя  по логину*/
    String getFirstNameTeacher(String login) {
        Teacher teacher = teacherTable.get(login);
        return teacher.getFirstname();
    }

    /* Получение фамилии учителя по логину */
    String getLastNameTeacher(String login) {
        Teacher teacher = teacherTable.get(login);
        return teacher.getLastname();
    }

    /* Получение учителя по логину*/
    Teacher getTeacher(String login) {
        return teacherTable.get(login);
    }

    /* Добавление курса*/
    void addInCourseTable(String name) {
        Course course = new Course(name);
        courseTable.put(name, course);
    }

    /* Добавление курса и возвращение его */

    Course addInCourseTableAndReturn(String name)  {
        Course course = new Course(name);
        courseTable.put(name, course);
        return course;
    }

    /* Редактирование курса*/
    void editCourseInTable(String oldname, String newname) {
        Course course = courseTable.get(oldname);
        course.editName(newname);
    }
    /* Изменения учителя на курс */
    void editTeacherCourse(String name, Teacher teacher) {
        Course course = courseTable.get(name);
        course.editTeacher(teacher);
    }
    /* Удаление курса */
    void deleteInCourseTable(String name) {
        courseTable.remove(name);
    }

    /* Записать студента на курс "по ключам"*/
    void addStudentCourse(String login, String coursename) {
        Student student = studentTable.get(login);
        Course course = courseTable.get(coursename);
        RatingCourse ratingCourse = new RatingCourse(student, course);
        ratingCourseTable.put(ratingCourse.getStudentCourse(), ratingCourse);
    }

    /* Получить список оценок по заданному курсу заданного  студента*/

    public Map<String, Rating> getRatingMap(Course course, Student student) {
        StudentCourse studentCourse = new StudentCourse(student, course);
        RatingCourse ratingCourse = ratingCourseTable.get(studentCourse);
        return ratingCourse.getRatingTable();
    }

    /* Получить список курсов студента*/

    Map<String, Course> getStudentCourseMap(Student student) {
        Map<String, Course> courseMap = new HashMap<>();
        for (Map.Entry<String, Course> entry1 : courseTable.entrySet()) {
            StudentCourse studentCourse = new StudentCourse(student, entry1.getValue());

            if (ratingCourseTable.containsKey(studentCourse)) {
                RatingCourse ratingcourse = ratingCourseTable.get(studentCourse);
                StudentCourse studentCourse1 = ratingcourse.getStudentCourse();
                Course course = studentCourse1.getCourse();
                courseMap.put(course.getCoursename(), course);
            }
        }
        return courseMap;
    }

    /* Получить список группы */
    Map<String, Student> getCourseList(Course course1) {
        Map<String, Student> StudentMap = new HashMap<>();
        for (Map.Entry<String, Student> entry1 : studentTable.entrySet()) {
            StudentCourse studentCourse = new StudentCourse(entry1.getValue(), course1);
            if (ratingCourseTable.containsKey(studentCourse)) {
                RatingCourse ratingcourse = ratingCourseTable.get(studentCourse);
                StudentCourse studentCourse1 = ratingcourse.getStudentCourse();
                Student student = studentCourse.getStudent();
                StudentMap.put(student.getLogin(), student);
            }
        }
        return StudentMap;
    }

    /* Возвращение user в таблице User по логину */
    User getUserInUserTable(String login) {
        return useTable.get(login);
    }

    /*Получить курс по имени курса*/
    Course getCourse(String Course){
        return courseTable.get(Course);
    }


}

