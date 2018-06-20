public class ExamQuadraticEquation{
	public static void main(String [] args){
		System.out.println("programmed by Yuki Fukuzato.");
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);
		double D,x0,x1,x2,x3;
		D = b*b - 4*a*c;
		x0 = -b / (2*a);

		if(D > 0){
			x1 = (+Math.sqrt(D)) / (2*a);
			x2 = -x0 + x1;
			x3 = -x0 - x1;
			System.out.println("実数解が2つあります \n" + x2 + "\n" + x3);
		}
		
		if(D == 0){
			x1 = -x0;
			System.out.println("解は1つです \n" + x1);
		}

		if(D < 0){
			x1 = (+Math.sqrt(-D)) / (2*a);
			System.out.println("虚数解が2つあります \n" + x0 + " + " + x1 + "i\n" + x0 + " - " + x1 + "i");
		}
	}
}
