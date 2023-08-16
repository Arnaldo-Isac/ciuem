package mz.uem.model.client;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ClientRepository extends JpaRepository<ClientModel, Integer> {
    ClientModel findByEmail(String email);
}