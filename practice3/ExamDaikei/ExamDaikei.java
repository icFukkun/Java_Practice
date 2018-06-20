public class ExamDaikei {
	public static void main (String [] args) {
		System.out.println("\nprogrammed by Yuki Fukuzato\n");
		double u = Double.parseDouble(args[0]);
		double d = Double.parseDouble(args[1]);
		double h = Double.parseDouble(args[2]);
		double n = (u + d) * h / 2;
		System.out.println("(上底" + u + "下底)" + d + "×" + "高さ" + h + "÷2=" + n);
	}
}
