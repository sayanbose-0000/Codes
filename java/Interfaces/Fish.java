public class Fish implements Prey,Predator{//implements both Prey and Predator interface

	@Override
	public void flee(){
		System.out.println("Thr fish is fleeing from a larger fish");
	}

	@Override
	public void hunt(){
		System.out.println("The fish is hunting smaller fishes");
	}
}