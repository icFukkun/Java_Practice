import java.io.*;

class ExamKeyboardInput{
	public static void main(String[] args){
		System.out.println("programmed by Yuki Fukuzato.\n");
		boolean A = true;
		for(;A;){
			try{
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("> ");
				String s = br.readLine();
				if(s.equals("bye"))
					System.out.println("バイバイ");
				else
					System.out.println("入力文字列 = " + s + "\n");
			}catch (IOException e) {
				System.out.println(e);
			}
		}
	}
}
