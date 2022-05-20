package trigonometryfunctions;

import java.util.Scanner;

public class TrigonometryFunctions {

    public static void main(String[] args) {
        System.out.print("Math Trigonometric Functions by Kevin Bell \n");
        Scanner computerKeyboardInput = new Scanner(System.in);
        System.out.print("Please enter an angle in degrees: ");
        double angleInDegrees, angleInRadians, sine, cosine, tangent;
        angleInDegrees = computerKeyboardInput.nextDouble();
        angleInRadians = Math.toRadians(angleInDegrees);
        sine = Math.sin(angleInRadians);
        cosine = Math.cos(angleInRadians);
        tangent = Math.tan(angleInRadians);
        System.out.printf("%9s%,.4f\n", "Sine: ", sine);
        System.out.printf("%9s%,.4f\n", "Cosine: ", cosine);
        System.out.printf("%9s%,.4f\n", "Tangent: ", tangent);
    }
}
