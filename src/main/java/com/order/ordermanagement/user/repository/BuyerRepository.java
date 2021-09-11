package com.order.ordermanagement.user.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.order.ordermanagement.user.entity.Buyer;
import com.order.ordermanagement.user.entity.Wishlist;
@Repository
public interface BuyerRepository extends JpaRepository<Buyer, String> {

	Buyer findByEmail(String Email);
	
	@Query("FROM Wishlist as wishlist "
    		+ " WHERE wishlist.buyerid = :buyerid")   
	public Wishlist getWishlist(@Param("buyerid") String buyerId);
}
