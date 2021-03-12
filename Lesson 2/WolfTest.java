public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        System.out.println("Кличка - " + wolfOne.name);
        System.out.println("Окрас - " + wolfOne.color);
        System.out.println("Возраст - " + wolfOne.age);
        wolfOne.run();
        wolfOne.hunt();
    }
}