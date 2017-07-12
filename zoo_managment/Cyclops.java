package zoo_managment;
import behaviours.*;

public class Cyclops extends Animal  {

  String rage;

  public Cyclops (String name, int numberoflegs, int age, String type, int levelofdanger,String sleep, int foodLevel,String rage ,Double sellable, String category){

    super(name,numberoflegs,age,type,levelofdanger,sleep,foodLevel,sellable, category);
    this.rage = rage;
  }

  public String rage(){
    return "The Cyclops stomps they're feet and swings there arms about and roars ARGGGHHHHHBWOOORR";
  }

  public String feedAnimal(){
    this.foodLevel += 1;
    return "The Cyclops feeds and gains a food level!";
  }
}