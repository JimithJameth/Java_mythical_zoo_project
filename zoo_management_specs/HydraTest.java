import static org.junit.Assert.*;
import org.junit.*;
import zoo_managment.*;
import behaviours.*;

public class HydraTest {

  Enclosure enclosure;
  Hydra hydra;

  @Before

  public void before(){
    enclosure = new Enclosure(TerrainType.AQUATICLAND,"AQUATICLAND");
    hydra = new Hydra("Nezsha",0,200,"Dark Blue,Seaserpent",7,"blubblubbllub",4,"SCHRREEEEEAAAAAAAAEEE","The Hydra releases focused torrents of water from the 5 heads",360.00);
  }

  @Test
  public void hasName(){
    assertEquals("Nezsha", hydra.getName());
  }

  @Test 
  public void hasType(){
    assertEquals("Dark Blue,Seaserpent",hydra.getType());
  }

  @Test 
  public void canScream(){
    assertEquals("SCHRREEEEEAAAAAAAAEEE" ,hydra.hugeScream());
  }

  @Test
  public void canbeSold(){
    assertEquals(360.00 ,hydra.sellable(),.01);
  }
}