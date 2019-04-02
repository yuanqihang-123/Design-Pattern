package cn.yqh.adapter;

/**
 * 仿生机器人：BioRobot.java。它可以叫和慢慢跑
 * 这是原有的代码，我们现在不满于仿生机器人，想结合狗实现类狗机器人
 * @author 袁
 *
 */
public class BioRobot implements Robot{

	public void cry() {
		System.out.println("仿生机器人在叫喊......！");
		
	}

	public void move() {
		System.out.println("仿生机器人在移动......！");
	}

}
