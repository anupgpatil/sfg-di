package anup.learnspring.sfgdi;

import anup.learnspring.sfgdi.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		LanguageController languageController = (LanguageController) ctx.getBean("languageController");
		System.out.println("-------Language");
		System.out.println(languageController.sayHelo());

		MyController myController2 = (MyController) ctx.getBean("myController");

		String greeting = myController2.sayHello();
		System.out.println("-------primary");
		System.out.println(greeting);

		System.out.println("-------Props");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("-------Setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println("-------Constructor");

		System.out.println(constructorInjectedController.getGreeting());


	}

}
