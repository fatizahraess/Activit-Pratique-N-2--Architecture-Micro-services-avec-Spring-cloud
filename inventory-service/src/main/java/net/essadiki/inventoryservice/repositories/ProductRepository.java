package net.essadiki.inventoryservice.repositories;

import net.essadiki.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product,Long> {
}