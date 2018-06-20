public class ExamFunc {
	public static void main (String [] args) {
		System.out.println("\nprogrammed by Yuki Fukuzato\n");
		double x = Double.parseDouble(args[0]);
		double y1 = Math.pow(x,3) + 3 * Math.pow(x,2) + 2;
		double y2 = Math.pow(x+3,3) / 5 - 7;
		System.out.println("y = x^3 + 3x^2 + 2 = " + y1 + "\n" +
				"y = (x+3)^3/5 - 7 = " + y2 + "\n" 
				);
	}
}
