package algorithms.sorting;

public class InsertionSort implements SortingAlgorithm{
	private int startIndex = 0;
	private int increment = 1;
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
	
	//Default Constructor
	public InsertionSort(){}
	
	public InsertionSort(int startIndex, int increment){
		this.startIndex = startIndex;
		this.increment = increment;
	}
	
	@Override
	public int sort(int[] input) {
		print("Before Insertion Sorting: ");
		printArray(input);
		doSort(input);
		print("After Insertion Sorting: ");
		printArray(input);
		println("");
		return 1;
	}
	
	private int doSort(int[] input){
		//System.out.println("HashCode" + input.hashCode());
		for(int i=startIndex+increment; i< input.length;i+=increment){
			boolean itemsSwapped = false;
			for(int j=i; (j - increment)>=0 ; j-=increment){
				if(input[j] < input[j-increment]){
					swapItems(input, j-increment, j);
					itemsSwapped = true;
				}
				if(!itemsSwapped){
					break;
				}
			}
		}
		return 1;
	}
}
