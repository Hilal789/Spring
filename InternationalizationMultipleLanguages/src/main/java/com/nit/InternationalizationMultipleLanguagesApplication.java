package com.nit;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.bean.MessagePrinter;


@SpringBootApplication
public class InternationalizationMultipleLanguagesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(InternationalizationMultipleLanguagesApplication.class, args);
		MessagePrinter mp = ctx.getBean(MessagePrinter.class);
		mp.printMsg();
	}

}
