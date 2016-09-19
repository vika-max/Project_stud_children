import java.util.HashMap;
import java.util.Map;


public class CourseMap {
    Map<String, Course> users = new HashMap<>();

    void add(Course course) {
        users.put(course.getName(), course);
    }

}

