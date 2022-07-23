package lesson_8;


import lesson.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Fact {
    private int temp;
    private String condition;

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public String getCondition() {
        switch (this.condition){
            case "overcast":
                condition = "��������";
                break;
            case "clear":
                condition = "����";
                break;
            case "rain":
                condition = "�����";
                break;
            case "cloudy":
                condition = "������� � ������������";
                break;
            case "partly-cloudy":
                condition = "�����������";
                break;
            default:
                break;
        }
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}