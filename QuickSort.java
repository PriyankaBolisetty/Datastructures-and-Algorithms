package practicePrograms;

import java.util.Scanner;

public class QuickSort {
	
	public static void main(String[] args){
		int[] A;
		int size, p = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		size = input.nextInt();
		
		A = new int[size];
		int r = A.length;
		
		for(int i = 0; i < size; i++){
			System.out.println("Enter element " + (i + 1));
			A[i] = input.nextInt();
		}
		
		quicksort(A, p, A.length - 1);	
		
		System.out.println("Sorted array");
		for(int i = 0; i < size; i++){
			System.out.print(A[i] + " ");
		}
	}
	
	public static void quicksort(int[] A, int p, int r){
		int q;
		
		if(p < r){
			q = partition(A, p, r);
			quicksort(A, p, q - 1);
			quicksort(A, q + 1, r);
		}
	}
	
	public static int partition(int[] A, int p, int r){
		int x = A[r];
		int i = p - 1;
		
		for(int j = p; j <= r - 1; j++){
			if(A[j] <= x){
				i = i + 1;
				swap(A, i, j);
				
			}
		}
		swap(A, i + 1, r);
		return i + 1;
	}
	
	public static void swap(int[] A, int i, int j){
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
}
