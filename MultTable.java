package multiplicationTable;
import java.util.Scanner;
public class MultTable {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter a number");
	    int x = myObj.nextInt();
	    int i = 1;
		while ( i <= 10 ) {
			System.out.println(x+" x "+i+" = "+ i*x  );
			i++;
		}
		myObj.close();
	}

}
