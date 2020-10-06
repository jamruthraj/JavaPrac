public class myPerson1 {
    private String firstName, lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String LastName) {
        this.lastName = LastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 100 || age < 0)
            this.age = 0;
        else
            this.age = age;
    }

    public boolean isTeen() {
        if (age > 12 && age < 20)
            return true;
        return false;
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty())
            return "";
        else if (firstName.isEmpty())
            return lastName;
        else if (lastName.isEmpty())
            return firstName;
        else
            return firstName + " " + lastName;
    }
}
