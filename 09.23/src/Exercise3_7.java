class Exercise3_7 {
	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = 5/9f *(fahrenheit - 32); //반올림을 어떻게 처리하는거지 +0.5에 /10*10하면 될거같기도한데
		
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
	}
}