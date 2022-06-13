package lesson_1;

public class Person {
    private String name;
    private int canRunMeters;
    private boolean canJump;
    private int canSwimMeters;


    public Person(String name, int canRunMeters, boolean canJump, int canSwimMeters) {
        this.name = name;
        this.canRunMeters = canRunMeters;
        this.canJump = canJump;
        this.canSwimMeters = canSwimMeters;
    }

    public String getName() {
        return name;
    }

    public int getCanRunMeters() {
        return canRunMeters;
    }

    public boolean isCanJump() {
        return canJump;
    }

    public int getCanSwimMeters() {
        return canSwimMeters;
    }
}
