package algorithms.sorting;

public class ShellSort implements SortingAlgorithm{
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
	public ShellSort(){}
	
	public ShellSort(int startIndex, int increment){
		this.startIndex = startIndex;
		this.increment = increment;
	}
	
	@Override
	public int sort(int[] input) {
		print("Before Shell Sorting: ");
		printArray(input);
		doSort(input);
		print("After Shell Sorting: ");
		printArray(input);
		println("");
		return 1;
	}
	
	private int doSort(int[] input){
		for(int i = input.length/2; i >=1 ; i/=2){
//			for(int j=0;(j+increment) < input.length;j+=increment){
			for(int j=0;(j) <= i;j++){
				InsertionSort insertionSort = new InsertionSort(j,i);
				insertionSort.setDebug(false);
				insertionSort.sort(input);
			}
		}
		return 1;
	}
}
