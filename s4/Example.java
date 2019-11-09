public class Example {

    public static void main(String args[]) {

        Person student1 = new Person("Josh", 30);
        Person student2 = new Person("Sandie", 30);
        Person student3 = new Person("Gill", 30);
        Person student4 = new Person("Matt", 30);
        Animal animal1 = new Animal("Nala", "Cat");
        Animal animal2 = new Animal("Fido", "Dog");
        Animal animal3 = new Animal("Mittens", "Lion");
        Animal animal4 = new Animal("Squeekers", "Squirrel");

        animal1.attacks(student1.getName());
        animal2.attacks(student2.getName());
        animal3.attacks(student3.getName());
        animal4.attacks(student4.getName());

        student1.printP();
        student2.printP();
        student3.printP();
        student4.printP();

        student1.sayHello(student2.getName());

    }

}