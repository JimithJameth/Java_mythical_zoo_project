import static org.junit.Assert.*;
import org.junit.*;
import zoo_managment.*;
import behaviours.*;

public class EnclosureTest {

  Enclosure enclosure;
  Dragon dragon;

  @Before

  public void before(){
    enclosure = new Enclosure(TerrainType.BRIMSTONELAND,"BRIMSTONELAND");
    dragon = new Dragon("Draco",4,75,"Green Rathian",8,"zzzzzz",7,"The Dragon leans back and breathes a blaze of fire",250.00);
  }

  @Test
  public void canGetTerrainType(){
    assertEquals(TerrainType.BRIMSTONELAND, enclosure.getTerrain());
  }

  @Test
  public void canGetName(){
    assertEquals("BRIMSTONELAND", enclosure.getName());
  }

  @Test
  public void canAddAnimal(){
    enclosure.addAnimal(dragon);
    assertEquals(1, enclosure.animalsCount());

  }

  @Test
  public void canRemoveAnimal(){
    enclosure.addAnimal(dragon);
    enclosure.removeAnimal(dragon);
    assertEquals(0, enclosure.animalsCount());
  }
}