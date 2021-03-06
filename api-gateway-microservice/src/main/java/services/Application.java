package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.hateoas.hal.Jackson2HalModule;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class Application {
    @Autowired
    private RepositoryRestMvcConfiguration restConfiguration;

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).web(true).run(args);
	}

    @PostConstruct
    public void postConstructConfiguration() {
        restConfiguration.objectMapper().registerModule(new Jackson2HalModule());
    }
}
