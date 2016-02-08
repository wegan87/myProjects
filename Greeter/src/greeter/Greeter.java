/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greeter;

/**
 *
 * @author wiegan
 */
public class Greeter 
{
    /**
      This class builds an object that can greet the user
      @param aName the name of the person or entity who should
      be addressed in the greetings.
   */
   public Greeter(String aName)
   {
      name = aName;
   }
   /**
      Greet with a "Hello" message.
      @return a message containing "Hello" and the name of
      the greeted person or entity.
   */
   public String sayHello()
   {
      return "Hello, " + name + "!";
   }
   /**
    * Set the name of an object of type Greeter
    * @param newName 
    */
   public void setName(String newName)
   {
       name = newName;
   }
   /**
    * Sets the name of an object of type greeter to be the name 
    * of the input, which is also an object of type Greeter.
    * @param other 
    */
   public void swapNames(Greeter other)
   {
       this.name = other.name;
   }
    /**
     * The main method first checks to see if the setName() method of Greeter 
     * works, and then checks to see if the swapNames() method works.
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    { 
        //Part A
        Greeter daveGreeter = new Greeter("Dave");
        Greeter otherGreeter = daveGreeter;
        daveGreeter.setName("Tim");
        String greeting = otherGreeter.sayHello();
        System.out.println(greeting);
        
        //Part B
        Greeter alGreeter = new Greeter("Al");
        System.out.println("Below is alGreeter's name before swapNames is called:");
        System.out.println(alGreeter.sayHello());
        Greeter guyGreeter = new Greeter("Guy");
        alGreeter.swapNames(guyGreeter);
        System.out.println("Below is alGreeter's name after swapNames is called");
        System.out.println(alGreeter.sayHello());
        
    }
    private String name;
    
}
