package cn.yqh.adapter;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import cn.yqh.factory.Animal;
import cn.yqh.factory.AnimalFactory;

/**
 * 客户端运行
 * @author 袁
 *
 */
public class Client {
	

	public static void main(String[] args) throws IOException {
		//先根据properties文件获得要模拟的动物
		Properties properties = new Properties();
		InputStream is = Client.class.getClassLoader().getResourceAsStream("animal.properties");
		properties.load(is);
		String animalName = properties.getProperty("animalName");
		
		//这里我们从工厂中获得动物
		Animal animal = AnimalFactory.getAnimal(animalName);
		
		//把狗进行包装，以生产类狗机器人
		Robot dogRobot = new Adapter(animal);
		
		dogRobot.cry();
		dogRobot.move();
	}
	
}
