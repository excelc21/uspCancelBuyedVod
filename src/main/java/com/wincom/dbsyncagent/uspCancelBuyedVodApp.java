package com.wincom.dbsyncagent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ImportResource("classpath:spring/root-context.xml")
public class uspCancelBuyedVodApp {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(uspCancelBuyedVodApp.class);
    }
	
	public static void main(String[] args) {
		//SpringApplication.run(uspCancelBuyedVodApp.class, args);
		
    	SpringApplication application = new SpringApplication(uspCancelBuyedVodApp.class);
    	application.addListeners(new ApplicationPidFileWriter());
    	application.run(args);
    	
		System.out.println("DB Agent Start!!");
	}

}
