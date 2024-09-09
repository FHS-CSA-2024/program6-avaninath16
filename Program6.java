//import stuff here!
import java.util.Scanner;
//Your code here
public class Program6 {
    public static void main(String[] args){
    //make a new scanner for user input
    Scanner myScanner=new Scanner (System.in);
    //now the variables
    double rad = 0;
    final double pi = 3.14159;
    
    System.out.println("Enter a number for the radius: ");

    rad = myScanner.nextDouble();   
    //calculation
    
    double diameter = (rad*2);
    
    double area = (pi*(rad*rad));
    
    double circumference = ((2*pi)*rad);
    
    //round
    
    diameter = Math.round(diameter*1000.0)/1000.0;
    
    area = Math.round(area*1000.0)/1000.0;
    
    circumference = Math.round(circumference*1000.0)/1000.0;
    
    //print
    
    System.out.println("The Radius of the circle = " + rad);
    System.out.println("The Diameter of the circle = " + diameter);
    System.out.println("The Area of the circle = " + area);
    System.out.println("The Circumference of the circle = " + circumference);
    

    
    
    
       
        }
    }




//Paste console output below:
/*
Enter a number for the radius: 
3.712
The Radius of the circle = 3.712
The Diameter of the circle = 7.424
The Area of the circle = 43.288
The Circumference of the circle = 23.323

*/
