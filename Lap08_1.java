/*
 (Valid Triangle) Create a class named MyTriangle that contains the following methods in addition to the main() method: a) isValid - 
This method checks whether a triangle can be formed given the three sides of a triangle as input parameters. The method returns true if 
the sides can form a triangle, otherwise it returns a false. The isValid() method should be overloaded to accept its input parameters as all 
int or as all double. [Hint : A triangle can only be formed if the sum of any two sides is always larger than the third side] b) calcArea -
This method calculates and returns the area of a triangle given the three sides. Area of a triangle is calculated using the formula given
below 𝑎𝑟𝑒𝑎 = %(𝑠(𝑠 − 𝑎)(𝑠 − 𝑏)(𝑠 − 𝑐) ) where a, b and c are the three sides of a triangle and s is the semi perimeter given by 
𝑠 = (𝑎 + 𝑏 + 𝑐)/2 The length of the sides of the triangle are to be read from the user in the main method. The three numbers should then be 
passed to the isValid() method to check if the triangle can be formed using the three sides. If the triangle is valid, its area is to be 
obtained using the calcArea() method and then printed in the main method. The calcArea() method should be overloaded to accept its input
parameters as all int or all double. c) printFormatted() – this method should be used to print the Area of the triangle. It should be 
overloaded to take i. ii. a number (double) as input parameter or a number (double) and precision (int) as input parametersIn the first case 
the method should print the formatted number with 2 decimal places. In the second case, the method should print the formatted number with w 
decimal places where w is specified by the user. If w is 1, 2 or 3 the output should have 1, 2 or 3 decimal places, respectively. For other
values of w the output should just print 2 decimal places. For example, both printFormatted(4.1234343)and printFormatted(4.1234343, 18) 
should display “Area : 4.12” If the sides of the triangle are all integers, the area of the triangle should be printed to 2 decimal places 
using the printFormatted() method. If the sides of the triangle are all doubles, the area of the triangle should be printed to 3 decimal 
places using the printFormatted() method. See the sample run for more details.
 */
package Lap08;

import java.util.Scanner;
public class Lap08_1 {

    public static boolean isValid(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);}

    public static double calcArea(double a, double b, double c) {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));}

    public static void printFormatted(double area, int precision) {
        if (precision >= 1 && precision <= 3) {
            System.out.printf("Area : %." + precision + "f%n", area);
        } else {
            System.out.printf("Area : %.2f%n", area);}
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      
        System.out.print("Enter three sides of a triangle (as integers) : ");
        double a1 = input.nextDouble();
        double b1 = input.nextDouble();
        double c1 = input.nextDouble();

        if (isValid(a1, b1, c1)) {
            double areaInt = calcArea(a1, b1, c1);
            printFormatted(areaInt, 2);
        } else {
            System.out.println("Invalid sides of a triangle");}

        System.out.print("Enter three sides of a triangle (as double) : ");
        double a2 = input.nextDouble();
        double b2 = input.nextDouble();
        double c2 = input.nextDouble();

        if (isValid(a2, b2, c2)) {
            double areaDouble = calcArea(a2, b2, c2);
            printFormatted(areaDouble, 3);
        } else {
            System.out.println("Invalid sides of a triangle");}

    }
}