class VolMain {
  public static void main(String[] args) {
    Box cube = new Box(14.6);
    Box cone = new Box(1.1, 6.5);

    cube.volume();
    cone.volume();
  }
}

class Box {
  double a, r, h;
  Box (double a) {
    this.a = a;
  }

  Box (double r, double h) {
    this.r = r;
    this.h = h;
  }

  void volume() {
    if (a != 0.0) 
      System.out.println("Vol of cube is: " + Math.pow(a, 3));
    else
      System.out.println("Vol of cone is: " + 1.0/3 * 3.14 * Math.pow(r, 2) * h);
  }
}