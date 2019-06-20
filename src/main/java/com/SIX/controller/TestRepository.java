package com.SIX.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SIX.controller.Test;

@Repository
public interface TestRepository extends JpaRepository<Test, Long> {

}
