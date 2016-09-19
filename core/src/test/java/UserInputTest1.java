
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserInputTest1 {
    /** Тест входа пользователей:
     * 1. Учащийся (Правильный логин)
     * 2. Учитель (Правильный логин)
     * 3. Администратор (Правильный логин)
     * 4. Пользователь (Неправильный логин)
     * 5. Пользователь (Правильный пароль)
     * 6. Пользователь (Неправильный пароль)
     */
    DataBase userDataBase = new DataBase();

    @Before
    public void init() {
        userDataBase.add("Petja", "Ivanov", "student1", "123",UserType.TYPE_STUDENT);
        userDataBase.add("Lidia", "Sidorova", "teacher1", "111",UserType.TYPE_TEACHER);
        System.out.println("Before");
    }

    @After
    public void fini() {
       // userStorage.clear();
        System.out.println("After");
    }


    @Test
    public void testInputStudentLoginRight() {
        System.out.println("testInputStudentLoginRight");

        // 1. Проверка студента
        String login = new String("student1");
        String password = new String("123");

        User user = userDataBase.search(login);
        assertNotNull(user);
        assertEquals(user.getType() , UserType.TYPE_STUDENT);

    }

    @Test
    public void testInputTeacherLoginRight()  {
        System.out.println("testInputTeacherLoginRight");

        // 2. Проверка учитель

        String login = new String("teacher1");
        String password = new String("111");

        User user = userDataBase.search(login);
        assertNotNull(user);

        assertEquals(user.getType(), UserType.TYPE_TEACHER);

    }

    @Test
    public void testInputAdministratorLoginRight(){
        System.out.println("testInputAdministratorLoginRight");

        // 3. Проверка администратор
        String login = new String("admin");
        String password = new String("admincourse");

        User user = userDataBase.search(login);
        assertNotNull(user);
        assertEquals(user.getType(), UserType.TYPE_ADMINISTRATOR);

    }

    @Test
    public void testInputLoginUnRight() {
        System.out.println("testInputLoginUnRight");

        String login = new String("student");
        String password = new String("123");

        User user = userDataBase.search(login);
        assertNull(user);
    }


    @Test
    public void testInputPasswordRight() {
        System.out.println("testInputPasswordRight");

        String login = new String("student1");
        String password = new String("123");

        User user = userDataBase.search(login);
        assertNotNull(user);

        assertEquals(user.getPassword(), password);
    }


    //-------------------------------------------
    @Test
    public void testInputPasswordUnRight() {
        System.out.println("testInputPasswordUnRight");

        String login = new String("student1");
        String password = new String("111");

        User user = userDataBase.search(login);
        assertNotNull(user);

        assertNotEquals(user.getPassword(), password);
    }


}