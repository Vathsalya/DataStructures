import java.util.ArrayList;
import java.util.List;


public class LargestCommonInteger {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<>();
		l1.add(62);
		l1.add(80);
		l1.add(51);
		l1.add(43);
		l1.add(23);
		l1.add(90);

		List<Integer> l2 = new ArrayList<>();
		l2.add(32);
		l2.add(88);
		l2.add(51);
		l2.add(40);
		l2.add(23);
		l2.add(90);

		int largest = findCommonLargest(l1,l2);
		System.out.println(largest);

	}
	private static int findCommonLargest(List<Integer> list1, List<Integer> list2) {

		int[] array1 = convertListtoArray(list1); // Converting a list to array takes O(n)time
		int[] array2 = convertListtoArray(list2); //Converting a list to array takes O(n)time
//Running time till here is O(n)+O(n)

		//Sorting the elements in both the arrays
		MERGE_SORT(array1,0,array1.length-1); // Merge sort takes O(nlogn)time
		MERGE_SORT(array2,0,array2.length-1); // Merge sort takes O(nlogn)time
//Running time = O(n)+O(n)+O(n log n)
		
		int[] sortedArray1 = array1;
		int[] sortedArray2 = array2;
		int max = 0;
		
		
		for(int searchEle:sortedArray1){ //O(n) time
			int commonInteger = BinarySearch(sortedArray2,0,sortedArray2.length-1,searchEle); //Binary search takes O(log n) time
			if(commonInteger!=-1){
				if(commonInteger > max)
					max = commonInteger;
			}
		}	
//Running time =  O(n)+O(n)+O(n log n)+O(n log n)
		//2*O(nlog n) + 2*O(n)
		// Therefore the running time to find the largest common integer from two unsorted lists takes O(n log n)
		return max;
	}
	private static int[] convertListtoArray(List<Integer> list){
		int[] array = new int[list.size()];
		int count=0;
		for(int listElement:list){
			array[count] = listElement;
			count++;	
		}
		return array;
	}
	private static void MERGE_SORT(int[] arr, int low, int high) {
		if(low < high){
			int mid = ((low+high)/2);
			MERGE_SORT(arr,low,mid);
			MERGE_SORT(arr,mid+1,high);
			MERGE(arr,low,mid,high);
		}
	}
	private static void MERGE(int[] arr, int low, int mid, int high) {
		int L_size = (mid-low)+1; 
		int R_size = high - mid;

		int[] L_arr = new int[L_size+1];
		int[] R_arr = new int[R_size+1];

		for(int i=0;i<L_size;i++){
			L_arr[i] = arr[low+i];	
		}
		for(int j =0;j<R_size;j++){
			R_arr[j] = arr[mid+j+1];

		}
		L_arr[L_size] = Integer.MAX_VALUE;
		R_arr[R_size] = Integer.MAX_VALUE;
		int L_index=0,R_index=0;

		for(int k =low;k<=(high);k++){

			if(L_arr[L_index]<R_arr[R_index]){
				arr[k] = L_arr[L_index];
				L_index++;
			}else{
				arr[k] = R_arr[R_index];
				R_index++;
			}
		}	
	}
	private static int  BinarySearch(int[] arr, int low, int high,int searchEle) {

		if (low > high) return -1;
		int mid = (low+high)/2;
		if(searchEle == arr[mid])
			return arr[mid];
		if(searchEle<arr[mid])
			return BinarySearch(arr, low, mid-1, searchEle);
		else if(searchEle>arr[mid])
			return BinarySearch(arr,mid+1,high,searchEle);

		return -1;
	}
}
