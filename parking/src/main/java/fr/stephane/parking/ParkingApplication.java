package fr.stephane.parking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * classe publique ParkingApplication
 */
@SpringBootApplication
public class ParkingApplication {

    /**
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ParkingApplication.class, args);
    }

    /**
     * @param builder
     * @return builder.build()
     */
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

}
