public class TestAnimalsApp {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Cat cat = new Cat();
        Spider spider = new Spider();

        System.out.println("FISH");
        fish.setName("MIMI");
        System.out.println("This fish's name is " + fish.getName());
        fish.eat();
        fish.walk();
        fish.setName("MOMO");
        System.out.println("This fish's name is " + fish.getName());

        System.out.println("CAT");
        cat.setName("FLUFFY");
        System.out.println("This cat's name is " + cat.getName());
        cat.eat();
        cat.walk();
        cat.setName("MOOSE");
        System.out.println("This cat's name is " + cat.getName());

        System.out.println("SPIDER");
        spider.walk();
        spider.eat();
    }
}



abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public abstract void eat();

    public void walk() {
        System.out.println("This animal walks on " + legs + " legs");
    }
}

class Spider extends Animal {
    public Spider() {
        super(8); 
    }

    @Override
    public void eat() {
        System.out.println("Spider eats insects.");
    }
}

interface Pet {
    String getName();  

    void setName(String name);

    void play();
}

class Cat extends Animal implements Pet {
    private String name;

    public Cat(String name) {
        super(4); 
        this.name = name;
    }

    Cat() {
        this("Unknown");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats fishes.");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void play() {
        System.out.println("The cat is playing.");
    }
}

class Fish extends Animal implements Pet {
    private String name;

    public Fish() {
        super(0); 
    }

    public void play() {
        System.out.println("The fish is playing.");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Fish eat plants.");
    }

    @Override
    public void walk() {
        System.out.println("Fish has no legs.");
    }
}

