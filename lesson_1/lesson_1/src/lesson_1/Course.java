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
        result = "������: " +team.getTeamName()+ " " + '\n';
        for (Person person: team.getPeoples()) {
            result += "��� ���������: " +person.getName()+ " " + '\n';
            testRun(person.getCanRunMeters());
            testJumping(person.isCanJump());
            testMelting(person.getCanSwimMeters());
        }
        return result;
    }
    private void testRun(int value) {
        if (value >= run) result += "��� - �������� " + '\n';
    }
    private void testJumping(boolean value) {
        if (value) result += "������ � ������������� - �������� " + '\n';
    }
    private void testMelting(int value) {
        if (value >= melting) result += "�������� - �������� " + '\n';
    }

    public void showResults() {
        System.out.println(result);
    }
}
