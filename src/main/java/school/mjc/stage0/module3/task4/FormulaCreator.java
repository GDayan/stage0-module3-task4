package school.mjc.stage0.module3.task4;

public class FormulaCreator {
    public static void main(String[] args) {
        int a;
        int b;
        int result;

        a = 3; // Assigning a value to variable a
        b = 2; // Assigning a value to variable b

        // Applying the formula
        result = (9 * a * a - 5 * b + 2 + a - 7) * ((a+b-4*a*b)/2);

        // Printing the result
        System.out.println("The result of the formula is: " + result);
    }
}

