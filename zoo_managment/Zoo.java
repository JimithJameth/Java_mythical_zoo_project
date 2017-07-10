package zoo_managment;
import behaviours.*;
import java.util.ArrayList;

public class Zoo {

  String name;
  ArrayList<Animal> animals;
  ArrayList<Enclosure> enclosures;

  public Zoo(String name){
    this.name = name;
    this.animals = new ArrayList<Animal>();
    this.enclosures = new ArrayList<Enclosure>();
  }

  public String getName(){
    return this.name;
  }

  public void addEnclosure(Enclosure enclosure){
    this.enclosures.add(enclosure);
  }

  public int enclosureCount(){
    return this.enclosures.size();

  }
}

