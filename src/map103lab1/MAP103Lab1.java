/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map103lab1;

import java.util.Scanner;
public class MAP103Lab1 {
public static void main( String args[] ) {
// Create a Scanner to obtain information from the command prompt
Scanner input = new Scanner( System.in );
double temperatureinCelsius=0.0, temperatureinFahrenheit=0.0;
System.out.print( "Enter temperature in celsius: " );
temperatureinCelsius= input.nextDouble();
temperatureinFahrenheit= (9.0/5.0)* temperatureinCelsius + 32;
System.out.printf( "Temperature in Fahrenheit is: %f",temperatureinFahrenheit);
input.close();
}
}
