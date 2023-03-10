package com.example.lesson_2_task_2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class  SecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        UserDetails user1 = User.withDefaultPasswordEncoder()
                .username("super_admin")
                .password("SuperAdmin")
                .roles("SUPER_ADMIN")
                .build();
        UserDetails user2 = User.withDefaultPasswordEncoder()
                .username("moderator")
                .password("moderator")
                .roles("MODERATOR")
                .build();
        UserDetails user3 = User.withDefaultPasswordEncoder()
                .username("operator")
                .password("operator")
                .roles("OPERATOR")
                .build();
        return new InMemoryUserDetailsManager(user1, user2, user3);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http
                .csrf().disable()
                .authorizeHttpRequests((authz) -> authz
                        .requestMatchers(HttpMethod.GET, "/api/**").hasAnyRole("OPERATOR", "MODERATOR","SUPER_ADMIN")
                        .requestMatchers(HttpMethod.GET, "/api").hasAnyRole("SUPER_ADMIN","OPERATOR")
                        .requestMatchers(HttpMethod.PUT, "/api").hasRole("MODERATOR")
                        .requestMatchers(HttpMethod.POST, "/api").hasRole("MODERATOR")
                        .requestMatchers("/api/**").hasRole("SUPER_ADMIN")
                        .anyRequest()
                        .authenticated()
                )
                .httpBasic(withDefaults());
        return http.build();
    }
}
