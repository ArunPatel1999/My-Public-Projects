package com.arun.entitys;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Data
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false)
	private ProductCategory category;
	private String sku;
	private String name;
	private String description;
	private BigDecimal unitPrice;
	private String imageUrl;
	private boolean active;
	private int unitsInStock;
	@CreationTimestamp
	@Column(name = "date_created")
	private Date createdDate;
	@UpdateTimestamp
	@Column(name = "last_updated")
	private Date updatedDate;
	
	
}
