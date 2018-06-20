public class ExamTaxi{
	public static void main(String[] args){
		System.out.println("programmed by Yuki Fukuzato.");
		int a = Integer.parseInt(args[0]);
		int b, c, num;
		b = 0; num = 0;
		
		if(a < 0)
			System.out.println("正しい値を入力してください.");
		else if(a <= 2000)
			System.out.println(a + "m の料金は500円です.");
		else{
			c = a - 2000;
			b = c % 500;
			if(b == 0)
				num = (c / 500)*100 + 500;
			else
				num = (c / 500)*100 + 500 + 100;

			System.out.println(a + "m の料金は" + num + "円です.");
		}
	}
}
