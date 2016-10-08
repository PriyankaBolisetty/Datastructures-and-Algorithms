package JavaInterviewsExposed;

public class WorkingOnArrays {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 5, 9, 10, 1, 2, 3, 5, 10};
		int maxNo = findLargestElement(array);
		
		printArray(array);
		shiftElementsToLeft(array);
		int[] array1 = {1, 2, 3, 4, 5, 5, 9, 10, 1, 2, 3, 5, 10};
		shiftElementsToRight(array1);
	}
	
	public static int findLargestElement(int[] array){
		int max = array[0];
		int index = 0;
		
		for(int  i = 0; i < array.length; i++){
			if(array[i] > max){
				max = array[i];
				index = i;
			} 
		}
		System.out.println("Smallest index is: " + index);
		return max;
	}
	
	public static void shiftElementsToLeft(int[] array){
		int temp = array[0];
		for(int i = 1; i< array.length; i++){
			array[i - 1] = array[i];
		}
		array[array.length - 1] = temp;
		printArray(array);
	}
	
	public static void shiftElementsToRight(int[] array){
		System.out.println("Shifting elements to right");
		printArray(array);
		int length = array.length;
		int lastEle = array[length - 1];
		
		for(int i = length - 1; i >= 0; i--){
			if(i > 0)
			array[i] = array[i - 1];
		}
		array[0] = lastEle;
		printArray(array);
	}
	
	public static void printArray(int[] array){
		for(int i: array){
			System.out.print(i + ", ");
		}
		System.out.println();
	}
}
