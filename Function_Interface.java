import java.util.function.*;
public class Function_Interface {

/* 1)Functiional Interface in java is an interface which contains only one abstract 
    method.
2)It can have multiple static or default methods .
3)lambda expressions and method references provides consise way to implement
abstract methods of functional ineterface.
4)functional Interfaces are also called as SAM (Single Abstract Method ).
5)We can create Functional Interface using @FunctionalInterface annotation 
6)Predicate,Supplier,ConsumerFunction,BiFunction are functional Interfaces in java
*/

    public static void main(String[] args) {
        
       // Predicate Represent Boolean value function of one argumnt

       Predicate<Integer>isOdd = (n) -> n%2 !=0;

       System.out.println(isOdd.test(3)); //Output is true

       System.out.println(isOdd.test(4)); //Output is False

       
       //Function represents a function that accepts one argument 
      // and produces a result

       Function<String,Integer>length = (str) -> str.length();
       System.out.println("Length Of String is :"+length.apply("Rohit")); //Output is 55


       //Supplier reprsents a supplier of results

       Supplier<String>sayHello = ()->"Hello From system";

       System.out.println(sayHello.get()); //Output is Hello From system


        //Consumer reprsents a  single input  argument and not returns anything

        Consumer<String>print = (s)->System.out.println(s);

        print.accept("Testing consumer");

        
    }
    
}
