public class ClassAndObject {
    String name;
    int age;

    void display() {
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        ClassAndObject student = new ClassAndObject();
        student.name = "Sushil";
        student.age = 25;
        student.display();
    }
}
