public class ExamShiftL{
	public static void main(String [] args){
		System.out.println("programmed by Yuki Fukuzato.");
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a << b;
		System.out.println(a + " << " + b + " = " + c);
	}
}
