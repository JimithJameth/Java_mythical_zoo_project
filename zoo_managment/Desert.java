package zoo_managment;
import behaviours.*;
import java.util.ArrayList;

public class Desert extends Enclosure {

  private String name;
  private TerrainType terrainType;

  public Desert(TerrainType terrainType, String name ){
    super(terrainType,name);
  }

  public void addAnimal(Animal beast){
    if(beast.getCategory().equals("Land")) {
      this.animals.add(beast);
    }
  }
}


