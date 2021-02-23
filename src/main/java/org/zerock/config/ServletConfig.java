package org.zerock.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@ComponentScan(basePackages = {"org.zerock.controller"})
@EnableGlobalMethodSecurity(prePostEnabled=true, securedEnabled=true)
public class ServletConfig {

}
