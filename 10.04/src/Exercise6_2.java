class Exercise6_2 {
	public static void main(String args[]) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info());
		System.out.println(card2.info());
		}
	}
	class SutdaCard {
		int num;
		boolean isKwang;
		
		SutdaCard() {
			this(1, true); // SutdaCard(1, true)�� ȣ���Ѵ�.
		}
		SutdaCard(int num, boolean isKwang) {
			this.num = num;
			this.isKwang = isKwang;
		}
		String info() { // ���ڸ� ���ڿ��� ��ȯ�Ѵ�. ��(��)�� ��� K�� �����δ�.
			return num + ( isKwang? "K" : "");
		}
}
