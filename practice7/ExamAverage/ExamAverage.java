public class ExamAverage{
	public static void main(String[] args){
		System.out.println("programmed by Yuki Fukuzato");
		double sum = 0;

		for(int i = 0; i < args.length; i++)
			sum += Double.parseDouble(args[i]);

		System.out.println("平均値は " + sum/args.length);
	}
}
