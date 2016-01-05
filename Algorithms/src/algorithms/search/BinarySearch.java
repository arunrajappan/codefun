package algorithms.search;

import algorithms.sorting.QuickSort;

public class BinarySearch {
	private int[] sortedInput;
	public BinarySearch(int[] input){
		QuickSort quickSort = new QuickSort();
		quickSort.sort(input);
		this.sortedInput = input.clone();
	}
	
	public int search(int searchValue){
		int low = 0;
		int high = sortedInput.length-1;
		if(searchValue < sortedInput[low] || searchValue > sortedInput[high]){
			return -1;
		}
		
		while(low <= high){
			int mid = low + (high - low)/2;
			if(sortedInput[mid] == searchValue){
				return mid;
			}
			if(sortedInput[mid] > searchValue){
				high = mid - 1;
			}else{
				low = mid + 1;
			}
		}
		return -1;
	}
	
	public int recursiveSearch(int searchValue){
		int low = 0;
		int high = sortedInput.length-1;
		return search(searchValue, low, high);
	}
	
	private int search(int searchValue, int low, int high){
		if(low > high){
			return -1;
		}
		int mid = low + (high - low)/2;
		if(sortedInput[mid] == searchValue){
			return mid;
		}
		if(sortedInput[mid] > searchValue){
			high = mid - 1;
		}else{
			low = mid + 1;
		}
		
		return (search(searchValue, low, high));
		
	}

}
