package cn.yqh.adapter;

/**
 * 适配器，这个适配器能够使仿生机器人像狗一样叫，一样跑。
 * @author 袁
 *
 */
public class Adapter implements Robot{

	private Dog dog;
	//通过构造方法注入狗
	public Adapter(Dog dog) {
		super();
		this.dog = dog;
	}

	public void cry() {
		System.out.print("机器人模拟狗叫......");
		dog.dogCry();
	}

	public void move() {
		System.out.print("机器人模拟狗跑......");
		dog.dogMove();
	}

	
}
