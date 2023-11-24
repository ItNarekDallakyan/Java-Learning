package design_patterns.dao;

import java.util.ArrayList;
import java.util.List;

class DeveloperDaoImpl implements DeveloperDao {

  private List<Developer> developers;

  public DeveloperDaoImpl() {
    developers = new ArrayList<>();
    Developer Developer1 = new Developer("Aro", 0);
    Developer Developer2 = new Developer("Naro", 1);
    developers.add(Developer1);
    developers.add(Developer2);
  }

  @Override
  public void deleteDeveloper(Developer Developer) {
    developers.remove(Developer.getDeveloperId());
    System.out.println("DeveloperId " + Developer.getDeveloperId() + ", deleted from database");
  }

  @Override
  public List<Developer> getAllDevelopers() {
    return developers;
  }

  @Override
  public Developer getDeveloper(int DeveloperId) {
    return developers.get(DeveloperId);
  }

  @Override
  public void updateDeveloper(Developer Developer) {
    developers.get(Developer.getDeveloperId()).setName(Developer.getName());
    System.out.println("DeveloperId " + Developer.getDeveloperId() + ", updated in the database");
  }
} 