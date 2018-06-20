public class ExamMul{
	public static void main(String[] args){
		System.out.println("programmed by Yuki Fukuzato");
		double num = 1;

		for (int i = 0; i < args.length; i++)
			num = num * Double.parseDouble(args[i]);

		System.out.println("times = " + num);
	}
}
