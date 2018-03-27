
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
//The largest palindrome made from the product of two 4-digit number
public class Palindrome {
	public static void main(String[] args){
		System.out.println(palindrome());
	}
	public static int palindrome(){
		Set<Integer> set1 = new TreeSet<Integer>();
		List<Integer> list1 = new ArrayList<Integer>();
		int multiply = 0;
		int biggestPalindrome = 5;
		for(int i = 9999; i>=1; i--){
			for(int l = 9999; l>=1; l--){
				multiply = i *l;
				set1.add(multiply);
			}
		}
		list1.addAll(set1);
	
		for(int i = list1.size()-1; i>=0;i--){
			boolean paldindrome = palindrome1(list1.get(i));
			if(paldindrome){
				biggestPalindrome=list1.get(i);
				break;
			}
			else {

			}
		}
		return biggestPalindrome;
	}
	public static boolean palindrome1(int l){
		char[] lArray = Integer.toString(l).toCharArray();
		char[] upSideDown = new char[lArray.length];
		int counter = 0;
		for(int i = lArray.length-1;i>=0;i--){
			upSideDown[i] = lArray[counter];
			counter++;
		}
		String text = String.valueOf(upSideDown);
		String text2 = String.valueOf(lArray);
		if(text.equals(text2)){
			return true;
		}
		else{
			return false;
		}
				
	}
	
}
