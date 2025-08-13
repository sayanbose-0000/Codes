interface Animal {
  void makeSound();
}

class Dog implements Animal {
  @Override
  public void makeSound() {
    System.out.println("Bow Bow");
  }
}

class Cat implements Animal {
  @Override
  public void makeSound() {
    System.out.println("Meow meow");
  }
}

class Pet {
  private Animal animal;

  void setAnimal(Animal animal) {
    this.animal = animal;
  }

  void makeSound() {
    animal.makeSound();
  }
}

public class State {
  public static void main(String[] args) {
    Pet pet = new Pet();

    pet.setAnimal(new Dog());
    pet.makeSound();

    // We can change state dynamically without creating new objects... we change the dog to a cat dynamically
    pet.setAnimal(new Cat());
    pet.makeSound();
  }
}
