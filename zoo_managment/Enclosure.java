package fantasy_zoo;
import behaviours.*;
import java.util.ArrayList;

abstract class Enclosure {

  private String name;
  private ArrayList<Animal> animal;
  private TerrainType terrainType;
  public enum TerrainType {
    DESERTLAND,
    AQUATICLAND,
    BRIMSTONELAND,
    WINDSTORMLAND
  }

  private Land(TerrainType,terrain){
    this.terrain = terrain;
    this.collection = new ArrayList<Animal>();
  }

  private TerrainType getTerrain(){
    return this.terrain;

    }

  private String getName(){
    return this.name;
  }

  private void addAnimal(Animal beast){
    this.collection.add(beast);
  }

  private void removeAnimal(Animal beast){
    this.collecton.remove(beast)
  }

  private int collectionCount(){
    return collection.size();
  }
}
