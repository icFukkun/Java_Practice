public class ExamTousa{
	public static void main(String[] args){
		System.out.println("programmed by YUki Fukzuato.");
		double[] num = new double[3];
		int n = Integer.parseInt(args[2]);

		for(int i = 0; i < 2; i++)
			num[i] = Double.parseDouble(args[i]);

		for(int j = 0; j <= n; j++)
			num[2] += num[0] + j * num[1];

		System.out.println("sum = " + num[2]);
	}
}
