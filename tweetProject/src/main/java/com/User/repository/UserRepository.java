package com.User.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.User.Entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String>{

	
	Optional<UserEntity> findByFirstName(String name);

	@Query("Select U from UserEntity U where U.login_id=?1")
	Optional<UserEntity> findBylogin_id(String id);
	
	@Query("Select U from UserEntity U where U.login_id=?1 and U.password=?2")
	Optional<UserEntity> findByIdAndPass(String login_id, String password);

//	@Query("{login_id: ?0}")
//	Optional<UserEntity> findByloginId(String login_id);
//	
//	@Query("{firstName: ?0}")
//	Optional<UserEntity> findByFirstName(String firstName);
//	
//	@Query("{'login_id': ?0,'password': ?1}")
//	Optional<UserEntity> findByIdAndPass(String login_id,String password);
}
