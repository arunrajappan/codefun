import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import algorithms.fun.BinaryTree;
import algorithms.fun.Node;
import algorithms.fun.ReverseString;
import algorithms.search.BinarySearch;
import algorithms.sorting.BubbleSort;
import algorithms.sorting.InsertionSort;
import algorithms.sorting.MergeSort;
import algorithms.sorting.QuickSort;
import algorithms.sorting.SelectionSort;
import algorithms.sorting.ShellSort;

public class Main {

	public static void main(String args[]){
		int[] input = {4,5,6,2,1,7,10,3,8,9,-2,-6,0};
		Scanner console = new Scanner(System.in);
		
		//Selection sort
		SelectionSort selectionSort = new SelectionSort();
		selectionSort.sort(input.clone());
		
		//Bubble sort
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.sort(input.clone());
		
		//Insertion Sort
		InsertionSort inserstionSort = new InsertionSort();
		inserstionSort.sort(input.clone());
		
		//Shell Sort
		ShellSort shellSort = new ShellSort(0,3);
		shellSort.sort(input.clone());
		
		//Merge Sort
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(input.clone());
		
		//Quick Sort
		QuickSort quickSort = new QuickSort();
		quickSort.sort(input.clone());
		
		//Binary Search
//		BinarySearch binSearch = new BinarySearch(input.clone());
//		System.out.print("Enter integer to search: ");
//		Integer searchValue = null;
//		while(searchValue == null){
//			if(console.hasNextInt()){
//				searchValue = console.nextInt();
//				System.out.println(searchValue);
//				if(searchValue != null)
//					break;
//			}else{
//				System.out.println("Please enter a integer value!");
//				console.next();
//			}
//		}
//		System.out.println("" + binSearch.search(searchValue.intValue()));
		
		//Reverse String
		ReverseString reverseString = new ReverseString();
		String inputStr = "arun";
		System.out.println("Reverse String is => " + reverseString.reverse(inputStr));
		
		//Binary Tree comparision
		List<Integer> data = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10)); 
		Collections.shuffle(data);
		
		List<Integer> data2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11));
		Collections.shuffle(data2);
		
		BinaryTree bt1 = new BinaryTree(data);
		BinaryTree bt2 = new BinaryTree(data2);
		BinaryTree.traverseAndPrintTree(bt1.getRoot(), "ROOT-");
		System.out.println("\nTwo binary trees are "+(bt1.compareTo(bt2) ? "same. " : "not same. "));
	}
}
