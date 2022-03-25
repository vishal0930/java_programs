import java.util.*;
class program_4 {
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);
        
        int sum=0;
        for(int i = 0; i <= 10; i++) {
            sum += i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Sum of the all no: " + sum);

        S.close();
    }
}