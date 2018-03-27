import java.util.Scanner;

public class AddingAllFactorialTogether {
	static int number = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Sum = 0;
		int factorialresult = 1;
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();

		System.out.println("Welcome to factorial add");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("How many would you like to add?");
		int c = sc1.nextInt();
		for(int i = 0; i<c ; i++){
			System.out.println("What would you like to add");
			factorialresult = factorial();
			if(i==c-1){
				sb2.append(number + "!" + " = ");
			}
			else{
				sb2.append(number + "!" + " + ");
			}
			Sum += factorialresult;
			if(i==c-1){
				sb1.append(factorialresult + " = ");
			} else {
				sb1.append(factorialresult + " + ");
			}
		}
		sc1.close();

		

		System.out.print(sb2.toString() +sb1.toString() + Sum);
	}
	public static int factorial(){
		Scanner sc1 = new Scanner(System.in);
		number = sc1.nextInt();
		int factorialMultiply = 1;
		for(int i = 1; i<=number;i++){
			factorialMultiply *= i;
		}
		return factorialMultiply;
	}

}
