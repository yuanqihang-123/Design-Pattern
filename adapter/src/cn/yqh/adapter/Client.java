package cn.yqh.adapter;

/**
 * 客户端运行
 * @author 袁
 *
 */
public class Client {

	public static void main(String[] args) {
		//首先我们需要一只狗
		Dog dog = new Dog();
		
		//把狗进行包装，以生产类狗机器人
		Robot dogRobot = new Adapter(dog);
		
		dogRobot.cry();
		dogRobot.move();
	}
	
}
