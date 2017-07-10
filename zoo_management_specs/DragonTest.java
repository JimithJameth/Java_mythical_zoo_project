import static org.junit.Assert.*;
import org.junit.*;
import zoo_managment.*;
import behaviours.*;

public class DragonTest {

  Enclosure enclosure;
  Dragon dragon;

  @Before

  public void before(){
    enclosure = new Enclosure(TerrainType.BRIMSTONELAND,"BRIMSTONELAND");
    dragon = new Dragon("Draco",4,75,"Green Rathian",8,"zzzzzz",7,"The Dragon leans back and breathes a blaze of fire",250.00);
  }

  @Test
   public void hasName(){
   assertEquals("Draco", dragon.getName());
   }
 }