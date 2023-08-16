package mz.uem.model.techn;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mz.uem.model.user.UserModel;

@Repository
public interface TechnRepository extends JpaRepository<TechnModel, Integer>{
    UserModel findByEmail(String email);
}