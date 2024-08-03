package com.ecommerce.eCommerce.repositories;

import com.ecommerce.eCommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

}
