// Write a Java Program to create a base class Animal having properties: consume food, capable of motion.
// Two subclass Mammal and Reptile having features: covered with hairs and feed breast milk to its infants, can
// crawl have scales and cold blooded respectively.
// Show the properties of Human and cow for Mammal category, snake and crocodile for reptile category
// adding one new feature for each of the classes.

abstract class Animal {
  final static String food = "food ";
  final static String motion = "motion ";

  void animal() {
    System.out.println(food + motion);
  }
}

abstract class Mammal extends Animal {
  final static String hairs = "hairs ";
  final static String milk = "milk ";
  void mammal() {
    System.out.println(hairs + milk);
  }
}

abstract class Reptile extends Animal {
  final static String scales = "scales ";
  final static String coldblooded = "Coldblooded ";
  void reptile() {
    System.out.println(scales + coldblooded);
  }
}

class Human extends Mammal {
  String human = "human ";
  void human() {
    System.out.println(human);
  }
}

class Cow extends Mammal {
  String cow = "cow ";
  void cow() {
    System.out.println(cow);
  }
}

class Snake extends Reptile {
  String snake = "snake ";
  void snake() {
    System.out.println(snake);
  }
}

class Crocodile extends Reptile {
  String crocodile = "crocodile ";
  void crocodile() {
    System.out.println(crocodile);
  }
}

class Main {
  public static void main(String[] args) {
    Human human  = new Human();
    Cow cow = new Cow();
    Snake snake = new Snake();
    Crocodile crocodile = new Crocodile();


    human.human();
    human.mammal();
    human.animal();

    System.out.println();
    
    cow.cow();
    cow.mammal();
    cow.animal();
    System.out.println();
    
    snake.snake();
    snake.reptile();
    snake.animal();
    System.out.println();

    crocodile.crocodile();
    crocodile.reptile();
    crocodile.animal();
  }
}