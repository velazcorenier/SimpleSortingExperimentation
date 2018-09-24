package sortersTesterClasses;

import java.util.Random;

import interfaces.Sorter;
import sorterClasses.BubbleSortSorter;

public class Entero {
	private int value; 
	public Entero(int v) { value = v; }
	public int getValue() { return value; } 
	public String toString() { return value + "";}

	public static void main(String[] args) {
		Sorter<Entero> sorter = new BubbleSortSorter<Entero>(); 
		Entero[] enteroArr, arr; 
		// generate random arrays is size i and test...
		for (int i=1; i<=20; i += 5) { 
			enteroArr = randomValues(i);
			showArray("\n ---Original array of size " + i + " to sort:", enteroArr);
			sorter.sort(enteroArr, null);
			arr = enteroArr.clone(); 
			showArray(sorter.getName() + ": ", arr);
		}
	}

	private static void showArray(String msg, Entero[] a) {
		System.out.print(msg); 
		for (int i=0; i<a.length; i++) 
			System.out.print("\t" + a[i]); 
		System.out.println();
	}

	private static Entero[] randomValues(int i) {
		Random rnd = new Random(101); 
		Entero[] a = new Entero[i]; 
		for (int j=0; j<i; j++) {
			Entero entero = new Entero(rnd.nextInt(100));
			a[j] = entero; 
		}
		return a;
	}

}