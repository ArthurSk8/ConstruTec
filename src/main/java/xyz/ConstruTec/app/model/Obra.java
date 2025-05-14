package xyz.ConstruTec.app.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "obras")
public class Obra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String endereco;

    private LocalDate dataInicio;

    private LocalDate dataFim;

    @OneToMany(mappedBy = "obra", cascade = CascadeType.ALL)
    private List<RetiradaProduto> retiradas;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;



    public Cliente getCliente() {
        return cliente;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public List<RetiradaProduto> getRetiradas() {
        return retiradas;
    }

    public void setRetiradas(List<RetiradaProduto> retiradas) {
        this.retiradas = retiradas;
    }
}
