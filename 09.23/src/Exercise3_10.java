class Exercise3_10 {
	public static void main(String[] args) {
		char ch = 'A';
		
		char lowerCase = (ch+32 = 'a'<= ch && ch <= 'z') ? ch+32 : ch; // ���ǹ� ? �� : ����
		//ch+32 = �ҹ���, �빮���� ��쿡�� ch+32, �ҹ����� ��쿡�� ch �� �ؾ��ϴµ� 
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase);
	}
}