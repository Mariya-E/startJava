public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.name = "Shiry";
        wolfOne.age = 3;
        wolfOne.color = "gray";
        System.out.println("Кличка - " + wolfOne.name + " , возраст - " + wolfOne.age + " , окрас - " + wolfOne.color);
        wolfOne.run();
        wolfOne.hunt();
    }
}