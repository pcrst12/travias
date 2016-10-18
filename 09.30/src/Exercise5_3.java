class Exercise5_3 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50};
		int sum = 0;
		for(int i=0;i<arr.length;i++){ //배열에 있는 수 하나하나를 다 sum에다가 for문으로 더한다.
			sum+=arr[i];//뿌잌
		}
		System.out.println("sum="+sum);
	}

}
