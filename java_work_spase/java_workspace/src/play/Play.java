package play;

public class Play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RanMaker ran = new RanMaker();
		//ran.MakeRan = all개 중에 win개 당첨
		int all= 13;
		int win= 7;
		System.out.printf("확률 : %.2f%%\n",((double)win/(double)all*100));
		
		
		System.out.println(ran.MakeRan(all, win));
	}

}
