package com.leyou;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:jdbc.properties")
public class JdbcConfig {
	@Bean
	@ConfigurationProperties(prefix = "jdbc")
	public DataSource dataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		return dataSource;
	}
}
