public class Deer extends Animal {
    public Deer() {
        System.out.println("A deer arrives.");
    }

    public Deer(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A deer arrives.");
    }

    @Override
    public void speak() {
        System.out.println("The deer bleats.");
    }
}
