public class ExamOddEven{
	public static void main(String [] args){
		System.out.println("programmed by Yuki Fukuzato.");
		int a = Integer.parseInt(args[0]);

		if(a%2 == 0)
			System.out.println(a + " is Even number.");

		else
			System.out.println(a + " is Odd number.");
	}
}
