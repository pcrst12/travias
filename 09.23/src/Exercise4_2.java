class Exercise4_2 {
	public static void main(String[] args) {
		int a = 0;
		for(int i = 1;i<=20;i++){
			if(i%2!=0 && i%3!=0) //또는이여서 ||를 썼는데 틀렸다나옴
				a+=i; //아 이거 그거구나 2의배수가 아니면서 3의배수가 아닌것을 동시에 충족하는것을 아니게
		}//수정 || -> && 174 -> 73
		System.out.println("a="+a);
	}
}