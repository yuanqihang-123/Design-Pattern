package cn.yqh.factory;
/**
 * Dog.java。可以旺旺叫和快快跑。
 * @author 袁
 *
 */
public class Dog implements Animal{

	
	public void animalCry() {
		System.out.println("狗在汪汪叫......");
		
	}
	public void animalMove() {
		System.out.println("狗在快快跑......");
		
	}
}
