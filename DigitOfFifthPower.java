//find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
public class DigitOfFifthPower {
	static boolean forthPower = false;
	public static void main(String[] args){
		for(int i = 2; i<=i;i++){
			fithPower(i);
			if(forthPower){
				 forthPower = false;
				System.out.println(i);
			}
		}
	}
	public static void fithPower(int checkValue){
		char[] aChar =  Integer.toString(checkValue).toCharArray();
		int overAllValue = 0;
		
		for(int i = 0; i< aChar.length ; i++){
			int numbericValue = Character.getNumericValue(aChar[i]);
			overAllValue += Math.pow(numbericValue, 5);

		}
		if(overAllValue == checkValue){
			forthPower = true;
		}
		
	}
}
