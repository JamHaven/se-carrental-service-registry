package pacApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaServer
@EnableZuulProxy
@EnableDiscoveryClient
//@EnableEurekaClient
public class ServiceRegistrationApplication {

	public static void main(String... args) {
		SpringApplication.run(ServiceRegistrationApplication.class, args);
	}
}
