package com.am.es;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}, scanBasePackages = {"com.alldream.ammq"})
@EnableTransactionManagement
public class EsApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(EsApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(EsApplication.class, args);
	}
}
