public class ExamToRadians {
	public static void main (String [] args) {
		System.out.println("\nprogrammed by Yuki Fukuzato\n");
		double a = Double.parseDouble(args[0]);
		double b = a * 3.14 / 180;
		System.out.println("度数表示" + a + " => ラジアン表示" + b + "\n");
	}
}
