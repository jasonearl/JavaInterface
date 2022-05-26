// multiple inheritance with INTERFACES
// since Java doesn't allow multiple inheritance
// with classes, that is a child class can only have 1
// parent class. But, parent classes can have mult child classes
public class Fish implements Prey, Predator{

	@Override
	public void hunt() {
		System.out.println("Fish is hunting");
		
	}

	@Override
	public void flee() {
		System.out.println("Fish is fleeing");
		
	}

}
