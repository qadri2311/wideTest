package test_wide_technologies;

public class Main {

	public Main() {
		int arr[] = { 64, 34, 25, 12, 90, 11, 22 };
		int arr2[]= {2, 3, 4, 5, 6, 7, 8, 9, 1};
		//no 2
//		bubbleSort(arr2); 
		
		//no 3
		bubbleSortModification(arr2);
		
		//no 4
//		bubbleSortAltModification(arr2);
		System.out.println("Sorted array: ");
        printArray(arr);
	}

	//test no 2
	private void bubbleSort(int arr[]) {
		int temp;
		for (int i = arr.length - 1; i > 0; i--) {
            for (int j = arr.length - 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    
                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
		}
	}
	
	//test no 3
	private void bubbleSortModification(int arr[])
    {
        int temp;
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = arr.length - 1; j > arr.length - i - 1 ; j--) {
                if (arr[j] < arr[j - 1]) {
                    
                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }

        }
    }
	
	//test no 4
	private void bubbleSortAltModification(int arr[])
    {
        int temp;
        boolean swap;
        for (int i = arr.length - 1; i > 0; i--) {
        	swap = false;
            for (int j = arr.length - 1; j > arr.length - i - 1 ; j--) {
                if (arr[j] < arr[j - 1]) {
                    
                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swap = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (swap == false)
                break;
        }
    }
		
	static void printArray(int arr[])
    {
        int i;
        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	
	public static void main(String[] args) {
		new Main();
	}

}
