package lesson_1;

public class Main {
    public static void main(String[] args) {
        Person[] person = new Person[4];
        person[0] = new Person("����", 1000, true, 500);
        person[1] = new Person("����", 10000, true, 1000);
        person[2] = new Person("����", 500, false, 0);
        person[3] = new Person("����", 1000, false, 50);

        Team team = new Team("�����", person);

        Course course = new Course(10000, 100, 1000);
        course.doIT(team);
        course.showResults();
    }
}
