package co.jessie.sort;

public class MainApp {

	public static void main(String[] args) {
//		Rank rank = new Rank();
		int[] result;
		int[] sungjuk = {90,40,100,100,80,70,90};		
//        rank.run(sungjuk);
        
        Sort sort = new Sort();
        result = sort.selectionSort(sungjuk,1); //selectionSort를 호출할때 리턴해야할 값이 배열값이기때문에 
                                              //위에 result라는 배열을 따로 선언해주고 이 구문에도 저장시켜준다.
	
        for(int i =0;i<result.length;i++) {
        	System.out.print(result[i] + " ");
        }
	}

}
