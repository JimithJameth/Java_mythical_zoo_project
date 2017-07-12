package zoo_managment;
import behaviours.*;

public class Dragon extends Animal implements Flyable {

  String breathesfire;

  public Dragon (String name, int numberoflegs, int age, String type, int levelofdanger,String sleep, int foodLevel,String breathesfire,Double sellable, String category){

    super(name,numberoflegs,age,type,levelofdanger,sleep,foodLevel,sellable, category);
    this.breathesfire = breathesfire;
  }

  public String breathesFire(){
    return "The Dragon leans back and breathes a blaze of fire";
  }

  public String flyable(){
    return "The Dragon flaps its wings and begins to rise from the land bellow";
  }

  public String feedAnimal(){
    this.foodLevel += 1;
    return "The dragon feeds and gains a food level!";
  }
}
