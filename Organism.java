//Kinsey Clyne 
//9N
public class Organism {
  private boolean isAlive;
  private int size;
  private String species;
  
  //Get Methods
  private boolean getLifeStatus() {
    return isAlive;
  }
  
  private int getSize() {
    return size;
  }
  
  private String getSpecies() {
    return species;
  }
  
  private String toString() {
    return "species: " + species + ", is alive: " + isAlive + ", size: " + size;
  }
  
  //Set Methods
  private void setLifeStatus(boolean newLifeStatus) {
    isAlive = newLifeStatus;
  }
  
  private void setSize(int newSize) {
    size = newSize;
  }
  
  private void setSpecies(String newSpecies) {
    species = newSpecies;
  }
  
  //Other Mutators
  private void grow() {
    size++;
  }
  
  private void die() {
    isAlive = false;
  }
}
