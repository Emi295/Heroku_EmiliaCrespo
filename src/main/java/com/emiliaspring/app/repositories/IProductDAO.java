package com.emiliaspring.app.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.emiliaspring.app.models.ProductDTO;

@Repository
public interface IProductDAO extends MongoRepository<ProductDTO, String> {

}
