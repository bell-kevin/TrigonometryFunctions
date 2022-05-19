/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trigonometryfunctions;

import java.util.Scanner;

/**
 *
 * @author 4800590195
 */
public class TrigonometryFunctions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Math Trigonometric Functions by Kevin Bell \n");
        Scanner computerKeyboardInput = new Scanner(System.in);
        System.out.print("Please enter an angle in degrees: ");
        double angleInDegrees;
        angleInDegrees = computerKeyboardInput.nextDouble();
        System.out.println(angleInDegrees);
    }
}
