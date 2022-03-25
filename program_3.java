import java.util.*;
class program_3 {
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);
        int a, b;
        char operator;
        System.out.print("Enter first no: ");
        a = S.nextInt();
        System.out.print("Enter second no: ");
        b = S.nextInt();
        System.out.print("Enter operator which you perform operation: ");
        operator = S.next().charAt(0);
        switch(operator) {
            case '+':
                System.out.print("Addition of both no: " + (a+b));
                break;
            case '-':
                System.out.print("Substraction of both no: " + (a-b));
                break;
            case '*':
                System.out.print("Multiplication of both no: " + (a*b));
                break;
            case '/':
                if (b == 0) {
                    System.out.print("Division not possible!!");
                } else {
                    System.out.print("A / B : " + (a/b));
                }
                break;
            case '%':
                if (b == 0) {
                    System.out.print("Modulus not possible!!");
                } else {
                    System.out.print("A % B : " + (a%b));
                }
                break;
            default:
                System.out.print("Invalid entry!!!");
        }
        S.close();
    }
}