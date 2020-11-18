/*
@author Ted Henschen
@version 11/17/2020
This is a class of a person object
*/

class Person{
  
  private String name;
  private int age;
  private String color;

  Person(){
    name = "";
    age = 0;
    color = "";
  }

  /**
  @param aName is the name of the person
  @param aAge is the age of the person
  @param aColor is the persons favorite color
  */
  Person(String aName, int aAge, String aColor){
    name = aName;
    age = aAge;
    color = aColor;
  }

  /**
  accessor
  @return the name of the person
  */
  String getName(){
    return name;
  }
  /**
  accessor
  @return the age of the person
  */
  int getAge(){
    return age;
  }

  /**
  accessor
  @return the persons favorite color
  */
  String getColor(){
    return color;
  }


}