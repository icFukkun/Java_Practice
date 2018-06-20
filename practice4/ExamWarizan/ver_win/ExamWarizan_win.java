public class ExamWarizan{
	public static void main(String [] args){
	System.out.println("programmed by Yuki Fukuzato.");
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	double sum = a / b;
	int num = (int) sum;
	int par = a % b;
	System.out.println(a + "÷" + b + "の商 = " + num + "\n" +
			   a + "÷" + b + "の余り = " + par);
	}
} 
