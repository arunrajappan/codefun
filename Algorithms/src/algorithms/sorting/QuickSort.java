package algorithms.sorting;

public class QuickSort implements SortingAlgorithm {
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
		print("Before Quick Sorting: ");
		printArray(input);
		doSort(input, 0, input.length-1);
		print("After Quick Sorting: ");
		printArray(input);
		println("");
		return 0;
	}
	
	private int doSort(int[] input, int startIndex, int endIndex){
		if(startIndex >= endIndex){
			return -1;
		}
		
		int pivot = partition(input, startIndex, endIndex);
		//println(startIndex + "::" + pivot + "::"+endIndex);
		doSort(input, startIndex, pivot-1);
		doSort(input, pivot+1, endIndex);
		return 1;
	}

	private int partition(int[] input, int startIndex, int endIndex) {
		int pivot = startIndex;
		int l = startIndex;
		int h = endIndex;
		while(l < h){
			while(input[l] < input[pivot]){
				l++;
			}
			while(input[h] > input[pivot]){
				h--;
			}
			swapItems(input, l,h);
			
		}
		return l;
	}

}
