package zoo_managment;

import behaviours.*;
import java.util.ArrayList;

public class Enclosure {

  private String name;
  private ArrayList<Animal> animals;
  private TerrainType terrainType;

  public Enclosure(TerrainType terrain, String name){
    this.terrainType = terrain;
    this.animals = new ArrayList<Animal>();
    this.name = name;
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
