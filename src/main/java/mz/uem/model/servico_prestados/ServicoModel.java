package mz.uem.model.servico_prestados;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import mz.uem.enums.ServicoEnum;
import mz.uem.model.client.ClientModel;
import mz.uem.model.techn.TechnModel;


@Entity
public class ServicoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private ServicoEnum servico;
    private LocalDate dataAbertura = LocalDate.now();
    private LocalDate dataFechamento;
    private String observacao;

    @ManyToOne
    @JoinColumn(name = "id_fk_tecnico")
    private TechnModel techn; 

    @ManyToOne
    @JoinColumn(name="id_fk_cliente")
    private ClientModel client; 

    public Integer getId() {
        return id;
    }
    public TechnModel getTechn() {
        return techn;
    }
    public void setTechn(TechnModel techn) {
        this.techn = techn;
    }
    public ClientModel getClient() {
        return client;
    }
    public void setClient(ClientModel client) {
        this.client = client;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public ServicoEnum getServico() {
        return servico;
    }
    public void setServico(ServicoEnum servico) {
        this.servico = servico;
    }
    public LocalDate getDataAbertura() {
        return dataAbertura;
    }
    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
    public LocalDate getDataFechamento() {
        return dataFechamento;
    }
    public void setDataFechamento(LocalDate dataFechamento) {
        this.dataFechamento = dataFechamento;
    }
    public String getObservacao() {
        return observacao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    
}
