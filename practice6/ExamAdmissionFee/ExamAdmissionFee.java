public class ExamAdmissionFee{
	public static void main(String[] args){
		System.out.println("programmed by Yuki Fukuzato.");
		int a = Integer.parseInt(args[0]);

		if(a < 6)
			System.out.println(a + "才の入場料は50円です.");

		else if(a < 12)
			System.out.println(a + "才の入場料は1000円です.");

		else if(a < 20)
			System.out.println(a + "才の入場料は2000円です.");

		else
			System.out.println(a + "才の入場料は3000円です.");

		}
}
