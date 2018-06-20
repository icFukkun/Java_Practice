public class ExamMin{
	public static void main(String[] args){
		System.out.println("programmed by Yuki Fukuzato");
		double min = 0;

		min = Double.parseDouble(args[0]);

		for (int i = 0; i < args.length; i++){
			if(min > Double.parseDouble(args[i]))
				min = Double.parseDouble(args[i]);
		}

		System.out.println("min = " + min);
	}
}
