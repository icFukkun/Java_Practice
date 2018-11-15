public class ExamRisoku{
	public static void main(String[] args){
		System.out.println("programmed by Yuki Fukuzato.\n");

		double num = Double.parseDouble(args[0]);
		double par = Integer.parseInt(args[1])*0.01;
		int year = Integer.parseInt(args[2]);

		int num0 = (int)num;
		for(int i = 0; i < year; i++)
			num = num * (1 + par);

		int num_i = (int)num;
		int par_total = num_i - num0;

		System.out.println("利得 = " + 100*par + "%  預け入れ年数 = " + year + "年");
		System.out.println("利息 = " + par_total + "円");
		System.out.println("元利合計 = " + num_i + "円");
	}
}
