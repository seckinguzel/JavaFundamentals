package polymorphism;

public class Main {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		animal.makeNoise();
		dog.makeNoise();
		cat.makeNoise();
	}
}
