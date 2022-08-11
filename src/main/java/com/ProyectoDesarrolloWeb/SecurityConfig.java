package com.ProyectoDesarrolloWeb;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("juan")
                .password("{noop}123")
                .roles("ADMIN", "VENDEDOR", "USER")
                .and()
                .withUser("rebeca")
                .password("{noop}123")
                .roles("VENDEDOR", "USER")
                .and()
                .withUser("pedro")
                .password("{noop}123")
                .roles("USER");

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/producto/nuevo", "/producto/guardar",
                        "/producto/modificar/**", "/producto/eliminar/**",
                        "/vendedor/nuevo", "/vendedor/guardar",
                        "/vendedor/modificar/**", "/vendedor/eliminar/**",
                        "/usuario/listado", "/usuario/guardar",
                        "/usuario/modificar/**", "/usuario/eliminar/**")
                    .hasRole("ADMIN")
                .antMatchers("/producto/listado", "/producto/nuevo",
                        "/producto/modificar", "/producto/eliminar")
                    .hasAnyRole("ADMIN", "VENDEDOR")
                .antMatchers("/")
                    .hasAnyRole("USER", "VENDEDOR", "ADMIN")
                .and()
                    .formLogin()
                    .loginPage("/index")
                .and()
                    .exceptionHandling().accessDeniedPage("/Errores/403");
    }
}