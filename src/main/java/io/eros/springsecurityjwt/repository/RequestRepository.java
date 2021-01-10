package io.eros.springsecurityjwt.repository;

import io.eros.springsecurityjwt.models.AuthenticationRequest;

import org.springframework.data.repository.CrudRepository;

public interface RequestRepository extends CrudRepository<AuthenticationRequest, Integer> {

    AuthenticationRequest findByUsername(String nombre);

}
