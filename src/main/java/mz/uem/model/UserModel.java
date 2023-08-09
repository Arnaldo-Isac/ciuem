package mz.uem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// import org.springframework.beans.factory.annotation.Autowired;
// import mz.uem.model.UserRepository;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "usuario")
public class UserModel {

    // @Autowired
    // UserRepository repository;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(nullable = false, name = "NOME")
    String name;
    @Column(nullable = false, name = "UTILIZADOR")
    String username;
    @Column(nullable = false, unique=true, name="email")
    String email;
    @Column(nullable = false, name="senha")
    String password;
}
