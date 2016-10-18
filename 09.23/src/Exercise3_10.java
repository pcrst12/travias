class Exercise3_10 {
	public static void main(String[] args) {
		char ch = 'A';
		
		char lowerCase = (ch+32 = 'a'<= ch && ch <= 'z') ? ch+32 : ch; // 조건문 ? 참 : 거짓
		//ch+32 = 소문자, 대문자일 경우에는 ch+32, 소문자일 경우에는 ch 를 해야하는데 
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase);
	}
}