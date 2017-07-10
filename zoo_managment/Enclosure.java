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
  }

  private TerrainType getTerrain(){
    return this.terrain;

    }

  private getName(){
    return this.name;
  }

  }
