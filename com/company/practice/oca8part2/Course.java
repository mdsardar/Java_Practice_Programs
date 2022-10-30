package practice.com.company.practice.oca8part2;

public class Course {
    private String topic;

    public Course(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return topic;
    }
}
