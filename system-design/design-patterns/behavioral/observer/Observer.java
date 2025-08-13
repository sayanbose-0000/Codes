// The Observer design pattern in Java defines a one-to-many dependency where when one object (subject) changes state,
// all its dependents (observers) are notified automatically.

// Its push-based meaning the subject sends data directly to observers when it changes, rather than observers asking for it later

// Student is the observer
import java.util.ArrayList;

class Student {

  private String name;

  Student(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  void notified() {
    System.out.println("Student " + name + " has been notified");
  }
}

// Teacher is subject
class Teacher {

  ArrayList<Student> students;

  Teacher() {
    students = new ArrayList<Student>();
  }

  // Subscribe event -> Say we subscibe to his/her google classroom
  void subscribe(Student student) {
    System.out.println("!-- " + student.getName() + " has subscribed --!");
    students.add(student);
  }

  // Unsubscribe event -> Say we unsubscribe to his/her google classroom
  void unsubscribe(Student student) {
    System.out.println("!-- " + student.getName() + " has unsubscribed --!");
    students.remove(student);
  }

  void notifyEveryone() {
    students.forEach(student -> student.notified());
  }
}

public class Observer {

  public static void main(String[] args) {
    Teacher teacher = new Teacher();

    Student ayan = new Student("Ayan Sharma");
    Student ankit = new Student("Ankit Dubey");
    Student riya = new Student("Riya Sen");
    Student anurag = new Student("Anurag Chowbey");
    Student rohan = new Student("Rohan Adhikary");

    teacher.subscribe(ayan);
    teacher.subscribe(ankit);
    teacher.subscribe(riya);

    teacher.notifyEveryone();

    teacher.unsubscribe(ankit);

    teacher.subscribe(anurag);
    teacher.subscribe(rohan);

    teacher.notifyEveryone();

    teacher.unsubscribe(riya);

    teacher.notifyEveryone();
  }
}
