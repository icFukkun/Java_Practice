public class ExamAtari{
	public static void main(String [] args){
		System.out.println("programmed by Yuki Fukuzato.");
		double a = Double.parseDouble(args[0]);

		if(3 <= a & a <= 5)
			System.out.println("当たり");

		else if ((0 <= a & a <= 3) | (5 <= a & a <= 8))
			System.out.println("ニアミス");

		else
			System.out.println("はずれ");
	}
}
