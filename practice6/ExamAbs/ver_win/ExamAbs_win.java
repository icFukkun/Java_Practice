public class ExamAbs{
	public static void main(String [] args){
		System.out.println("programmed by Yuki Fukuzato.");
		double a = Double.parseDouble(args[0]);
		double x = a;

		if(a < 0)
		x = -a;

		System.out.println("|" + a + "| = " + x);
		}
}
