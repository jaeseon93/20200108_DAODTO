package co.jessie.sort;

import java.lang.reflect.Array;

// 
public class Sort {
	private int[] arr;
	int temp;

	public int[] selectionSort(int[] num, int n) { // int[]로 리턴해야함 (내림차순sort(num), 오름차순sort(int))
		int min;// 지수(기준)를 잡아놓는 변수 선언

		arr = num; // 받아온 배열 num을 arr배열이 참조할수있도록 연결시켜줄것.
		for (int i = 0; i < arr.length - 1; i++) { // -1: 마지막은 정렬이 되었기 때문에 비교 불필요.
			min = i; // i의 요소값이 가장 작다고 전재.
			for (int j = i + 1; j < arr.length; j++) {
				if (n == 0) {
					if (arr[min] > arr[j])
						min = j; // n=0이면 오름차순
				} else {
					if (arr[min] < arr[j])
						min = j; // 아니면 내림차순
				}

			}
			if (min != i) {
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
		return arr;
	}

	public int[] bubbleSort(int[] num) {   //버블소트 :배열 두가지 비교하여 큰값은 제일 뒤로보내고 작은수는 앞으로 보내기.
		
		for(int i=0; i<arr.length-1; i++) {		
			for(int j=i+1; j<arr.length; j++) {
				//만약 앞의 수가 더크면 swap
				if(arr[i] < arr[j]) {
			     temp = arr[j];	
			}				
			}
			
		}
		return arr;
	}
	

	public int[] quickSort(int[] num) { // 퀵 소트

		return arr;
	}

}
