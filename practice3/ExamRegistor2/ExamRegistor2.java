public class ExamRegistor2 {
	public static void main (String [] args) {
		System.out.println("\nprogrammed by Yuki Fukuzato\n");
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double r = a*b / (a+b);
		System.out.println("抵抗１" + a + "低高２" + b + "の合成抵抗 = " + r + "\n");
	}
}
