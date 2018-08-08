public class ExamPrimeFactor{
	public static void main(String[] args){
		System.out.println("programmed by Yuki Fukuzato.\n");
		int n = Integer.parseInt(args[0]);
		int judge = n;
		System.out.print(n + " = ");
		for(int i = 2; i < (int)Math.sqrt(n); i++){
			while(judge > 1){
				if(judge % i != 0)
					break;
				judge = (judge / i);
				System.out.print(i);
				if(judge < 2)
					continue;
				System.out.print("*");
			}
		}
		System.out.println("\n");
	}
}
