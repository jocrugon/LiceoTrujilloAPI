package com.liceotrujillo.apiclt.common.security.repository;

import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<UserEntity,String> {
}
