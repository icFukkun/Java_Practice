import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class ExamBubbleSort{
	public static void main(String[] args){
		System.out.println("programmed by Yuki Fukuzato.\n");
		ArrayList<Double> a = new ArrayList<Double>();
		int n = args.length;

		for(int h = 0; h < n; h = h+1){
			a.add(Double.parseDouble(args[h]));
		}

		System.out.println("ソート前 => " + a + "\n");

		for(int i = 0; i < n-1; i++){
			for(int j = n-1; j >= i+1; j = j-1){
				if(a.get(j-1) > a.get(j)){
					System.out.println(a.get(j-1) + "と" + a.get(j) + "を交換");
					swap(a, j-1, j);
				}
			}
		}

		System.out.println("\nソート後 => " + a);
	}

	static <t> void swap(List<t> list, int index1, int index2){
		t tmp = list.get(index1);
		list.set(index1, list.get(index2));
		list.set(index2, tmp);
	}
}
