public class ExamKeta{
	public static void main(String [] args){
	System.out.println("programmed by Yuki Fukuzato.");
	int a = Integer.parseInt(args[0]);
	int thou = (int) a / 1000;
	int hund = (int) a % 1000 / 100;
	int ten = (int) a % 100 / 10;
	int one = (int) a % 10;
	System.out.println("1000の位 = " + thou + "\n" + 
			   "100の位 = " + hund + "\n" +
			   "10の位 = " + ten + "\n" +
			   "1の位 = " + one);
	}
}
