package mz.uem.model.user;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;
import mz.uem.enums.UserCategory;

@Getter
@Setter
@MappedSuperclass
public abstract class UserModel{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String username;
    private String email;
    private String password;
    private String imagem;
    private UserCategory userCategory;//Defaul client

    public UserModel() {}

    public UserModel(int id, String name, String username, String email, String password, String imagem,
            UserCategory userCategory) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
        this.imagem = imagem;
        this.userCategory = userCategory;
    }
}