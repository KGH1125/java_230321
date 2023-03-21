package play;

public class RanMaker {

	/*
	 * 전체 1,2,3,4,5 당첨 1,2 전체중에 랜덤으로 뽑아서 당첨이랑 비교
	 * 
	 * 
	 * 
	 */

	public boolean MakeRan(int all, int win) {

		boolean end = false;
		int num = (int) ((Math.random()) * all) + 1;

		for (int i = 1; i <= win; i++) {
			if (num == i) {
				end = true;
			}
		}

		return end;

	}
}
