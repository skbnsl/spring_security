package com.security.learn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity(debug = true)
@Configuration
public class SecurityConfig {

    @Bean
    public UserDetailsService userDetailsService(){
        //we are not using database

        //creating user
        UserDetails user1 = User.withDefaultPasswordEncoder().username("sagar").password("sagar").roles("ADMIN","GUEST").build();

        UserDetails user2 = User.withDefaultPasswordEncoder().username("bansal").password("bansal").roles("ADMIN").build();

        //creating inMemory user detail manager : that is user detail service implementation
        //providing user1 and user2 to userdetail service
        InMemoryUserDetailsManager inMemoryUserDetailsManager = new InMemoryUserDetailsManager(user1,user2);

        return inMemoryUserDetailsManager;
    }

}
