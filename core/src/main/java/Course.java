public class Course {
        String courseName;
        Teacher teacher;
        Course(String name1) {
            courseName = name1;
        }

    /* Редакторование именя курса */
    void editName(String coursename1) {
        courseName = coursename1;
    }

    /* Редакторование или добавление учителя */
    void editTeacher(Teacher teacher1) {
        teacher = teacher1;
    }

    /* Получение именя курса */
    String getCoursename(){
        return  courseName;
    }
    /* Получение учителя по курсу*/
    Teacher getTeacher(){
        return teacher;
    }

    String getName() {
        return courseName;
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Course other = (Course) obj;
        if (!courseName.equals(other.courseName)) {
            return false;
        }
        if (!teacher.equals(other.teacher)) {
            return false;
        }
        return true;}

    public int hashCode() {
        int hashCode1 = courseName.hashCode();
        return hashCode1;
    }

}
