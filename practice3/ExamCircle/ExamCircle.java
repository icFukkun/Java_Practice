public class ExamCircle {
	public static void main (String [] args) {
		System.out.println("\nprogrammed by Yuki Fukuzato\n");
		double a = Double.parseDouble(args[0]);
		double b = 3.14;
		double c = 2 * a * b;
		double d = Math.pow(a,2) * b;
		System.out.println("円周 = 2×" + a + "×" + b + " = " + c + "\n" +
				"円面積 =" + a + "^2 ×" + b + " = " + d + "\n" 
				);
	}
}
