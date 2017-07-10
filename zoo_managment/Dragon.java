package zoo_managment;
import behaviours.*;

public class Dragon extends Animal implements Flyable {

  String breathesfire;

  public Dragon (String name, int numberoflegs, int age, String type, int levelofdanger,String sleep, int foodlevel,String breathesfire,Double sellable){
    super(name,numberoflegs,age,type,levelofdanger,sleep,foodlevel,sellable);
    this.breathesfire = breathesfire;
  }

  public String breathesFire(){
    return "The Dragon leans back and breathes a blaze of fire";
  }

  public String flyable(){
    return "The Dragon flaps there wings and begins to rise from the land bellow";
  }
}
