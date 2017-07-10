package zoo_managment;
import behaviours.*;
import java.util.ArrayList;

public class Brimstone extends Enclosure {

  private String name;
  private ArrayList<Flyable> animals;
  private TerrainType terrainType;

  public Brimstone(TerrainType terrainType, String name ){
    super(terrainType,name);
    this.animals = new ArrayList<Flyable>();
  }

  public void addAnimal(Flyable beast){
    this.animals.add(beast);
  }

  public void removeAnimal(Flyable beast){
    this.animals.remove(beast);
  }
}

