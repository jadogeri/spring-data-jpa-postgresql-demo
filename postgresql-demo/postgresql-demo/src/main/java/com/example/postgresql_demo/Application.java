package com.example.postgresql_demo;

import com.example.postgresql_demo.store.Store;
import com.example.postgresql_demo.store.StoreRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

    @Bean
    CommandLineRunner commandLineRunner(StoreRepository storeRepository) {
        return args -> {
            Store store = new Store("Home Depot","1001 baker st.","New Orleans","LA");
            storeRepository.save(store);
        };
    }

}
