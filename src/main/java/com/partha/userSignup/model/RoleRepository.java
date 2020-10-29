package com.partha.userSignup.model;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
@ComponentScan(basePackages = "com.partha.userSignup.model")
public interface RoleRepository extends JpaRepository<Role,Integer> {

}
