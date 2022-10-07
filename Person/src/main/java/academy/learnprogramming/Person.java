package academy.learnprogramming;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        if ((age >= 0) && (age <= 100)){
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return ((age > 12) && (age < 20));
    }

    public String getFullName() {
        String fullName = "";

        if (!firstName.isEmpty() && !lastName.isEmpty()) {
            fullName = (firstName.trim().concat(" ").concat(lastName).trim());
        } else if (firstName.isEmpty() && !lastName.isEmpty()) {
            fullName = lastName.trim();
        } else if (!firstName.isEmpty() && lastName.isEmpty()) {
            fullName = firstName.trim();
        }

        return fullName;
    }
}
