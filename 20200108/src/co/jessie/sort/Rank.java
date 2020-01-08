package co.jessie.sort;

public class Rank {
	// 순위 가지기
	private int[] score;
	private int[] rank; // 내부에서 내가 쓸 것.

	// 순위를 구하기 위한 배열초기화
	private void arrayInit(int[] num) {
		score = new int[num.length]; //heap영역에 할당되도록 배열 객체만들어주기.
		rank = new int[num.length]; //heap영역에 할당되도록 배열 객체만들어주기.
		for (int i = 0; i < num.length; i++) {
			score[i] = num[i]; // 배열은 그 자체가 주소, 배열초기화해서 사용하는방법
			rank[i] = 1; // 배열에 있는 점수는 일단 모두 1등이다.
		}
	}

	// 순위구하는 매소드
	private void rankAlgorithm() {
		for (int i = 0; i < score.length; i++) { //순위결정 시작
			for(int j=i+1; j<score.length;j++) {  //j=i+1 : j가 i보다 하나 커야지 그다음값으로 비교할수 있으니까.
				if(score[i] < score[j])
					rank[i]++;
				else if(score[i] > score[j])
				rank[j]++;
			} //순위 결정 끝
		} 
	}
	//출력하는 매소드
	private void toPrint() {
		for(int i =0; i<score.length;i++) {
			System.out.println("점수:" +score[i]+ "  " + rank[i]+ " 등 ");
			
		}
	}
	
	
	//바깥에서 불러내도록  매소드 하나 생성  main에서 run만 실행시키면 됨 (캡슐화)
	public void run(int[] outNum) {
		arrayInit(outNum);
		rankAlgorithm();
		toPrint();
	}

}
