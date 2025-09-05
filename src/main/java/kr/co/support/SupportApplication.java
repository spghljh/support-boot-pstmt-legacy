package kr.co.support;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//public class SupportApplication {
public class SupportApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
//		SpringApplication.run(SupportApplication.class, args);
		ApplicationContext context = SpringApplication.run(SupportApplication.class, args);
		System.out.println(
				"-------------Beans by IoC Container------------------------------------------------------------------------");
		// IoC 컨테이너에 등록된 Bean 이름 출력
		for (String beanName : context.getBeanDefinitionNames()) {
			System.out.println(beanName);
		} // end for
		System.out.println("-------------------------------------------------------------------------------------");
	}// main

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SupportApplication.class);
	}

}// SupportApplication
