package mz.uem.model.techn;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
import mz.uem.model.servico_prestados.ServicoModel;
import mz.uem.model.user.UserModel;

@Getter
@Setter
@Entity
public class TechnModel extends UserModel{
    
    @OneToMany
    private List<ServicoModel> servico = new ArrayList<>();    

}
