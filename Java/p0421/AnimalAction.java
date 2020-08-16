package p0421;

public class AnimalAction {
	public void Action(Animal animal){
		animal.Cry();
		if(animal instanceof Dog){
			((Dog) animal).Run();
		} else if(animal instanceof Cat){
			((Cat) animal).Grooming();
		}
	}
}
