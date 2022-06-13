package lesson_1;
/* �������� ����� Team, ������� ����� ���������:
�������� �������;
������ �� ������� ���������� � � ������������ ����� ����� ���� ���������� ���������);
����� ��� ������ ���������� � ������ �������, ��������� ���������;
����� ������ ���������� ��� ���� ������ �������.
3. �������� ����� Course (������ �����������), � ������� ����� ����������:
������ �����������;
�����, ������� ����� ������� ������� ������ ��� ������.
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

