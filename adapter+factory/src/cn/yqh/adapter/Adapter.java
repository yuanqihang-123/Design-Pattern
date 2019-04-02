package cn.yqh.adapter;

import cn.yqh.factory.Animal;

/**
 * 适配器，这个适配器能够使仿生机器人像狗一样叫，一样跑。
 * @author 袁
 *
 */
public class Adapter implements Robot{

	private Animal animal;
	//通过构造方法注入狗
	public Adapter(Animal animal) {
		super();
		this.animal = animal;
	}

	public void cry() {
		System.out.print("机器人模拟叫......");
		animal.animalCry();
	}

	public void move() {
		System.out.print("机器人模拟跑......");
		animal.animalMove();
	}

	
}
