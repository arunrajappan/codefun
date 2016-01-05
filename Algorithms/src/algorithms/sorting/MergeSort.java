package algorithms.sorting;

public class MergeSort implements SortingAlgorithm{
	private int[] tempOutput;
	private boolean debug = true;
	
	@Override
	public void setDebug(boolean value) {
		this.debug = value;		
	}

	@Override
	public boolean getDebug() {
		return this.debug;
	}

	@Override
	public void print(String printStr) {
		if(debug)
			System.out.print(printStr);
	}

	@Override
	public void println(String printStr) {
		if(debug){
			System.out.println(printStr);
		}
		
	}
	
	@Override
	public int sort(int[] input) {
		print("Before Merge Sorting: ");
		printArray(input);
		doSort(input, 0, input.length-1);
		print("After Merge Sorting: ");
		printArray(input);
		println("");
		return 1;
	}
	
	private int doSort(int[] input, int startIndex, int endIndex){
		if(startIndex >= endIndex){
			return 1;
		}
		
		int pivot = (startIndex + endIndex)/2;
		
		doSort(input, startIndex, pivot);
		doSort(input, (pivot+1), endIndex);
		doMerge(input, startIndex, pivot, endIndex);
		return 1;
	}
	
	private int doMerge(int[] input, int startIndex, int pivot, int endIndex){
		tempOutput = input.clone();
		int i = startIndex;
		int j = pivot+1;
		int  k = startIndex;
		while(i <= pivot && j<=endIndex){
			if(tempOutput[i] < tempOutput[j]){
				input[k] = tempOutput[i];
				i++;
			}else{
				input[k] = tempOutput[j];
				j++;
			}
			k++;			
		}
		
		while(i <= pivot){
			input[k] = tempOutput[i];
			k++;
			i++;
		}
		return 1;
	}
}
