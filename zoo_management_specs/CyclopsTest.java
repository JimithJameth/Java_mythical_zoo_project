import static org.junit.Assert.*;
import org.junit.*;
import zoo_managment.*;
import behaviours.*;

public class CyclopsTest {

  Cyclops cyclops;
  Desert desert;

  @Before

  public void before(){

    desert = new Desert(TerrainType.DESERT, "DESERT");
    cyclops = new Cyclops("Benny",2,600,"Giant cyclops",9,"arrrggzzzzzz",5,"The Cyclops stomps they're feet and swings there arms about and roars ARGGGHHHHHBWOOORR",400.00,"Land");
  }

  @Test
  public void hasName(){
    assertEquals("Benny", cyclops.getName());
  }

  @Test 
  public void hasType(){
    assertEquals("Giant cyclops",cyclops.getType());
  }

  @Test 
  public void rage(){
    assertEquals("The Cyclops stomps they're feet and swings there arms about and roars ARGGGHHHHHBWOOORR",cyclops.rage());
  }

  @Test
  public void canBeSold(){
   assertEquals(400.00,cyclops.sellable(),.01);
 }

 @Test
 public void foodLevelIncrease(){
   cyclops.feedAnimal();
   assertEquals(6,cyclops.getFoodLevel());
 }
}