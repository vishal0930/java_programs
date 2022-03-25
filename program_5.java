import java.util.*;
class program_5 {
	public static void main(String args[]){
		Scanner S = new Scanner(System.in);
		int i, sum=0;
		i = 0;
		// while (i <= 10) {
		// 	sum += i;
		// 	System.out.print(i + " ");
		// 	i++;
		// }

		do {
			sum += i;
			System.out.print(i + " ");
			i++;
		} while (i <= 10);
		System.out.println();
		System.out.print("Sum of the all numbers: " + sum);

		S.close();
	}
	
}
