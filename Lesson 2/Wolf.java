public class Wolf {

    String name = "Shiry";
    String animalGender = "male";
    String color = "gray";
    float weight = 87.5f;
    int age = 5;

    boolean sit() {
        System.out.println("Волк сидит!");
        return true;
    }

    void walk() {
        System.out.println("Волк идет!");
    }

    String howl() {
        return "выть";
    }

    void run() {
        System.out.println("Волк бежит!");
    }

    void hunt() {
        System.out.println("Волк охотится!");
    }
}