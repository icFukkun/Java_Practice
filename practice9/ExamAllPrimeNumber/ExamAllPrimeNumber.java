public class ExamAllPrimeNumber {
public static void main (String[] args) {
	System.out.println("programmed by ŒcRG“l.");
	int[] primes = new int[10000];
	
	primes[0] = 2;
	int numOfPrimes = 1;
	int n = Integer.parseInt(args[0]);

	boolean flag;
	
	

	for(int i=3; i<=n; i=i+2){
		flag = true;
		
		for(int j = 0; j < numOfPrimes; j++){
			if(i%primes[j] == 0){
				flag = false;
				break;
			}
		}
		if (flag) {
			primes[numOfPrimes] = i;
			numOfPrimes = numOfPrimes+1;
			if(numOfPrimes >= 10000){
				break;
			}
		}
	}
	for(int i=0; i<numOfPrimes; i++ ){
		System.out.printf("%6d", primes[i]);
	}
}
}