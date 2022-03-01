package com.lovebabbar.arraysdemo;


class SortArrayOf0And1
{
	public void sortArray(int a[])
	{
		int low=0;
		int mid=0;
		int high=a.length-1;
		
		while(mid<=high) {
			if(a[mid]==0) {
				swap(a, low, mid);
				low++;
				mid++;
			}
			else if (a[mid]==1) {
				mid++;
			}
			else {
				swap(a, mid, high);
				high--;
			}
		}
	}
	
	private void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
}
public class DNFSorting {
	public static void main(String[] args) {
		SortArrayOf0And1 arr = new SortArrayOf0And1();
		int a[]= {1,0,2,1,2,0,1,1,2,0};
		
		System.out.println("---initial array");
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"  ");
		}
		arr.sortArray(a);
		System.out.println("\n"+"---After Sorting");
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"  ");
		}
	}
}
