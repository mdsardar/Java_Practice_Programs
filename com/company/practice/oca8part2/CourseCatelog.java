package practice.com.company.practice.oca8part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.simple.parser.ParseException;

class CourseCatalog {
    Map<String, List<Course>> catalog;

    public CourseCatalog() {
        catalog = new HashMap<>();
        initializeJavaCourses();
    }

    public static void main(String[] args) {
        CourseCatalog catalog = new CourseCatalog();
        catalog.printCoursesByTopic("Java");
    }

    private void initializeJavaCourses() {
        Course spring = new Course("Spring");
        Course maps = new Course("Maps");
        Course lambdas = new Course("Lambdas");
        List<Course> javaCourses = new ArrayList<>(Arrays.asList(spring, maps, lambdas));
        catalog.put("Java", javaCourses);
    }

    public void printCoursesByTopic(String topic) {

        for (Map.Entry<String, List<Course>> t : catalog.entrySet()) {
            if (topic.equalsIgnoreCase(t.getKey()))
                System.out.print(t.getKey() + " : " + t.getValue());

        }

        byte b = Byte.parseByte("127");
        System.out.println(" " + b);

        /*catalog.entrySet().forEach(i -> {
            if (i.getKey().equals(topic))
                System.out.print(i);
        });*/
    }
}

