package javabook.ch5;

public class HelloWorld{
	private String msg;
	static int count = 0;
	static String prefix = "";
	
	public HelloWorld() {
		msg = "Hello World !!";
	}

	public HelloWorld(String msg) {
		this.msg = msg;
	}

	public HelloWorld(String msg, int option) {
		if(option == 1)
			this.msg = msg;
		else if(option == 2)
			this.msg = msg + ", �ȳ��ϼ���?";
	}
	
	public void print() {
		//System.out.println(msg);
		count++;
		System.out.println("[" + count + "]" + prefix + msg);
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public static void main(String[] args) {
		HelloWorld hello1 = new HelloWorld();
		hello1.print();
		
		HelloWorld hello2 = new HelloWorld("My Hello World!!");
		hello2.print();
		
		HelloWorld hello3 = new HelloWorld("Hello", 2);
		hello3.print();
		
		hello2.setMsg("�ݰ����ϴ�!!");
		System.out.println(hello2.getMsg());
		
		HelloWorld.prefix = "Greetings: ";
		hello2.print();
		hello3.print();
		
		HelloWorld.prefix = "�λ縻: ";
		hello2.print();
		hello3.print();
	}
}
