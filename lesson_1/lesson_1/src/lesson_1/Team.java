package lesson_1;
/* Добавить класс Team, который будет содержать:
название команды;
массив из четырех участников — в конструкторе можно сразу всех участников указывать);
метод для вывода информации о членах команды, прошедших дистанцию;
метод вывода информации обо всех членах команды.
3. Добавить класс Course (полоса препятствий), в котором будут находиться:
массив препятствий;
метод, который будет просить команду пройти всю полосу.
 */

public class Team {
    private String teamName;
    private Person[] peoples;

    public Team(String teamName, Person[] peoples) {
        this.teamName = teamName;
        this.peoples = peoples;
    }

    public String getTeamName() {
        return teamName;
    }

    public Person[] getPeoples() {
        return peoples;
    }

    public void setPeoples(Person[] peoples) {
        this.peoples = peoples;
    }
}

