package exceptions.ExceptionLoginPass.java;


import exceptions.ExceptionLoginPass.java.controller.Controller;
import exceptions.ExceptionLoginPass.java.model.Model;
import exceptions.ExceptionLoginPass.java.view.View;

public class App {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.processUser();
    }
}
