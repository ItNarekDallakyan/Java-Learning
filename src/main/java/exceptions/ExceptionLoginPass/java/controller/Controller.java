package exceptions.ExceptionLoginPass.java.controller;


import exceptions.ExceptionLoginPass.java.NotUniqueLoginException;
import exceptions.ExceptionLoginPass.java.entity.User;
import exceptions.ExceptionLoginPass.java.model.Model;
import exceptions.ExceptionLoginPass.java.view.View;

import java.util.ResourceBundle;
import java.util.Scanner;

import static exceptions.ExceptionLoginPass.java.constants.MessagesConstants.INPUT_LOGIN;
import static exceptions.ExceptionLoginPass.java.constants.MessagesConstants.INPUT_PASSWORD;
import static exceptions.ExceptionLoginPass.java.constants.RegexConstants.REGEX_BUNDLE_NAME;
import static exceptions.ExceptionLoginPass.java.constants.RegexConstants.REGEX_LOGIN;
import static exceptions.ExceptionLoginPass.java.constants.RegexConstants.REGEX_PASSWORD;


public class Controller {
    private ResourceBundle regexBundle = ResourceBundle.getBundle(REGEX_BUNDLE_NAME);

    private Scanner inputScanner = new Scanner(System.in);
    private View view;
    private Model model;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        String login    = getUserInput(regexBundle.getString(REGEX_LOGIN), INPUT_LOGIN);
        String password = getUserInput(regexBundle.getString(REGEX_PASSWORD), INPUT_PASSWORD);
        while(true) {
            try {
                model.addUser(new User(login, password));
                break;
            } catch (NotUniqueLoginException e) {
                view.printLoginExistsMessage();
                login    = getUserInput(regexBundle.getString(REGEX_LOGIN), INPUT_LOGIN);
            }
        }
    }

    private String getUserInput(String regex, String messagePropertyKey) {
        String input;
        view.printInputOffering(messagePropertyKey);
        while (!(inputScanner.hasNext() && (input = inputScanner.nextLine().trim()).matches(regex))) {
            view.printWrongInputMessage();
        }
        return input;
    }

}
