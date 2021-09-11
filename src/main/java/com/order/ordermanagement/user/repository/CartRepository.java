package com.order.ordermanagement.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.order.ordermanagement.user.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, String>{

}
