package algorithms.sorting;

public class BubbleSort implements SortingAlgorithm {
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
		print("Before Sorting: ");
		printArray(input);
		doSort(input);
		print("After Sorting: ");
		printArray(input);
		println("");
		return 1;
	}
	
	private int doSort(int[] input){
		//System.out.println("HashCode" + input.hashCode());
		for(int i=0; i< input.length-1;i++){
			boolean itemsSwapped = false;
			for(int j=input.length-1; j>i ; j--){
				if(input[j] < input[j-1]){
					swapItems(input, j-1, j);
					itemsSwapped = true;
				}
			}
			
			if(!itemsSwapped){
				break;
			}
		}
		return 1;
	}
	
}
