package zoo_managment;
import behaviours.*;

public class Cow extends Animal {

  String chewsgrass;

  public Cow (String name, int numberoflegs, int age, String type, int levelofdanger,String sleep, int foodLevel,String chewsgrass,Double sellable, String category){

    super(name,numberoflegs,age,type,levelofdanger,sleep,foodLevel,sellable, category);
    this.chewsgrass = chewsgrass;
  }
  

  public String Chewsgrass(){
    return "Chewsgrass, Moooo";

  }
}