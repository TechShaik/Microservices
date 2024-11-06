package com.files.Review;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReveiwRepo extends JpaRepository<Reveiw, Integer>{

}
