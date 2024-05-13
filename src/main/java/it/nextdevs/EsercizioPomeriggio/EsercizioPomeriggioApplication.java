package it.nextdevs.EsercizioPomeriggio;

import ch.qos.logback.core.encoder.JsonEscapeUtil;
import it.nextdevs.EsercizioPomeriggio.appConfig.AppConfig;
import it.nextdevs.EsercizioPomeriggio.bean.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class EsercizioPomeriggioApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsercizioPomeriggioApplication.class, args);

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		Menu menu = ctx.getBean(Menu.class);
		System.out.println(menu);
	}


}


