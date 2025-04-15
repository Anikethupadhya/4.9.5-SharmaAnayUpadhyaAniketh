public class Gorilla extends Primate {
    public void grunt() {
        System.out.println("The gorilla grunts.");
    }

    @Override
    public void speak() {
        grunt();
    }
}
