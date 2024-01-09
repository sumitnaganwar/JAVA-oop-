interface vehicle
{
    void changegear(int gear);
    void speedup(int s);
    void applybreak(int b);
}


__________________________________________________________
public class Car implements vehicle {
    private int gear;
    int speed;
    
    public void changegear(int g){
          gear=g;
        System.out.println("Car : Gear changed to : "+gear);
    }
    public void speedup(int sp){
          speed += sp;
        System.out.println("Speed changed to :"+speed);
    }
    public void applybreak(int b){
          speed -=b;
        System.out.println("Speed changed to :"+speed);
    }
    public void display(){
        System.out.println("\nCurrent Speed of car is "+speed);
    }
}

___________________________________________________________________
public class Bike implements vehicle{
    private int gear;
     int speed;
    
    public void changegear(int g)
    {
        gear=g;
        System.out.println("Bike : Gear changed to : "+gear);
    }
    public void speedup(int sp){
         speed += sp;
        System.out.println("Speed changed to :"+speed);
    }
    public void applybreak(int b){
        speed -=b;
        System.out.println("Speed changed to :"+speed);
    }
    public void display(){
        System.out.println("\nCurrent Speed of bike is "+speed);
    }
}
___________________________________________________________________
public class Bicycle implements vehicle{
    private int gear;
     int speed;
    
    public void changegear(int g)
    {    gear=g;
        System.out.println("Bicycle : Gear changed to : "+gear);
    }
    public void speedup(int sp){
        speed += sp;
        System.out.println("Speed changed to :"+speed);
    }
    public void applybreak(int b){
        speed -=b;
        System.out.println("Speed changed to :"+speed);
    }
    public void display(){
        System.out.println("\nCurrent Speed of bicycle is "+speed);
    }
}
_______________________________________________________________________
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int sp,cg,br;
        Car c = new Car();
        Bike b = new Bike();
        Bicycle be = new Bicycle();

       Scanner sc = new Scanner(System.in);
       int ch,ch1;
       do{
        System.out.println("\n1. Let's drive a Car..");
        System.out.println("2. Let's drive a bike..");
        System.out.println("3. Let's drive a Bicycle..");
        System.out.println("4. Exit..");
        System.out.print("\nEnter the option : ");
        ch = sc.nextInt();
        switch (ch) {
            case 1:
                do{
                    System.out.println("\n1. To start the Car..");
                    System.out.println("2. To increase speed..");
                    System.out.println("3. To Change Gear..");
                    System.out.println("4. To apply break..");
                    System.out.println("5. To Display Current Speed of Car..");
                    System.out.println("6. To go back & drive another vehicle..");
                    System.out.print("\nEnter the option : ");
                    ch1 = sc.nextInt();
                    switch (ch1) {
                        case 1:
                            c.speed= 0;
                            System.out.println("Car is started with speed : "+c.speed);
                            
                            break;
                        case 2:
                            System.out.print("Enter the value to increase the speed of Car(km/h) : ");
                            sp = sc.nextInt();
                            c.speedup(sp);
                            break;
                        case 3:
                            System.out.print("Enter the no. of gear you want ride on : ");
                            cg = sc.nextInt();
                            c.changegear(cg);
                            break;
                        case 4:
                            System.out.println("Moving too fast apply break to slow down(km/h) : ");
                            br = sc.nextInt();
                            c.applybreak(br);
                            break;
                        case 5:
                            c.display();
                            break;
                        case 6:
                            System.out.println("Rider Successfully get off the Car and ready for the next ride...");
                            break;
                        default:
                            System.out.println("Please enter valid option...");
                            break;
                    }
                }while(ch1!=6);
                
                break;
            case 2:
                do{
                    System.out.println("\n1. To start the bike..");
                    System.out.println("2. To increase speed..");
                    System.out.println("3. To Change Gear..");
                    System.out.println("4. To apply break..");
                    System.out.println("5. To Display Current Speed of bike..");
                    System.out.println("6. To go back & drive another vehicle..");
                    System.out.print("\nEnter the option : ");
                    ch1 = sc.nextInt();
                    switch (ch1) {
                        case 1:
                            b.speed = 0;
                            System.out.println("bike is started with speed(km/h) : "+b.speed);
                            
                            break;
                        case 2:
                            System.out.print("Enter the value to increase the speed of bike(km/h) : ");
                            sp = sc.nextInt();
                            b.speedup(sp);
                            break;
                        case 3:
                            System.out.print("Enter the no. of gear you want ride on(1-4) : ");
                            cg = sc.nextInt();
                            b.changegear(cg);
                            break;
                        case 4:
                            System.out.println("Moving too fast apply break to slow down(km/h) : ");
                            br = sc.nextInt();
                            b.applybreak(br);
                            break;
                        case 5:
                            b.display();
                            break;
                        case 6:
                            System.out.println("Rider Successfully get off the Bike and ready for the next ride...");
                            break;
                        default:
                            System.out.println("Please enter valid option...");
                            break;
                    }
                }while(ch1!=6);
                
                break;
            case 3:
                do{
                    System.out.println("\n1. To start the bicycle..");
                    System.out.println("2. To increase speed..");
                    System.out.println("3. To apply break..");
                    System.out.println("4. To Display Current Speed of bicycle..");
                    System.out.println("5. To go back & drive another vehicle..");
                    System.out.print("\nEnter the option : ");
                    ch1 = sc.nextInt();
                    switch (ch1) {
                        case 1:
                            
                            System.out.println("bicycle is started with speed : "+be.speed);
                            
                            break;
                        case 2:
                            System.out.print("Enter the value to increase the speed of bicycle(km/h) : ");
                            sp = sc.nextInt();
                            be.speedup(sp);
                            break;
                        case 3:
                            System.out.println("Moving too fast apply break to slow down(km/h) : ");
                            br = sc.nextInt();
                            be.applybreak(br);
                            break;
                        case 4:
                            be.display();
                            break;
                        case 5:
                            System.out.println("Rider Successfully get off the Bicycle and ready for the next ride...");
                            break;
                        default:
                            System.out.println("Please enter valid option...");
                            break;
                    }
                }while(ch1!=5);
                
                break;
            case 4:
                System.out.println("\nRider Exhausted !!!");
                break;
            default:
                System.out.println("\nEnter valid option...");
                break;
        
            }
        }while(ch!=4);
        sc.close();
    }
}
