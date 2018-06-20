import java.util.Arrays;

public class ExamAscendingOrder{
	public static void main(String[] args){
		System.out.println("programmed by Yuki Fukuzato.");
		//double a = Double.parseDouble(args[0]);
		//double b = Double.parseDouble(args[1]);
		//double c = Double.parseDouble(args[2]);
		double[] num = new double[3];
		
		for(int i = 0; i < args.length; i++)
			num[i] = Double.parseDouble(args[i]);

		System.out.println("ソート前\n" + Arrays.toString(num));

		Arrays.sort(num);
	
		System.out.println("ソート後\n" + Arrays.toString(num));
	}
}
