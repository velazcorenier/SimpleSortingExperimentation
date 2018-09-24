package sortersTesterClasses;

import interfaces.Sorter;
import sorterClasses.InsertionSortSorter;

public class Exercise2 {
	public static void main(String[] args) {
		
		Sorter<Integer> sorter = new InsertionSortSorter<Integer>(); 
		Integer[] enteroArr = {5, 9, 20, 22, 20, 5, 4, 13, 17, 8, 22, 1, 3, 7, 11, 9, 10}, arr; 
		showArray("\n ---Original array of size to sort:", enteroArr);
		sorter.sort(enteroArr, new IntegerComparator1());
		arr = enteroArr.clone(); 
		showArray(sorter.getName() + ": ", arr);
		sorter.sort(enteroArr, new IntegerComparator2());
		arr = enteroArr.clone(); 
		showArray(sorter.getName() + ": ", arr);
	}

	private static void showArray(String msg, Integer[] a) {
		System.out.print(msg); 
		for (int i=0; i<a.length; i++) 
			System.out.print("\t" + a[i]); 
		System.out.println();
	}

}
