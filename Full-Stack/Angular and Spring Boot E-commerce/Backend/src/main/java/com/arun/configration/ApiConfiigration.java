package com.arun.configration;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.EntityType;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.arun.entitys.Product;
import com.arun.entitys.ProductCategory;

import lombok.AllArgsConstructor;

@Configuration
@AllArgsConstructor
public class ApiConfiigration implements RepositoryRestConfigurer, WebMvcConfigurer {

	private EntityManager entityManager;
	
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
		
		HttpMethod[] hideApi = {HttpMethod.POST, HttpMethod.PUT, HttpMethod.DELETE};
		
		// For Product
		config.getExposureConfiguration().forDomainType(Product.class)
				.withItemExposure((metadata, httpmedthod) -> httpmedthod.disable(hideApi))
				.withCollectionExposure((metadata, httpmedthod) -> httpmedthod.disable(hideApi));
		
		// For Product category
		config.getExposureConfiguration().forDomainType(ProductCategory.class)
			.withItemExposure((metadata, httpmedthod) -> httpmedthod.disable(hideApi))
			.withCollectionExposure((metadata, httpmedthod) -> httpmedthod.disable(hideApi));
		
		exposedId(config);
	}

	private void exposedId(RepositoryRestConfiguration config) {
		
		Set<EntityType<?>> entitys =	entityManager.getMetamodel().getEntities();
		List<Class<?>> entityClass = new LinkedList<>();
		
		entitys.forEach(x -> entityClass.add(x.getJavaType()));
		
		Class<?>[] domainType = entityClass.toArray(new Class[0]);
		config.exposeIdsFor(domainType);
	}
	
}
