import java.util.ArrayList;
import java.util.List;
//adds all prime numbers and find the longest sequence that is the sum of prime numbers, that's below 1,000,000
public class ConsecutiveSumOfPrimeNumber {
	static List<Integer> Prime1 = new ArrayList<Integer>();
	static int	consecutiveSum=2;

	public static void main(String[] args) {
		primeNumber();
		
		
	}
	public static void primeNumber(){
		boolean isPrime = false;
		for(int i = 3; i<i+1;i++){
			for(int j = 2 ; j<i ; j++){
				if(i%j==0){
					isPrime=false;
					break;
				}
				else{
					isPrime = true;
				}
			}
			if(isPrime){
				consecutiveSum += i;
			}
			if(consecutiveSum>=1000000){
				consecutiveSum -=i;
				System.out.println(consecutiveSum);
				break;
			}
			
			
		}
	}
	

}
