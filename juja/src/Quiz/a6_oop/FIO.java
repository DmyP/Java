package Quiz.a6_oop;

public class FIO {
    private String firstName;
    private String secondName;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void set(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String toString() {
        return firstName + "." + secondName;
    }
}