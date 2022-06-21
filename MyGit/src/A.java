

public class A {
	public static void main(String[] args) {
		System.out.println("This is master");
		System.out.println("This is devB");
		System.out.println("This is devC");
		B hello = new B();
		hello.sayHello();
		C bye = new C();
		bye.sayBye();
	}
}