package zoo_managment;

import behaviours.*;
import java.util.ArrayList;

public class Enclosure {

  private String name;
  private ArrayList<Animal> animals;
  private TerrainType terrainType;

  public Enclosure(TerrainType terrain){
    this.terrainType = terrain;
    this.animals = new ArrayList<Animal>();
  }

  public TerrainType getTerrain(){
   return this.terrainType;
  }

  public String getName(){
    return this.name;
  }

  public void addAnimal(Animal beast){
    this.animals.add(beast);
  }

  public void removeAnimal(Animal beast){
    this.animals.remove(beast);
  }

  public int collectionCount(){
    return animals.size();
  }
}
