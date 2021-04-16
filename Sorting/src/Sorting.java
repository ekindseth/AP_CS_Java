import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class Sorting {

	public static ArrayList <Integer> List = new ArrayList<Integer>();
	public static ArrayList <Integer> cleanList = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
		Random generator = new Random();
		
		for (int i = 0; i < 1000; i++) {
			List.add(generator.nextInt (1000));
		}
		System.out.println("The full list is" + List);
		
		
		for (int i = 0; i < List.size(); i++) {
			if (!cleanList.contains(List.get(i))) {
				cleanList.add(List.get(i));
			}
		}
		System.out.println("The list  without dupilcates is" + cleanList);
		
		//Start of Bubble sort
		ArrayList <Integer> BubbleList = new ArrayList<Integer>(cleanList);
		
		for (int i = 0; i < BubbleList.size(); i++) {
			int tempnum = 0;
			for(int j = 0; j < BubbleList.size(); j++ ) {
				if (BubbleList.get(j) >  BubbleList.get(i)) {
					tempnum = BubbleList.get(i);
					BubbleList.set(i, BubbleList.get(j));
					BubbleList.set(j, tempnum);
				}	
			}
		}
		System.out.println("the Bubble sorted list is " + BubbleList);
		
		//Start of selection sort
		ArrayList <Integer> SelectList = new ArrayList<Integer>(cleanList);
		ArrayList <Integer> SelectedList = new ArrayList<Integer>();
		
		int smallest = SelectList.get(0);
		int tempIndex =1;
		for (int i = 0; i <  SelectList.size(); i++ ) {
			for(int j = 0 ; j < SelectList.size(); j++ ){
				   if (SelectList.get(j) < smallest) {
					   tempIndex = j;
					   smallest = SelectList.get(j);
				   }
				}
			SelectedList.add(SelectList.get(tempIndex));
			SelectList.remove(tempIndex);
			smallest = SelectList.get(0);
			tempIndex = 1;
		}
		System.out.println("the selection sorted list is " + SelectedList);
		
		//Start of Insertion sort
		ArrayList <Integer> InsertList = new ArrayList<Integer>(cleanList);
		
		for (int i = 0; i <  InsertList.size(); i++ ) {
			 int spottie = InsertList.get(i);  
	            int j = i-1;  
	            while ( (j > -1) && (InsertList.get(j) > spottie ) ) {  
	            	InsertList.set((j+1), InsertList.get(j));
	                j--;  
	            } 
	            InsertList.set((j+1), spottie);
		}
		System.out.println("the insertion sorted list is " + InsertList);
		
		//Start of merge sort
		ArrayList <Integer> MergeList = new ArrayList<Integer>(cleanList);
		
		int[] array = MergeList.stream().mapToInt(Integer::intValue).toArray();

		mergy(array, 0, array.length - 1); 
		
		System.out.println("the merge sorted list is " + Arrays.toString(array)); 
	}
	public static void mergy(int[] array, int start, int end) {  
		int middle = (start + end) / 2; 
		if (start < end) { 
			mergy(array, start, middle);
			mergy(array, middle + 1, end); 
		}  
		int i = 0, first = start, last = middle + 1;
		int[] temp = new int[end - start + 1];
		while (first <= middle && last <= end) {
			temp[i++] = array[first] < array[last] ? array[first++] : array[last++]; 
			} 
		while (first <= middle) {
			temp[i++] = array[first++]; 
			} 
		while (last <= end) {
			temp[i++] = array[last++]; 
			}
		i = 0;
		while (start <= end) {
			array[start++] = temp[i++];
		}
	}
}