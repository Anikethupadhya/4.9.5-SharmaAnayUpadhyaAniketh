public class Animal {
    protected String food;
    protected boolean nocturnal;
    protected double aveLifeSpan;

    public Animal() {
        System.out.println("An animal arrives.");
    }

    public Animal(String food, boolean nocturnal, double aveLifeSpan) {
        this.food = food;
        this.nocturnal = nocturnal;
        this.aveLifeSpan = aveLifeSpan;
        System.out.println("An animal arrives.");
    }

    public void eat() {
        System.out.println("The animal is eating.");
    }

    public void speak() {
        System.out.println("The animal makes a sound.");
    }
}
