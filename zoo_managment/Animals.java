package zoo_management;

public abstract class Animals{

  String name;
  int numberoflegs;
  int age;
  String type;
  int levelofdanger;
  String sleep;
  int foodlevel;


  public Animals (String name, int numberoflegs, int age, String type, int levelofdanger,String sleep, int foodlevel){

    this.name = name;
    this.numberoflegs = numberoflegs;
    this.age = age;
    this.type = type;
    this.levelofdanger = levelofdanger;
    this.foodlevel = foodlevel;
    this.sleep = sleep;
  }

  public String getName(){
    return this. name;
  }

  public int getNumberOfLegs(){
    return this.numberoflegs;
  }

  public int getAge(){
    return this.age;
  }

  public String getType(){
    return this.type;
  }

  public int getLevelOfDanger(){
    return this.levelofdanger;
  }

  public int getFoodLevel(){
    return this.foodlevel;
  }
}