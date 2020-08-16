package p0421;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalAction animalAction = new AnimalAction();
		Dog dog = new Dog();
		dog.name = "강아지";
		animalAction.Action(dog);
		System.out.println("------------------------");
		
		Cat cat = new Cat();
		cat.name = "고양이";
		animalAction.Action(cat);
		
	}

}
