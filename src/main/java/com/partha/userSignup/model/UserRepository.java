package com.partha.userSignup.model;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
@ComponentScan(basePackages = "com.partha.userSignup.model")
public interface UserRepository extends JpaRepository<User,Integer> {
//service .addUserDetails();
	
	@Query("SELECT t FROM User t where t.username = :username") 
	public Optional<User>  findUserByUsername(@Param("username") String username);
	//findUserByUsername(String username);
}
