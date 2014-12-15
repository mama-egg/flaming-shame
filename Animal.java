//Kinsey Clyne
//9N

public class Animal inherits Organism {
  
  super(isAlive, size, species);
  private String color;
  private double energy;
  private boolean isHungry;
  
  private Animal() {
    isAlive = false;
    size = 0;
    species = "";
    color = "";
    energy = 0.0;
    isHungry = false;
  }
  
  private Animal(boolean isAlive, int size, String species, String color, double energy, boolean isHungry) {
    Animal.setLifeStatus(isAlive);
    Animal.setSize(size);
    Animal.setSpecies(species);
    
    Animal.setColor(color);
    Animal.setEnergy(energy);
    Animal.setIsHungry(isHungry);
  }
  
  //Get Methods
  private String getColor() {
    return color;
  }
  
  private String getEnergy() {
    return energy;
  }
  
  private boolean getIsHungry() {
    return isHungry
  }
  
  private void toString() {
    this.toString();
    System.println(Organism.toString(species, isAlive, size));
  }
  
  //Set Methods
  private void setColor(String newColor) {
    color = newColor;
  }
  
  private void setEnergy(double newEnergy) {
    energy = newEnergy;
  }
  
  private void setIsHungry(boolean newHunger) {
    isHungry = newHunger;
  }
  
  //Other Mutators
  private void huntForFood() {
    energy--;
    isHungry = false;
  }
  
  private void sleep() {
    energy += 2.5;
  }
}
