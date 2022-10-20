package us.mattgreen;

import java.util.Scanner;

public class Animal implements Talkable {

    /*  Part 2
      In your project, create a class that does the following:

      Ask the user what type of animal they want to create
      Accept the input(s) necessary to instantiate that type of object
      Create an object of that type
      Add the object to the ArrayList
      Hint: Pass the list to the user input-gathering object.

      This class should use decisions and exceptions to verify that the user has entered data of the correct type.

      In Main.java, find the three lines surround by comments.

      Replace these three lines with code that does the following:

      Instantiate an object of your user input-gathering class
      Use that object to add an object to the list*/
    Scanner keyboard = new Scanner(System.in);

    Dog dog;
    Cat cat;
    Teacher teacher;
    String animal;

    public Object create () {

        System.out.println("What kind of animal would you like to create");
        animal = keyboard.nextLine();

        if (animal.equals("teacher")) {

            System.out.println("enter a teacher name: ");
            String name = keyboard.nextLine();
            System.out.println(" enter age: ");
            int age = Integer.parseInt(keyboard.nextLine());
            teacher = new Teacher(age, name);

            return teacher;
        } else if (animal.equals("cat")) {
            System.out.println("enter a cat name: ");
           String name = keyboard.nextLine();
            System.out.println("enter mouses killed: ");
            int killed = Integer.parseInt(keyboard.nextLine());
            cat = new Cat(killed, name);

            return cat;

        } else if (animal.equals("dog")) {
            System.out.println(" enter a dog name: ");
            String name = keyboard.nextLine();
            System.out.println(" is dog friendly enter true or false  ");
            Boolean friendly = Boolean.parseBoolean(keyboard.nextLine());
            dog = new Dog(friendly, name);

            return dog;
        } else  return null;






}

    @Override
    public String talk() {
        if (animal.equals("dog"))
            return dog.talk();
        else if (animal.equals("cat"))
            return cat.talk();
        else if (animal.equals("teacher")) {
            return teacher.talk();

        } else return null;
    }

    @Override
    public String getName() {
        if (animal.equals("dog"))
            return dog.getName();
        else if (animal.equals("cat"))
            return cat.getName();
        else if (animal.equals("teacher")) {
            return teacher.getName();

        } else return null;
    }
}

