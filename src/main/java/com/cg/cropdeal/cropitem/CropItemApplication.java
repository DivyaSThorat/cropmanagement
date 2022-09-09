package com.cg.cropdeal.cropitem;

import java.util.Collections;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableSwagger2
//@EnableEurekaClient
@SpringBootApplication
public class CropItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(CropItemApplication.class, args);
	}

	
	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/api/cropitems/*"))
				//.paths(PathSelectors.ant("/api/*"))
				.apis(RequestHandlerSelectors.basePackage("com.cg.cropdeal"))
				.build()
				.apiInfo(apiDetails());
	}
	
     private ApiInfo apiDetails() {
	 return new ApiInfo(
		 "CropItem API",
		 "Sample API",
		 "1.0",
		 "Free to use",
		 new springfox.documentation.service.Contact("Divya Thorat","http://com.cg.cropdeal","Divya@12"),
		 "API License",
		 "http://com.cg.cropdeal",
		 Collections.emptyList());
}
     
    /* @Autowired
 	private EmailSenderService senderService;
     @EventListener(ApplicationReadyEvent.class)
 	
		public void triggerMail() throws MessagingException {
			senderService.sendSimpleEmail("thoratdivya866@gmail.com",
					"Crops Information",
					"Maize is an annual grass in the family Gramineae, which includes such plants as wheat, rye, barley, rice, sorghum, and sugarcane. There are two major species of the genus Zea (out of six total): Zea mays (maize) and Zea diploperennis, which is a perennial type of teosinte.\n"
					+ "Genus: Zea\n"
					+ "Species: Z. mays\n"
					+ "Family: Poaceae"
					+ "Wheat is a grass widely cultivated for its seed, a cereal grain that is a worldwide staple food. The many species of wheat together make up the genus Triticum; the most widely grown is common wheat (T. aestivum).\n"
					+ "...\n"
					+ "Wheat\n"
					+ "Clade:	Monocots\n"
					+ "Clade:	Commelinids\n"
					+ "Order:	Poales\n"
					+ "Family:	Poaceae .");

		}*/

}
