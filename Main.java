import java.util.*;
// Create a base class Vehicle with methods start() and stop().
//  Derive two classes Car and Bike inheriting from Vehicle. 
//  Implement start and stop methods accordingly.
abstract class Vehicle{
    abstract void start(char g);
    abstract void stop(char g);

}
 abstract class Car extends Vehicle{
    public void start(){
    if(g=='r'){
        System.out.println("car started");
    }
    }
    public void stop(){
        if(g=='s'){
            System.out.println("car is stop");
        }
    }
 }
 abstract class Bike extends Vehicle{
   public void start(){
    if(b=='r'){
        System.out.println("bike started");
    }
    }
   public void stop(){
        if(b=='s'){
            System.out.println("bike is stop");
        }
    }
 }
 public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the r to start and s to stop the car");
        char g=sc.next().charAt(0);
        System.out.println("enter the r to start and s to stop the car");
        char g=sc.next().charAt(0);
        Vehicle aj=new Vehicle(); 
            aj.start(g);
            aj.stop(g);
            Car k=new Car();
            k.start(g); 
            k.stop(g);
            Bike j=new Bike();
             j.start(g);
             j.stop(g);
        }
        
    }
 