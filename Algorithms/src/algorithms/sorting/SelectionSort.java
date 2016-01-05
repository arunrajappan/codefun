package algorithms.sorting;

public class SelectionSort implements SortingAlgorithm {
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
		// TODO Auto-generated method stub
		print("Before Sorting: ");
		printArray(input);
		doSort(input);
		print("After Sorting: ");
		printArray(input);
		println("");
		return 1;
	}
	
	private void doSort(int[] input){
		for(int i=0;i<input.length; i++){
			for(int j=i+1;j<input.length;j++){
				if(input[j] < input[i]){
					swapItems(input, i, j);
				}
			}
		}
		return;
	}

}
