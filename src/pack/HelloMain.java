package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {
	public static void main(String[] args) {
		Message1 msg1 = new Message1();
		Message2 msg2 = new Message2();

		msg1.sayHello("홍길동");
		msg2.sayHello("고길동");

		MessageInter inter = msg1;
		inter.sayHello("tom");
		
		inter = msg2;
		inter.sayHello("Tam");
		
		System.out.println("-----------------");
		ApplicationContext context = new ClassPathXmlApplicationContext("init.xml");
		MessageInter inter2 = (MessageInter)context.getBean("message1");
		inter2.sayHello("oscar");
		inter2 = (MessageInter)context.getBean("message2");
		inter2.sayHello("oscar");
	}
}