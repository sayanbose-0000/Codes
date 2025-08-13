import java.util.ArrayList;
import java.util.List;

// LightHouse acts as the mediator
class LightHouse {

  private List<Dock> docks;

  LightHouse(List<Dock> docks) {
    this.docks = docks;
  }

  // Mediator logic
  void requestDock(Ship ship) {
    if (!ship.isWantingToDock()) {
      System.out.println(ship.getName() + " doesn't want to dock.");
      return;
    }

    for (Dock dock : docks) {
      if (dock.isClear()) {
        System.out.println(ship.getName() + " has docked at " + dock.getName());
        ship.setWantingToDock(false);
        dock.setClear(false);
        return;
      }
    }

    System.out.println("No docks available for " + ship.getName());
  }
}

// Ship class
class Ship {

  private String name;
  private boolean wantsToDock;
  private LightHouse lightHouse;

  Ship(String name, boolean wantsToDock, LightHouse lightHouse) {
    this.name = name;
    this.wantsToDock = wantsToDock;
    this.lightHouse = lightHouse;
  }

  public String getName() {
    return name;
  }

  public boolean isWantingToDock() {
    return wantsToDock;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setWantingToDock(boolean wantsToDock) {
    this.wantsToDock = wantsToDock;
  }

  // Ship requests docking via the mediator
  public void requestDock() {
    lightHouse.requestDock(this);
  }
}

// Dock class
class Dock {

  private String name;
  private boolean clear;

  Dock(String name, boolean clear) {
    this.name = name;
    this.clear = clear;
  }

  public String getName() {
    return name;
  }

  public boolean isClear() {
    return clear;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setClear(boolean clear) {
    this.clear = clear;
  }
}

// Main class
public class Mediator {

  public static void main(String[] args) {
    List<Dock> docks = new ArrayList<>();
    docks.add(new Dock("Shanghai Dock", false));
    docks.add(new Dock("Singapore Dock", true));
    docks.add(new Dock("Rotterdam Dock", true));

    LightHouse lightHouse = new LightHouse(docks);

    Ship titanic = new Ship("Titanic", true, lightHouse);
    Ship queen = new Ship("Queen Mary", true, lightHouse);
    Ship mariana = new Ship("Mariana", false, lightHouse);

    titanic.requestDock();
    queen.requestDock();
    mariana.requestDock();
  }
}
