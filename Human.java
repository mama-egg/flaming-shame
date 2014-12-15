//Kinsey Clyne
//9N
public class Human inherits Animal {
  
  super(isAlive, size, species, color, energy, isHungry);
  
  public Human() {
    System.out.println(/t"Human One: ");
    Human.toString();
    
    Human.setSpecies("Homo sapiens");
    Human.setEnergy(9.5);
    Human.setSize(165);
    Human.setIsHungry(true);
    Human.toString();
    
    Human.setLifeStatus(true);
    Human.grow();
    Human.setColor("A weird shade of tan");
    Human.sleep();
    Human.huntForFood();
    Human.sleep();
    Human.toString();
  }
  
  public Human(isAlive, size, species, color, energy, isHungry) {
    System.out.println(/t"Human Two: ");
    
    Human.setLifeStatus(isAlive);
    Human.setSize(size);
    Human.setSpecies(species);
    Human.setColor(color);
    Human.setEnergy(energy);
    Human.setIsHungry(isHungry);
    Human.toString();
  }
