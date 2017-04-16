package net.wuyang.cheer.demo.ch06;

public class RevertSort {

	public static void main(String[] args) {
		int[] array ={1,2,3,5,7,8,9};
		RevertSort sorter = new RevertSort();
		sorter.sort(array);

	}
	public void sort(int[] array){
		System.out.println("oringinal array:");
		showArray(array);
		int temp;
		int len = array.length;
		for (int i= 0;i<len/2;i++){
			temp=array[i];
			array[i]=array[len - 1 - i];
			array[len -1 -i]=temp;
		}
		System.out.println("Revert array:");
		showArray(array);
		}
	public void showArray(int[] array){
		for (int i : array){
			System.out.print("\t"+i);
		}
		System.out.println();
	}

}
