public class Person {

    String name = "Alex";
    String gender = "mens";
    float height = 1.85f;
    float weight = 71.5f;
    int age = 33;

    boolean sit() {
        Sistem.out.println("Вы сидите!");
        return true;
    }

    void walk() {
        Sistem.out.println("Вы идете!");
    }

    String studyJava() {
        return "учить Java";
    }

    void run() {
        Sistem.out.println("Вы бегаете!");
    }

    void speak() {
        
    }
}