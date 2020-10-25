import java.util.Scanner;

public class HW1 {
	
  static int product(int x, int y) {

    if(x==0 || y == 0){

	  	return 0;

      }else{

        return (x + product(x, y-1));
      }

   }
	

	// the main function will automatically run tests using the github classroom autotesting functionality
	// please keep it as it is when you push your code
	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);

		for (int numTests = 10; numTests > 0; numTests--){
			int x = scan.nextInt();
			int y = scan.nextInt();

			System.out.println(product(x, y));
		}
		
		scan.close();
	}

}
