package com.koushik.MDM.config;

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

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		// Add our users for in-memory authentication
		UserBuilder users = User.withDefaultPasswordEncoder();
		auth.inMemoryAuthentication()
			.withUser(users.username("Koushik").password("helloWorld").roles("Admin"))
			.withUser(users.username("Tandra").password("helloWorld").roles("Employee"))
			.withUser(users.username("Tanmoy").password("helloWorld").roles("Manager"));
		
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.anyRequest().authenticated()
			.and()
			.formLogin()
//				.loginPage("/myLogin") 	// personal login page controller mapping 
										// for this url("/myLogin") we have to create a controller
										// with a mapping ("/myLogin").
				
//				.loginProcessingUrl("/authenticateTheUser") // spring will use this url ("/authenticateTheUser") 
															// to authenticate the username and password.
															// we do not have to create any controller class for this
															// request mapping("/authenticateTheUser"). Spring 
															// automatically spring will handle everything.
				.permitAll();
	}

}
