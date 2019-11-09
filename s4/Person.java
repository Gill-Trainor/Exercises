public class Person {
    // atributes
    public String name;
    public int age;

    // constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // methods
    public void setName(String name) {

        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void sayHello(String friend) {
        System.out.println("Hello " + friend);
    }

    public void printP() {
        System.out.println(this.name);
        System.out.println(this.age);

    }

    public int getAge() {
        return this.age;
    }
}