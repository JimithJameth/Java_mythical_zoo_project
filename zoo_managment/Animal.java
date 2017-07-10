package zoo_managment;

public abstract class Animal{

  String name;
  int numberOfLegs;
  int age;
  String type;
  int levelOfDanger;
  String sleep;
  int foodLevel;
  Double sellable;


  public Animal(String name, int numberOfLegs, int age, String type, int levelOfDanger,String sleep, int foodLevel,Double sellable){
    this.name = name;
    this.numberOfLegs = numberOfLegs;
    this.age = age;
    this.type = type;
    this.levelOfDanger = levelOfDanger;
    this.foodLevel = foodLevel;
    this.sleep = sleep;
    this.sellable = sellable;
  }

  public String getName(){
    return this. name;
  }

  public int getNumberOfLegs(){
    return this.numberOfLegs;
  }

  public int getAge(){
    return this.age;
  }

  public String getType(){
    return this.type;
  }

  public int getLevelOfDanger(){
    return this.levelOfDanger;
  }

  public int getFoodLevel(){
    return this.foodLevel;
  }

  public Double sellable(){
    return this.sellable;
  }
}