class Exercise3_8 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = a + b; // 오류
		
		char ch = 'A';
		ch = ch + 2; // 오류
		
		float f = 3 / 2;
		long l = 3000 * 3000 * 3000;
		
		float f2 = 0.1f;
		double d = 0.1;
		
		boolean result = d==f2;
		
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
	}
}