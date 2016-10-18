
class Exercise5_6 {

	public static void main(String[] args) {
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		System.out.println("money="+money);
		
		for(int i=0;i<coinUnit.length;i++){
			money = money%coinUnit[i];//동전나머지 구한다
			System.out.println(coinUnit[i]+"원:"+money/coinUnit[i]);//동전 숫자 출력
		}
	} //는 오류가 떴네요 왜 뜬거지 도대체 잘 모르겠습니다... 집에가서 해보는걸로.
}
