class Exercise4_2 {
	public static void main(String[] args) {
		int a = 0;
		for(int i = 1;i<=20;i++){
			if(i%2!=0 && i%3!=0) //�Ǵ��̿��� ||�� ��µ� Ʋ�ȴٳ���
				a+=i; //�� �̰� �װű��� 2�ǹ���� �ƴϸ鼭 3�ǹ���� �ƴѰ��� ���ÿ� �����ϴ°��� �ƴϰ�
		}//���� || -> && 174 -> 73
		System.out.println("a="+a);
	}
}