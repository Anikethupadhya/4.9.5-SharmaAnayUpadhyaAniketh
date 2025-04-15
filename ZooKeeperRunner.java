import java.util.ArrayList;

public class ZooKeeperRunner {
    public static void main(String[] args) {
        ArrayList<Animal> zoo = new ArrayList<>();
        zoo.add(new Deer());
        zoo.add(new Giraffe("leaves", false, 25.0));
        zoo.add(new Gorilla());
        zoo.add(new Hippo());

        hearTheAnimal(zoo.get(0));
        hearTheAnimal(zoo.get(1));
        hearTheAnimal(zoo.get(2));
        hearTheAnimal(zoo.get(3));
    }

    public static void hearTheAnimal(Animal currentAnimal) {
        currentAnimal.speak();
    }
}
