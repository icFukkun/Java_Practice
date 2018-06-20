public class ExamLeapYear{
	public static void main(String[] args){
		System.out.println("programmed by Yuki Fukuzato.");
		int a = Integer.parseInt(args[0]);

		if(a < 0)
			System.out.println("正しい値を入力してください.");
		else if(a % 100 == 0 & a % 400 != 0)
			System.out.println(a + "年は平年です.");
		else if(a % 4 == 0)
			System.out.println(a + "年は閏年です.");
		else
			System.out.println(a + "年は平年です.");
	}
}
