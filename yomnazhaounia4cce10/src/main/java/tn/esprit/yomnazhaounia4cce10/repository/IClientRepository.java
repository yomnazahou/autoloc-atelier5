package tn.esprit.yomnazhaounia4cce10.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.yomnazhaounia4cce10.domain.Client;

import java.util.Optional;

public interface IClientRepository extends JpaRepository<Client, Long> {

    Optional<Client> findByEmail(String email);
}