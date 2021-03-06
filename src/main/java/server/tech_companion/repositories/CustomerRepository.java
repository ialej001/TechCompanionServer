package server.tech_companion.repositories;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import server.tech_companion.models.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, ObjectId> {
	Customer findBy_id(ObjectId _id);
	
    Customer findByServiceAddress(String serviceAddress);

    List<Customer> findByStreetAddress(String streetAddress);

    List<Customer> findAll();
}