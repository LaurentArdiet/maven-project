package com.example;


import java.lang.Math;
/**
* this is a Class
*/

public class Greeter {
 
  /**
  * this in contructor
  */
 
  public Greeter() {
   // const par defaut
  }

 /**
 * @param someone name of a person
 * @return greeting string
 */
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
   
 }
}
