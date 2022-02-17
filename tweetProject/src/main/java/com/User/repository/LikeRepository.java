package com.User.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.User.Entity.LikeEntity;

@Repository
public interface LikeRepository extends JpaRepository<LikeEntity, Integer> {

}
