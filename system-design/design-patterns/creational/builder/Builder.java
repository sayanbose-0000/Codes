// Create object step by step using methods one by one rather than constructor
// We can chain methods to build objects of a class

class Computer {

  private String cpu;
  private String gpu;
  private String ram;
  private String ssd;

  Computer(BuildComputer buildComputer) {
    this.cpu = buildComputer.getCpu();
    this.gpu = buildComputer.getGpu();
    this.ram = buildComputer.getRam();
    this.ssd = buildComputer.getSsd();
  }

  @Override
  public String toString() {
    return (
      "Computer built! Specs- Cpu: " +
      cpu +
      ", Gpu: " +
      gpu +
      ", Ram: " +
      ram +
      ", Ssd: " +
      ssd
    );
  }
}

class BuildComputer {

  private String cpu;
  private String gpu;
  private String ram;
  private String ssd;

  public BuildComputer setCpu(String cpu) {
    this.cpu = cpu;
    return this;
  }

  public BuildComputer setGpu(String gpu) {
    this.gpu = gpu;
    return this;
  }

  public BuildComputer setRam(String ram) {
    this.ram = ram;
    return this;
  }

  public BuildComputer setSSD(String ssd) {
    this.ssd = ssd;
    return this;
  }

  public Computer buildComputer() {
    return new Computer(this);
  }

  // Some getters
  public String getCpu() {
    return cpu;
  }

  public String getGpu() {
    return gpu;
  }

  public String getRam() {
    return ram;
  }

  public String getSsd() {
    return ssd;
  }
}

public class Builder {

  public static void main(String[] args) {
    BuildComputer bc = new BuildComputer();

    Computer computer = bc
      .setGpu("RTX 5070")
      .setSSD("512 gigs")
      .setRam("16 gigs")
      .setCpu("Ryzen 5 7520u")
      .buildComputer();

    System.out.println(computer);
  }
}
