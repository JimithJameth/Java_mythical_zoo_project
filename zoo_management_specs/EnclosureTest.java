import static org.junit.Assert.*;
import org.junit.*;
import zoo_managment.*;
import behaviours.*;

public class EnclosureTest {

  Enclosure enclosure;

  @Before

  public void before(){
    enclosure = new Enclosure(TerrainType.BRIMSTONELAND,"BRIMSTONELAND");
  }

  @Test
  public void canGetTerrainType(){
    assertEquals(TerrainType.BRIMSTONELAND, enclosure.getTerrain());
  }

  @Test
  public void canGetName(){
    assertEquals("BRIMSTONELAND", enclosure.getName());
  }
}