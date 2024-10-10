package com.example.demo.security;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;

import jakarta.servlet.http.HttpServletRequest;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity(prePostEnabled = true)
public class SecurityConfig {
    

   /* public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .cors().configurationSource(new CorsConfigurationSource() {
 @Override
 public CorsConfiguration getCorsConfiguration(HttpServletRequest request) {
 CorsConfiguration config = new CorsConfiguration();

config.setAllowedOrigins(Collections.singletonList("http://localhost:4200"));
 config.setAllowedMethods(Collections.singletonList("*"));
 config.setAllowCredentials(true);
 config.setAllowedHeaders(Collection.singletonList("*"));
 config.setExposedHeaders(Arrays.asList("Authorization"));
 config.setMaxAge(3600L);
 return config;
 }
 }).and()
                

                // consulter tous les produits
               .requestMatchers("/api/all/**").hasAnyAuthority("ADMIN", "USER")
                .requestMatchers("/api/getByid/**").hasAnyAuthority("ADMIN", "USER")
                // consulter un produit par son id
                .requestMatchers(HttpMethod.POST, "/api/addprod/**").hasAnyAuthority("ADMIN")
                .requestMatchers(HttpMethod.PUT, "/api/updateprod/**").hasAnyAuthority("ADMIN")
                .requestMatchers(HttpMethod.DELETE, "/api/addprod/**").hasAnyAuthority("ADMIN")

                .anyRequest().authenticated().and()
                .addFilterBefore(new JWTAuthorizationFilter(), BasicAuthenticationFilter.class);

        return http.build();
    }*/
}
