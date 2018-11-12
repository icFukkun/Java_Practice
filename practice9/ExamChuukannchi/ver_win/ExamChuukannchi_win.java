import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class ExamChuukannchi{
	public static void main(String[] args){
		System.out.println("programmed by Yuki Fukuzato.\n");
		ArrayList<Double> a = new ArrayList<Double>();
		int n = args.length;

		for(int h = 0; h < n; h = h+1){
			a.add(Double.parseDouble(args[h]));
		}

		for(int i = 0; i < n-1; i++){
			for(int j = n-1; j >= i+1; j = j-1){
				if(a.get(j-1) > a.get(j)){
					swap(a, j-1, j);
				}
			}
		}

		System.out.println("与えられたリスト : " + a);
		System.out.println("最大値 : " + a.get(args.length-1) + "\n" +
				   "最小値 : " + a.get(0));
		ave(a, args.length); mid(a, args.length);
		System.out.print("\n");
	}

	static <t> void swap(List<t> list, int index1, int index2){
		t tmp = list.get(index1);
		list.set(index1, list.get(index2));
		list.set(index2, tmp);
	}

	static void ave(List<Double> list, int size){
		Double num = 0.0;
		for(int i = 0; i < size; i++)
			num += list.get(i);
		Double deb = num / size;
		System.out.println("平均値 : " + deb);
	}

	static <t> void mid(List<t> list, int size){
		double n = (double) size;
		double prime = Math.floor(n/2);
		System.out.println("中間値 : " + list.get((int)prime));
	}
}
