public class ExamOutside{
	public static void main(String [] args){
		System.out.println("programmed by Yuki Fukuzato.");
		double x = Double.parseDouble(args[0]);
		boolean a = (x<=1) | (5<=x);
		System.out.println(x + " <= 1.0 | 5.0 <= " + x + " の値は " + a);
	}
}
