import static org.junit.Assert.*;
import org.junit.*;
import zoo_managment.*;
import behaviours.*;

public class WindstormTest {

  Windstorm windstorm;
  Dragon dragon;
  

  @Before

  public void before(){
    windstorm = new Windstorm(TerrainType.WINDSTORM, "WINDSTORM");
    dragon = new Dragon("Draco",4,75,"Green Rathian",8,"zzzzzz",7,"The Dragon leans back and breathes a blaze of fire",250.00, "Flying");
  }

  @Test
  public void canAddAnimal(){
    windstorm.addAnimal(dragon);
    assertEquals(1, windstorm.animalsCount());
  }

  @Test
  public void canNotAddNonFlyingAnimal(){
    Hydra hydra = new Hydra("Nezsha",0,200,"Dark Blue,Seaserpent",7,"blubblubbllub",4,"SCHRREEEEEAAAAAAAAEEE","The Hydra releases focused torrents of water from the 5 heads",360.00, "Water");
    windstorm.addAnimal(hydra);
    assertEquals(0, windstorm.animalsCount());
  }


}