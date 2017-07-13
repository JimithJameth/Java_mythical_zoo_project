import static org.junit.Assert.*;
import org.junit.*;
import zoo_managment.*;
import behaviours.*;

public class DragonTest {

  Enclosure enclosure;
  Dragon dragon;

  @Before

  public void before(){
    enclosure = new Enclosure(TerrainType.BRIMSTONE,"BRIMSTONE");
    dragon = new Dragon("Draco",4,75,"Green Rathian",8,"zzzzzz",7,"The Dragon leans back and breathes a blaze of fire",250.00, "Flying");
  }

  @Test
  public void hasName(){
   assertEquals("Draco", dragon.getName());
 }

 @Test 
 public void canBreatheFire(){
   assertEquals("The Dragon leans back and breathes a blaze of fire",dragon.breathesFire());
 }

 @Test
 public void canFly(){
  assertEquals("The Dragon flaps its wings and begins to rise from the land bellow",dragon.flyable());
}

@Test
public void hasType(){
  assertEquals("Green Rathian",dragon.getType());
}

@Test
public void canBeSold(){
  assertEquals(250.00,dragon.sellable(),.01);
}

@Test
public void feedAnimal(){
  assertEquals("The dragon feeds and gains a food level!",dragon.feedAnimal());
}

@Test
public void foodLevelIncrease(){
  dragon.feedAnimal();
  assertEquals(8,dragon.getFoodLevel());
}
}