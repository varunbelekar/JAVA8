interface Sayable1 {
	void say();
}

public class MethodRefereence {
	public static void sayHello() {
		System.out.println("hello world");
	}

	public void instanceSayHello() {
		System.out.println("hello world using instance");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sayable1 s = MethodRefereence::sayHello;// Reference to a static method.
		s.say();

		s = new MethodRefereence()::instanceSayHello;// Reference to instance
														// method.
		s.say();
	}

}
