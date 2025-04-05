package com.example.config;
import javax.sql.DataSource;
import java.sql.*;

//@bean cannot be used outside a @ configuration class
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages="com.example")
public class JdbcConfigTix {
        @Bean
        public DataSource getDataSource() {//throws ClassNotFoundException 
        	DriverManagerDataSource datasource=new DriverManagerDataSource();
        	datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        	//Class.forName("com.mysql.cj.jdbc.Driver");
        	datasource.setUrl("jdbc:mysql://localhost:3306/Vidhan_Test");
            datasource.setUsername("root");
            datasource.setPassword("root@39");
            return datasource;
        }
        @Bean
        public JdbcTemplate getjdbcTemplate() {
        	return new JdbcTemplate(getDataSource());
        	
        }
        @Bean//handle da
        public PlatformTransactionManager getTransactionManager() {
        	return new DataSourceTransactionManager(getDataSource());
        }
//DataSourceTransactionManager specifically works with jdbc-based transactions
	public JdbcConfigTix() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
