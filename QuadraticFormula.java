
/**
 * Finds solution to the quadratic equation with given coefficients.
 *
 * @author (Butovska)
 * @version (28/10/22)
 */

import java.io.*;
import java.util.Scanner;

public class QuadraticFormula
{
    public static void main(String args[]) 
        throws IOException {
        Scanner guess = new Scanner(System.in);

            double a, b, c;  //the coefficients of your quadratic formula
            
            //create buffered reader for reading keyboard input
            
            BufferedReader br = new BufferedReader(new 
                                    InputStreamReader(System.in));
            
            String str;  //stores the input as text
            
            //this section reads in the coefficient of the x square term
            System.out.println("Enter the coefficient of x^2: ");
           
            
            str = br.readLine();
            
            try {
                a = Double.parseDouble(str);
            }
            
            catch(NumberFormatException exc) {
                System.out.println("Invalid format");
                a=0;
            } 
            /////////////////////////////////////////////////////////////////////////
            
            
            //this section reads in the coefficient of the x  term/////////////////
            
            System.out.println("Enter the coefficient of x: ");
           
            str = br.readLine();
            
            try {
                b = Double.parseDouble(str);
            }
            
            catch(NumberFormatException exc) {
                System.out.println("Invalid format");
                b=0;
            }
            ///////////////////////////////////////////////////////////////
            
            //this section reads in the constant term/////////////////////
            System.out.println("Enter the constant term: ");
           
            str = br.readLine();
            
            try {
                c = Double.parseDouble(str);
            }
            
            catch(NumberFormatException exc) {
                System.out.println("Invalid format");
                c=0;
            }
            ////////////////////////////////////////////////////////////////
           // declared the two roots
           
        //BEGIN STUDENT CODE HERE
        
        if(a == 0) { //invalid case
            System.out.println("Error. You entered zero for the x^2 coefficient, so quadratic formula cannot be computed.");
            
        } else { //valid cases
        
            //the following line prints out the equation
        
            System.out.println(a + "x^2 + " + b + "x + " + c);
        
            double D, //the discriminant of the quadratic equation
                   x1, //the first possible root of the quadratic equasion
                   x2; ////the first possible root of the quadratic equasion
               
             D = Math.pow(b,2) - 4 * a * c;
         
             //checks if there's any roots and print the real ones out
             
             if(D < 0) { //discriminant is less than zero
                 System.out.println("There are two complex conjugate roots.");
             }
             
             if(D == 0) { //discriminant equals zero
                 System.out.println("There is one real root.");
                 x1 = -b/(2 * a);
                 System.out.println("x = " + x1);
             }
             
             if(D > 0) { //discriminant is more than zero
                 System.out.println("There are two real roots.");
                 x1 = (-b - Math.sqrt(D))/(2 * a);
                 x2 = (-b + Math.sqrt(D))/(2 * a);
                 System.out.println("x1 = " + x1);
                 System.out.println("x2 = " + x2);
             }
         
               
        }
    }
}
