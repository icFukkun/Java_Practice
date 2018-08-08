import java.io.*;

class ExamFileCopy{
	public static void main(String[] args) throws IOException{
		System.out.println("programmed by Yuki Fukuzato.");
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("test1.txt")));
		try{
			while(true){
				String s = br.readLine();
				if(s == null)
					break;
				pw.println(s);
			}
			br.close();
			pw.close();
		}catch (IOException e){
			System.out.println(e);
		}
	}
}
