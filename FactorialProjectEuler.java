
public class FactorialProjectEuler {

	public static void main(String[] args) {
		System.out.println(SumFactorial(factorial(10)));
	}
	public static int factorial(int l){
		int factorial1 = 1;
		for(;l>0;l--){
			factorial1 *= l;
		}
		return factorial1;
	}
	public static int SumFactorial(int l){
		String lString=Integer.toString(l);
		int sum = 0;
		char[] lArray = lString.toCharArray();
		for(int i = 0; i<lArray.length - 1;i++){
			sum += Character.getNumericValue(lArray[i]);
		}
		return sum;
	}

}
