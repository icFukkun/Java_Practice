public class ExamCombination{
	public static void main(String[] args){
		System.out.println("programmed by Yuki Fukuzato.\n");

		int n = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		double p, c = 0.0;

		int n_st = 1; /*nの階乗*/
		for(int i = n; i > 0; i--)
			n_st = n_st * i;

		int m_st = 1; /*mの階乗*/
		for(int i = m; i > 0; i--)
			m_st = m_st * i;

		int nsubm = 1;
		for(int i = n-m; i > 0; i--)
			nsubm = nsubm * i;

		p = (double)n_st / (double)nsubm;
		System.out.println(n + "P" + m + " = " + p);

		c = (double)n_st / ((double)m_st * (double)nsubm);
		System.out.println(n + "C" + m + " = " + c);
	}
}
