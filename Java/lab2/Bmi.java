//Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking your weight in kilograms and dividing by the square of your height in meters. Write a
//program that prompts the user to enter a weight in pounds and height in inches and displays the BMI.
//Note: - 1 pound=.45359237 Kg and 1 inch=.0254 meters.

import java.util.*;
public class Bmi{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter pound value:");
        double p = s.nextDouble();
        System.out.println("enter value of inch:");
        double i = s.nextDouble();
        //BMI = weight in kg / height *height 
        double BMI =p*0.45359237 / (i * 0.0254 * i * 0.0254);
        System.out.print(BMI);
    }
}