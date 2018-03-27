
public class FactorialProjectEuler {
	//adds each single digit together of the factorial result. E,g 10! = 3628800. It would add 3+6+2+8+8+0+0. The result is 27.
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
