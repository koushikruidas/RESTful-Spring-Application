package com.koushik.MDM.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration // Configuration class for spring security
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {
	
	// Adding a reference to our security datasource
	
	@Autowired
	private DataSource mySecurityDataSource;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		// Add our users for in-memory authentication
		/*
		 * UserBuilder users = User.withDefaultPasswordEncoder();
		 * auth.inMemoryAuthentication()
		 * .withUser(users.username("Koushik").password("hello").roles("EMPLOYEE",
		 * "ADMIN"))
		 * .withUser(users.username("Tandra").password("hello").roles("EMPLOYEE"))
		 * .withUser(users.username("Tanmoy").password("hello").roles("EMPLOYEE",
		 * "MANAGER"));
		 */		
		
		// Above are hardcoded example now we are going to use database 
		// Use JDBC authentication
		auth.jdbcAuthentication().dataSource(mySecurityDataSource);
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
//		.anyRequest().authenticated() 
		// Instead of any request we want to add division of roles
		.antMatchers("/").hasRole("EMPLOYEE")
		.antMatchers("/leaders/**").hasRole("MANAGER")
		.antMatchers("/systems/**").hasRole("ADMIN")
			.and()
			.formLogin()
				.loginPage("/fancy-login") 	// personal login page controller mapping 
										// for this url("/myLogin") we have to create a controller
										// with a mapping ("/myLogin").
				
				.loginProcessingUrl("/authenticateTheUser") // spring will use this url ("/authenticateTheUser") 
															// to authenticate the username and password.
															// we do not have to create any controller class for this
															// request mapping("/authenticateTheUser"). Spring 
															// automatically spring will handle everything
															// AS LONG AS we are using "/authenticateTheUser" request mapping
															// in our login page action field.
				.permitAll()
				.and()
				.logout().permitAll()
				.and()
				.exceptionHandling().accessDeniedPage("/access-denied");
	}

}
