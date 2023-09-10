// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/
// Java program for the above approach
import java.util.ArrayList;
public class searchElm {
	public static int first(ArrayList list, int x){
		return list.indexOf(x);
	}
	public static int last(ArrayList list, int x){
		return list.lastIndexOf(x);
	}
	public static void main(String[] args){
		int arr[] = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };

		ArrayList<Integer> list = new ArrayList<>();
		for (int i : arr)
			list.add(i);

		int x = 8;
		System.out.println("First Occurrence = "+ first(list, x));
		System.out.println("Last Occurrence = "+ last(list, x));

	}
}