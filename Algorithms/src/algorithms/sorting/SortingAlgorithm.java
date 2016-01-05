package algorithms.sorting;

public interface SortingAlgorithm {
	public int sort(int[] input);
	
	//Default function to print array items
	public default void printArray(int[] input){
		for(int i=0; i <input.length; i++){
			print(""+input[i]);
			if(i < input.length - 1){
				print(",");
			}
		}
		println("");
	}
	
	//Default function to swap the items
	public default void swapItems(int[] arr, int idx1, int idx2) {
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}
	
	//Set Debugging off
	public void setDebug(boolean value);
	
	public boolean getDebug();
	
	public void print(String printStr);
	public void println(String printStr);

}
