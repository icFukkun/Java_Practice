public class ExamTurisen{
	public static void main(String [] args){
	System.out.println("programmed by Yuki Fukuzato.");
	int a = Integer.parseInt(args[0]);
	int b = 1000 - a;
	int c = (int) b / 500;
	int d = (int) b % 500 / 100;
	int e = (int) b % 100 / 10;
	int f = (int) b % 10;
	System.out.println("商品の値段 = ￥" + a + "\n" +
			   "お釣り = ￥" + b + "\n" +
			   "500円玉 -> " + c + "枚\t" + "100円玉 -> " + d + "枚\t\n" +
			   "10円玉 -> " + e + "枚\t" + "1円玉 -> " + f + "枚");
	}
}
