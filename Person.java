public class Person {

    private static long nextPersonId = 1l;

    private String firstName;
    private String lastName;
    private int age;
    private long id;

    public Person() {
        this.id = nextPersonId; //assiging the current id to the person
        nextPersonId++; //incrementing the class level id for next person
    }

    public long getId() {
        return id;
    }

    public java.lang.String getFirstName() {
        return firstName;
    }

    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100)
            this.age = 0;
        else
            this.age = age;
    }

    public boolean isTeen() {
        if (this.age > 12 && this.age < 20)
            return true;
        else
            return false;
    }

    public String getFullName() {
        String fullName = firstName + " " + lastName;
        if (firstName.isEmpty() && lastName.isEmpty()) {
            fullName = "";
        } else if (firstName.isEmpty()) {
            fullName = lastName;
        } else if (lastName.isEmpty()) {
            fullName = firstName;
        }
        return fullName;

    }

    @Override
    public java.lang.String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", String=" + lastName +
                ", age=" + age +
                '}';
    }

    public static void main(String... args) {
        Person p1 = new Person();
        p1.setFirstName("");
        p1.setLastName("");
        p1.setAge(10);
        System.out.println("full name of p1: " + "|" + p1.getFullName() + "|");
        System.out.println("is p1 a teen? " + p1.isTeen());
        p1.setFirstName("John");
        p1.setAge(18);
        System.out.println("full name of p1: " + "|" + p1.getFullName() + "|");
        System.out.println("is p1 a teen? " + p1.isTeen());
        p1.setLastName("Smith");
        System.out.println("full name of p1: " + "|" + p1.getFullName() + "|");
        System.out.println("id of this perosn: " + p1.getId());
        System.out.println("How may total persons are created: " + (Person.nextPersonId - 1));

        Person p2 = new Person();
        System.out.println("How may total persons are created: " + (Person.nextPersonId - 1));

    }
}
