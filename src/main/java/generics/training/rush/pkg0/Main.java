package generics.training.rush.pkg0;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Animal> animalList = new ArrayList<>();
    animalList.add(new Animal(1,"Axves"));
    animalList.add(new Animal(2,"Shun"));
    animalList.add(new Animal(3,"Gayl"));
    animalList.add(new Animal(4,"Arj"));

    List<Begemont> begemonts = new ArrayList<>();
    begemonts.add(new Begemont());
    begemonts.add(new Begemont());
    begemonts.add(new Begemont());
    begemonts.add(new Begemont());

    print(animalList);
    print(begemonts);


  }
  private static void print(List<? extends Animal> list ){
    for (Animal animal:list){
     animal.eat();
    }
  }
}
