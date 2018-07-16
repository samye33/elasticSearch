package com.am.es.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @Bean(name = "ds1")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.ds1") // application中对应属性的前缀
    public DataSource dataSource1() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "ds2")
    @ConfigurationProperties(prefix = "spring.datasource.ds2") // application中对应属性的前缀
    public DataSource dataSource2() {
        return DataSourceBuilder.create().build();
    }
}