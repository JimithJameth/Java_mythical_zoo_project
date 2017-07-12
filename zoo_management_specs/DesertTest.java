import static org.junit.Assert.*;
import org.junit.*;
import zoo_managment.*;
import behaviours.*;

public class DesertTest {

  Desert desert;
  Cyclops cyclops;
  

  @Before

  public void before(){
    desert = new Desert(TerrainType.DESERT, "DESERT");
    cyclops = new Cyclops("Benny",2,600,"Giant cyclops",9,"arrrggzzzzzz",5,"The cyclops sharp turns and goes berzerk",400.00, "Land");
  }

  @Test
  public void canAddAnimal(){
    desert.addAnimal(cyclops);
    assertEquals(1, desert.animalsCount());
  }

  @Test
  public void canNotAddNonLandAnimal(){
    Hydra hydra = new Hydra("Nezsha",0,200,"Dark Blue,Seaserpent",7,"blubblubbllub",4,"SCHRREEEEEAAAAAAAAEEE","The Hydra releases focused torrents of water from the 5 heads",360.00, "Water");
    desert.addAnimal(hydra);
    assertEquals(0, desert.animalsCount());
  }
}