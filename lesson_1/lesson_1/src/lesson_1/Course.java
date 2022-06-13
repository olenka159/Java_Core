package lesson_1;

public class Course {
    private String result;
    private int run;
    private int jumping;
    private int melting;

    public Course(int run, int jumping, int melting) {
        this.run = run;
        this.jumping = jumping;
        this.melting = melting;
    }

    public String doIT(Team team){
        result = "Группа: " +team.getTeamName()+ " " + '\n';
        for (Person person: team.getPeoples()) {
            result += "имя участника: " +person.getName()+ " " + '\n';
            testRun(person.getCanRunMeters());
            testJumping(person.isCanJump());
            testMelting(person.getCanSwimMeters());
        }
        return result;
    }
    private void testRun(int value) {
        if (value >= run) result += "Бег - пройдено " + '\n';
    }
    private void testJumping(boolean value) {
        if (value) result += "Прыжки с препятствиями - пройдено " + '\n';
    }
    private void testMelting(int value) {
        if (value >= melting) result += "Плавание - пройдено " + '\n';
    }

    public void showResults() {
        System.out.println(result);
    }
}
