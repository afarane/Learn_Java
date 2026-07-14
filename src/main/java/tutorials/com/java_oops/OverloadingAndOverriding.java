package tutorials.com.java_oops;

class Animal {

	// Method Overloading - Compile-time Polymorphism
	public void makeSound() {
		System.out.println("Animal makes a sound");
	}

	public void makeSound(int times) {
		for (int i = 0; i < times; i++) {
			System.out.println("Animal makes a sound");
		}
	}

	public void makeSound(String sound) {
		System.out.println("Animal makes sound: " + sound);
	}
}

class Dog extends Animal {

	// Method Overriding - Runtime Polymorphism
	@Override
	public void makeSound() {
		System.out.println("Dog barks");
	}

	// Overloading also applies within the subclass
	public void makeSound(boolean loud) {
		System.out.println(loud ? "Dog barks LOUDLY" : "Dog barks softly");
	}
}

public class OverloadingAndOverriding {

	public static void main(String[] args) {

		Animal a1 = new Animal();
		a1.makeSound();
		a1.makeSound(2);
		a1.makeSound("Woof");

		// Reference type is Animal, object type is Dog:
		// the overridden makeSound() runs - resolved at runtime
		Animal a2 = new Dog();
		a2.makeSound();

		Dog d1 = new Dog();
		d1.makeSound(true);
	}

}
