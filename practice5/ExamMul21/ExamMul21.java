public class ExamMul21{
	public static void main(String [] args){
		System.out.println("programmed by Yuki Fukuzato.");
		int a = Integer.parseInt(args[0]);
		int b = (a << 4) + (a << 2) + a;
		System.out.println(a + " << 4 + " + a + " << 2 + " + a + " = " + b);
	}
}
