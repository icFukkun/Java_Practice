public class ExamPow{
	public static void main(String[] args){
		System.out.println("programmed by Yuki Fukuzato");
		double a = Double.parseDouble(args[0]);
		int b = Integer.parseInt(args[1]);

		System.out.println("pow(" + a + ", " + b + ") = " + Math.pow(a,b));
	}
}
