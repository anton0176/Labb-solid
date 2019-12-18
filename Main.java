package sample;


public class Main   {

    public static void main(String[] args) {

        Animal[] animals = {new Dog("Black"),
                            new Hedgehog("Pink"),
                            new Bird("Yellow"),
                            new Snake("Black and Yellow")};

        System.out.println("###############");
        System.out.println();

        for (Animal animal : animals) {
            activateAnimal(animal);
        }
    }

    private static void activateAnimal(Animal animal) {
        System.out.println();

        animal.eat();
        animal.sleep();
        animal.speak();
        animal.walk();
        animal.name();

        System.out.println(animal.getColor());


        System.out.println("###############");
        System.out.println();
    }


}
