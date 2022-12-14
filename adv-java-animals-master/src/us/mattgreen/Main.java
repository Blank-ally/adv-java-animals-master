package us.mattgreen;

import java.util.ArrayList;

public class Main {

    /*Part 1
Using IntelliJ, clone the repository at https://github.com/oroborous/adv-java-animals.git (Links to an external site.)

Run the program. What does it do?

Using IntelliJ, create a repository in youre GitHub  that contains the project

Part 2
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

    private final static FileOutput outFile = new FileOutput("animals.txt");
    private final static FileInput inFile = new FileInput("animals.txt");

    public static void main(String[] args) {
        ArrayList<Talkable> zoo = new ArrayList<>();

        Animal teacher  = new Animal();
        Animal cat  = new Animal();
        Animal dog  = new Animal();
        dog.create();
        cat.create();
        teacher.create();



        // Lines to Replace Begin Here
        try {
            zoo.add(dog);
            zoo.add(cat);
            zoo.add(teacher);
        } catch (NullPointerException ex){}
        // End Lines to Replace

        for (Talkable thing : zoo) {
            printOut(thing);
        }
        outFile.fileClose();
        inFile.fileRead();
        inFile.fileClose();

        FileInput indata = new FileInput("animals.txt");
        String line;
        while ((line = indata.fileReadLine()) != null) {
            System.out.println(line);
        }
    }

    public static void printOut(Talkable p) {
        System.out.println(p.getName() + " says=" + p.talk());
        outFile.fileWrite(p.getName() + " | " + p.talk());
    }
}
