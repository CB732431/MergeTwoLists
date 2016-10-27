// Based of the the program on http://coding111.blogspot.com/2015/12/programming-exercise-731.html
import java.util.Scanner;
public class MergeTwoLists {

	public static void main(String[] args) {

		// define first list
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list1:");
		int[] list1 = new int[input.nextInt()];
		for (int i = 0; i < list1.length; i++) {
			list1[i] = input.nextInt();
		}

		// define second list
		System.out.print("Enter list2:");

		int[] list2 = new int[input.nextInt()];

		for (int i = 0; i < list2.length; i++) {
			list2[i] = input.nextInt();

		}
		
		//define custom method
		int[] list3 = merge(list1, list2);

		// output merged list
		System.out.print("The merged list is ");

		for (int i = 0; i < list3.length; i++) {
			System.out.print(list3[i]+ " ");
		}
	}

	// Begin custom method
	public static int[] merge(int[] list1, int[] list2) {
		int[] list3 = new int[list1.length + list2.length];

		// Configure merged list
		int j = 0, k = 0;
		for (int i = 0; i < list3.length; i++) {
			if (k < list2.length && list1[j] > list2[k] ) {
				list3[i] = list2[k];
				k++;
			} else if (j < list1.length) {
				list3[i] = list1[j];
				j++;
			}

		}

		// return merged list
		return list3;

	}

{
	}
	}


