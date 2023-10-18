package com.example.SmartPath.security;

import com.example.SmartPath.entity.Person;
import com.example.SmartPath.exception.NotFoundException;
import com.example.SmartPath.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class CustomDetailsService implements UserDetailsService {

    private final PersonRepository personRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Person> person = personRepository.findByUsername(username);
        if(person.isEmpty()){
            throw  new NotFoundException("No user found with this username !");
        }
        return person.get();
    }
}
