public class ExamLCM{
    public static void main(String[] args){
        System.out.println("programmed by Yuki Fukuzato.\n");
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("最小公倍数 = " + lcm(a, b));
    }
    
    private static int gcd(int a, int b) {
        if(a < b)
		return gcd(b, a);
        if(b == 0)
		return a;
        return gcd(b, a % b);
    }
    
    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
