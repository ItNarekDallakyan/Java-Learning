package java8.learn.nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.FileReader;

public class Demo {

	public static void main(String[] args) {

		try {
			ScriptEngine se = new ScriptEngineManager()
					.getEngineByName("nashorn");

			se.eval("print('Hello JS');");

			se.eval(new FileReader("src\\demo1.js"));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}