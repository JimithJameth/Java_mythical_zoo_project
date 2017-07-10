import static org.junit.Assert.*;
import org.junit.*;
import zoo_managment.*;
import behaviours.*;

public class ZooTest {

  Enclosure enclosure;
  Zoo zoo;

  @Before

  public void before(){
  enclosure = new Enclosure(TerrainType.BRIMSTONELAND,"BRIMSTONELAND");
  zoo = new Zoo ("Crimson horizon" );
}

  @Test
  public void addEnclosure(){
    zoo.addEnclosure(enclosure);
    assertEquals(1,zoo.enclosureCount());
  }
}
