package com.arun.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.arun.entitys.ProductCategory;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "productCategory")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {

}
