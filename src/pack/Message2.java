package pack;

public class Message2 implements MessageInter {
	@Override
	public void sayHello(String name) {
		System.out.println("반가워요 " + name + "님");
	}
}