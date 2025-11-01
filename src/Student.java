public class Student {
    String name;
    String surname;
    int age;

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public Student() {

    }

    public boolean equals(Student student) {
        if(student == null) {
            return false;
        }
        return this.name.equals(student.name) &&
                this.surname.equals(student.surname) &&
                this.age == student.age;
    }
    public void print() {
        System.out.println("Name" + this.name + " " +
                "Surname" + this.surname + " " +
                "Age" + this.age);
    }

}
