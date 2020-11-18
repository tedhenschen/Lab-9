/*
@author Ted Henschen
@version 11/17/2020
create a Person object that can store a name, age, and color and an ArrayList full of Person objects, then add the data from the ArrayList into a file, then read that file by printing it out.
*/

import java.io.*;
import java.util.ArrayList;
class Main {

  static ArrayList<Person> people;
  static FileReader myFile;

  public static void main(String[] args) {

    //Add five new Person objects to your people ArrayList. The first Person added should be you - your name, age, and favorite color. Then add the four other Person objects as shown above (A/B/C/D, their ages, and colors).
    people = new ArrayList<Person>();
    people.add(new Person("Ted",31,"Red"));
    people.add(new Person("A",87,"Pink"));
    people.add(new Person("B",13,"Yellow"));
    people.add(new Person("C",55,"Black"));
    people.add(new Person("D",4,"Green"));

    //Start your "try" block
    try{
      //Declare a new FileWriter object and initialize it to a new FileWriter with the filename data.txt
      FileWriter toWriteFile; 
      toWriteFile = new FileWriter("data.txt"); 
      //Declare a new BufferedWriter object and initialize it to use the FileWriter object you just created
      BufferedWriter output = new BufferedWriter(toWriteFile); 
      //Using a loop, go through your people ArrayList and add each person's name, age, and color to the file. Make sure to convert the age to a String. Make sure to flush the output at the end of each iteration through the loop. (Hint: this is VERY similar to the walkthrough code in our video.)
      for(int i=0; i<people.size();i++){
        output.write(people.get(i).getName()); 
        output.newLine();
        output.write(Integer.toString(people.get(i).getAge())); 
        output.newLine();
        output.write(people.get(i).getColor()); 
        output.newLine();
        output.flush();
        //End your "try" block
      }
      //Close the BufferedWriter object
      toWriteFile.close();
    }
    //Add in your "catch" block using an IOException and print out the exception.
    catch(IOException exception){
      System.out.println("An error occurred: " + exception);
    }

    /**
      Now, we will read from the file we just created.
      Start your "try" block
    */
    try{
      //Declare and initialize a FileReader object that opens up the data.txt file
      FileReader myFile = new FileReader("data.txt");
      //Declare and initialize a BufferedReader object that uses the FileReader object you just created
      BufferedReader reader = new BufferedReader(myFile);
      //Using a while loop, loop through each line of your BufferedReader object
      String name = "First Name", age = "Age", color = "Favorite Color";
      System.out.printf("%-25s %-20s %-20s %n", name, age, color);
      while(reader.ready()){
        //Capture the name, age, and color in variables by reading in the line from the BufferedReader object.
        name = reader.readLine();
        age = reader.readLine();
        color = reader.readLine();
        //Using System.out.printf, left justified for everything and 10 characters for everything, print out the name, age, and favorite color of the lines you just read in
        System.out.printf("%-10s %-10s %-10s %n", name, age, color);
      }
      //After your loop is completely done, close your BufferedReader object and close your "try" block
      reader.close();
    }
    //Add in your "catch" block using an IOException and print out the exception
    catch(IOException exception){
      System.out.println("An error occurred: " + exception);
    }

  }
}