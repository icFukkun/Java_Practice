public class ExamZenkasiki{
	public static void main(String[] args){
		Double a0 = Double.parseDouble(args[0]);
		Double a1 = Double.parseDouble(args[1]);
		Double p = Double.parseDouble(args[2]);
		Double q = Double.parseDouble(args[3]);
		int n = Integer.parseInt(args[4]);
		Double a = 0.0;

		System.out.println("programmed by Yuki Fukuzato.\n");

		for(int i = 0; i <= n-2; i++){
			a = p*a1 + q*a0;
			int m = i + 2;
			System.out.println("a" + m + " = (" + p + "*" + a1 + ") + (" + q + "*" + a0 + ") = " + a);
			a0 = a1;
			a1 = a;
		}

		System.out.println("処理終了");
	}
}
