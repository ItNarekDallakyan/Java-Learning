package design_patterns.dao;

import java.util.List;

interface DeveloperDao {

    List<Developer> getAllDevelopers();
    Developer getDeveloper(int DeveloperId);
    void updateDeveloper(Developer Developer);
    void deleteDeveloper(Developer Developer);

}