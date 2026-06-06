//Calculator using overloading
class Calculator {

    int add(int a, int b) {
        return a+b;
    }

    int add(int a, int b, int c) {
        return a+b+c ;
    }

    double add(double a, double b) {
        return a+b ;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(10,20));      //30
        System.out.println(calc.add(10,20,30));   //60
        System.out.println(calc.add(10.5,20.5));   //31.0
    }
}

//overriding
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();

        Dog d = new Dog();
        d.sound();

        Animal obj = new Dog(); // Runtime Polymorphism
        obj.sound();
    }
}
