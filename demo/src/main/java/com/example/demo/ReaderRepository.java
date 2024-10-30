package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

public interface ReaderRepository extends JpaRepository<Reader,String> {

}
