package net.essadiki.inventoryservice;

import net.essadiki.inventoryservice.entities.Product;
import net.essadiki.inventoryservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ProductRepository productRepository){
        return args -> {
            productRepository.save(Product.builder()
                    .name("printer").price(1200).quantity(12).build());
            productRepository.save(Product.builder()
                    .name("Phone").price(2000).quantity(19).build());
            productRepository.save(Product.builder()
                    .name("Pc").price(2500).quantity(22).build());


        };
    }
}
