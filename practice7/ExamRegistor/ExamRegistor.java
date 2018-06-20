public class ExamRegistor{
	public static void main(String[] args){
		System.out.println("programmed by Yuki Fukuzato");
		double[] a = new double[args.length];
		double sum = 0, num = 0, alt = 0;

		for(int i = 0; i < args.length; i++)
			a[i] = Double.parseDouble(args[i]);

		for(int j = 0; j < args.length; j++){
			sum += a[j];
			num += 1/a[j];
		}

		alt = 1/num;

		System.out.println("直列接続時 R = " + sum + "\n" + 
				   "並列接続時 R = " + alt);

	}
}
