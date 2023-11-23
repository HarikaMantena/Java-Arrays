package arrays;

public class UnionArrays {

	public static void main(String[] args) {
		int i = 0,j=0;
		int arr1[]={1,2,3};
		int arr2[]= {4,5,6};
		int m = arr1.length;
		int n = arr2.length;

		//Loop through both arrays until one of them is exhausted  
		while(i<m && j<n) {  
			if(arr1[i] < arr2[j]) {
				// If the element at i is smaller, print it and move to the next element in arr1
				System.out.print(arr1[i++]+ " ");
			}
			else if(arr1[i] > arr2[j]) {
				// If the element at j is smaller, print it and move to the next element in arr2  
				System.out.print(arr2[j++]+ " ");
			}
			else {
				// If the elements are equal, print one of them and move both pointers to the next element  
				System.out.print(arr1[i++]+ " ");
				j++;
			}
		}

		// If there are any remaining elements in arr1, print them  
		while(i < m) {
			System.out.print(arr1[i++]+ " ");
		}

		// If there are any remaining elements in arr2, print them  
		while(j < n) {
			System.out.print(arr2[j++]+ " ");
		}
	}
}
