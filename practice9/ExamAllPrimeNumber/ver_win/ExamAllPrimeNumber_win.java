public class ExamAllPrimeNumber{
	public static void main(String[] args){
		System.out.println("programmed by Yuki Fukuzato.\n");
		int n = Integer.parseInt(args[0]);
		int numOfPrimes = 1; int judge = 0;
		int[] primes = new int[10000];
		primes[0] = 2;
		for(int i = 3; i <= n; i += 2){
			for(int j = 0; j < numOfPrimes; j++){
				judge = i % primes[j];
				if(judge == 0)
					break;
			}
			if(judge != 0){
				primes[numOfPrimes] = i;
				numOfPrimes += 1;
			}
			if(numOfPrimes == 10000){
				System.out.println("配列サイズを超えました");
				break;
			}
		}

		System.out.println("見つかった要素の数 = " + numOfPrimes);
		for(int l = 0; l < numOfPrimes; l++)
			System.out.println(primes[l] + " ");
	}
}				
