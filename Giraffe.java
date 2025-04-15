public class Giraffe extends Animal {
    public Giraffe(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A giraffe arrives.");
    }

    @Override
    public void eat() {
        System.out.println("The giraffe is eating " + food);
    }

    @Override
    public void speak() {
        hum();
    }

    private void hum() {
        System.out.println("The giraffe hums.");
    }
}
