import java.util.*;
class program_2 {
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);
        int a, b, c=1;
        System.out.print("Enter first no: ");
        a = S.nextInt();
        System.out.print("Enter second no: ");
        b = S.nextInt();
        if (a == b) {
            System.out.print("Both are equal !!!");
        } else if (a > b) {
            System.out.print("First no. is greater than second no. !!!");
        } else {
            System.out.print("Second no. is greater than First no. !!!");
        }
    }
}