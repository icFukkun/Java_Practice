public class ExamRank{
	public static void main(String[] args){
		System.out.println("pragrammed by Yuki Fukuzato.");
		int a = Integer.parseInt(args[0]);

		if (a < 0 | 100 < a)
			System.out.println("正しい値を入力してください");

		else{
			if (a < 60)
				System.out.println(a + "点はFです.");
	
			else if (a < 70)
				System.out.println(a + "点はCです.");

			else if (a < 80)
				System.out.println(a + "点はBです.");

			else if (a < 90)
				System.out.println(a + "点はAです.");

			else if (a <= 100)
				System.out.println(a + "点はSです.");
		}
	}
}
