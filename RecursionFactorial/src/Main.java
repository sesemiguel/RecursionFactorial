public class Main {
	public static void main(String[]args) {
		System.out.println(factorial(5));
	}
	
	public static int factorial(int n) {
		int res;
		if(n==0 || n==1) {
			return 1;
		}
		res = factorial(n-1) * n;
		return res;
	}
}