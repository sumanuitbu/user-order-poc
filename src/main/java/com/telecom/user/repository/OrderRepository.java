package com.telecom.user.repository;



import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;

import com.telecom.user.model.Order;
import com.telecom.user.model.Product;
@Repository
public interface OrderRepository extends CassandraRepository<Order, String> 
{
	List<Order> findByIdAndUserId(String userId);
	
}
