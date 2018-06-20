public class ExamDayOfWeek{
	private static String[] dates = {
	"日曜日",
	"月曜日",
	"火曜日",
	"水曜日",
	"木曜日",
	"金曜日",
	"土曜日"
	};

	public static void main(String[] args){
		System.out.println("programmed by Yuki Fukuzato.");
		int a = Integer.parseInt(args[0]);
		if(0 <= a & a <= 6)
			System.out.println(dates[a] + "です.");
		else
			System.out.println("0から6の整数を入力してください.");
	}
}
