import java.util.Scanner;
public class BMICalculations
{
    public static void main(String[] args) {
    //Create a Scanner Object so i can read in from the command line
    Scanner keyboard = new Scanner(System.in);
    System.out.print("What is the weight in pounds?");
    double weight = keyboard.nextDouble();
    System.out.print("What is the height in inches?");
    double height = keyboard.nextDouble();
    double result = weight / (height * height) * 703;
    System.out.printf("%.2f pounds => %.2f", weight,result);
}
 }                                        