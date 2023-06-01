public class Cat {
    String name;
    int age;


    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", 5);
        Cat streetCatNameBob = new Cat("Bob");
    }
    public void meow () {
        System.out.println("Meow");
    }
}

