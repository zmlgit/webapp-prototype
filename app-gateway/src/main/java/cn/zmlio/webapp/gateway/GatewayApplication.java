package cn.zmlio.webapp.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@EnableOAuth2Sso
public class GatewayApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}
