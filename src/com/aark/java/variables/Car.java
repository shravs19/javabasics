package com.aark.java.variables;

public class Car {
	
    public void start() {
        System.out.println("starting tesla engine...");
    }
    public void stop() {
        System.out.println("stopping tesla engine...");
    }

     
    // class called dogclass
    public class dogClass {

    // this is the method to run
    public static void run() {
    //System.out.println("My Dog is running");
    }

    // this is the method to bark
    public static void bark() {
    //System.out.println("My Dog is barking");
    }

    // this is the method to sleep
    public static void sleep() {
    //System.out.println("My Dog is sleeping");
    }

    // this is the method to eat
    public static void eat() {
    System.out.println("My Dog is eating");
    System.out.println("My Dog is sleeping");
    System.out.println("My Dog is barking");
    System.out.println("My Dog is running");
    }



    // this is the method declaration for the dog class
    public static void main(String[] args) {
    dogClass.sleep();
    System.out.println("This is my dog");
    dogClass.bark();
    dogClass.eat();
    dogClass.run();
    //dogClass.main(args);

    }

    }
    
    
    public static void main(String a[]) {
    	Car tesla = new Car();
    	tesla.start();
    	tesla.stop();
    }
}
