public class ExamGCD{
	public static void main(String[] args){
		System.out.println("programmed by Yuki Fukuzato.\n");
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("最大公約数 = " + gcd(a, b));
	}

	private static int gcd(int a, int b){
		if(a < b)
			return gcd(b, a);
		if(b == 0)
			return a;
		return gcd(b, a % b);
	}
}
