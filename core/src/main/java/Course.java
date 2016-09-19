
public class Course {
        String name;
        Teacher teacher;

        Course(String name1) {
            name = name1;
        }

        String getName() {
            return name;
        }
        void setTeacher(Teacher teacher1){
            teacher = teacher1;
        }

        Teacher getTeacher(){
            return teacher;
        }
}
