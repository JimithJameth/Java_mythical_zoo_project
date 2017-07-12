package zoo_managment;
import behaviours.*;

public class Hydra extends Animal implements Swimmable {

  String hugescream;
  String aquaticblast;

  public Hydra (String name, int numberoflegs, int age, String type, int levelofdanger,String sleep, int foodLevel,String hugescream, String aquaticblast,Double sellable){

    super(name,numberoflegs,age,type,levelofdanger,sleep,foodLevel,sellable);
    this.hugescream = hugescream;
  }

  public String hugeScream(){
    return "SCHRREEEEEAAAAAAAAEEE";
  }

  public String aquaticBlast(){
    return"The Hydra releases focused torrents of water from the 5 heads";
  }

  public String swimmable(){
    return "The hydra thunders through the depths bellow diving into the unknown";
  }
}