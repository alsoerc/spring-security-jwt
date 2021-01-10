package io.eros.springsecurityjwt.services;

import io.eros.springsecurityjwt.models.AuthenticationRequest;
import io.eros.springsecurityjwt.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService  {

    @Autowired
    private RequestRepository repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        AuthenticationRequest us = repo.findByUsername(username);

        return new User(us.getUsername(), us.getPassword(), new ArrayList<>());
        //return new User("foo","foo",new ArrayList<>());
    }

}
