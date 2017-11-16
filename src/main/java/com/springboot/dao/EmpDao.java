package com.springboot.dao;

import com.springboot.jopo.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpDao extends JpaRepository<Emp,Integer> {

}
