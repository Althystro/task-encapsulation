public class Student {

    private double gpa;
    private String name;
    private int age;


    public Student(String name, int age, double gpa) {
        setName(name);
        setAge(age);
        setGpa(gpa);
    }

    @Override
    public String toString() {
        return "Student{" +
                "gpa=" + gpa +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGpa() {
        if (gpa >= 3) {
            return "Excellent!";
        } else if (gpa < 3 && gpa >= 2) {
            return "Good";
        } else {
            return "Needs Improvement ";
        }

    }

    public void setGpa(double gpa) {
        if (gpa < 0.0) {
            gpa = 0.0;
            this.gpa = gpa;

            System.out.println("Error gpa is out of limits");
        } else if (gpa > 4.0) {
            gpa = 0.0;
            this.gpa = gpa;

            System.out.println("Error gpa is out of limits");

        } else {
            this.gpa = gpa;
        }


    }
}
