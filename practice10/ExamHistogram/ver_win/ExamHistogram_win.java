public class ExamHistogram{
	public static void main(String[] args){
		System.out.println("programmed by Yuki Fukzuato.\n");
		int n = args.length;
		int a[] = new int[n];

		for(int m = 0; m < n; m++)
			a[m] = Integer.parseInt(args[m]);

		for(int i = 0; i < 10; i++){
			System.out.print(i);
			for(int j = 0; j < n; j++){
				if(a[j] == i)
					System.out.print("■ ");
			}
			System.out.println();
		}
		
	}
}
