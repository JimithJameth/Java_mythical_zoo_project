package zoo_management;
import behaviours.*;

public class Dragon extends Animals implements Flyable,Sellable{

  String breathesfire;

  public Dragon (String name, int numberoflegs, int age, String type, int levelofdanger,String sleep, int foodlevel,String breathesfire,Double sellable){


    super(name,numberoflegs,age,type,levelofdanger,sleep,foodlevel,sellable)
    this.breathesfire = breathesfire;
  }

  breathesfire(){
    return "The Dragon leans back and breathes a blaze of fire";
  }

  fly(){
    return "The Dragon flaps there wings and begins to rise from the land bellow"
  }
}
