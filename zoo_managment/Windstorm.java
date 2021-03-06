package zoo_managment;
import behaviours.*;
import java.util.ArrayList;

public class Windstorm extends Enclosure {

  private String name;
  private TerrainType terrainType;

  public Windstorm(TerrainType terrainType, String name ){
    super(terrainType,name);
  }

  public void addAnimal(Animal beast){
    if(beast.getCategory().equals("Flying")) {
      this.animals.add(beast);
    }
  }
}


