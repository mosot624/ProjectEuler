
public class FibSiq {

	public static void main(String[] args) {
		System.out.println(fibSiq());
	}
	public static int fibSiq(){
		int a=1;
		int b=1;
		int c=0;
		while(c<1000){
			c = a+b;
			a = b;
			b = c;
		}
		return c;
	}

}
