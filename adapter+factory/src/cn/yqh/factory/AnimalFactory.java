package cn.yqh.factory;

public class AnimalFactory {

	public static Animal getAnimal(String animalName) {
		if (animalName.equals("dog")) {
			return new Dog();
		} else if (animalName.equals("cat")) {
			return new Cat();
		} else if (animalName.equals("bird")) {
			return new Bird();
		} else {
			return null;
		}
	}
}
