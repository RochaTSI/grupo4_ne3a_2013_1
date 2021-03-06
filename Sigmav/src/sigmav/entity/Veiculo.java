/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sigmav.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.*;

/**
 *
 * @author fernando
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "retrieveByPlaca", query = "select v from Veiculo v where v.placa like :placa"),  
    @NamedQuery(name = "retrieveByPessResponsavel", query = "select v from Veiculo v where v.responsavel like :responsavel")  
})
@Table(name = "Veiculo")
public class Veiculo implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;        
    
    //As duas list com , fetch = FetchType.EAGER da erro no hibernate, com apenas um list roda normalmente, porque?
    @OneToMany(cascade= CascadeType.ALL , fetch = FetchType.LAZY)
    @Column(nullable = true)
    private List<Manutencao> manutencoes = new ArrayList<>();    
    
    @OneToMany(cascade= CascadeType.ALL, fetch = FetchType.LAZY )
    @Column(nullable = true)
    private List<Consumo> consumo = new ArrayList<>();
    
    @Transient
    private float mediaConsumo;
    
    @Column(name = "marca", length = 40, nullable = false)
    private String marca;
    
    @Column(name = "modelo", length = 40, nullable = false)
    private String modelo;
    
    @Column(name = "versao", length = 30, nullable = true)
    private String versao;
    
    @Column(name = "combustivel", length = 20, nullable = false)
    private String combustivel;
    
    @Column(name = "anoModelo", length = 5, nullable = false)
    private String anoModelo;
    
    @Column(name = "responsavel", length = 30, nullable = false)
    private String responsavel;

    @Column(name = "placa", length = 9, nullable = false, unique = true)
    private String placa;

    @Column(name = "kmCompra", length = 10, nullable = false)
    private String kmCompra;

    //##########################################################################
    public void setKmCompra(String kmCompra) {
        this.kmCompra = kmCompra;
    }
    
    public String getKmCompra() {
        return kmCompra;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }
        
    public long getId() {
        return id;
    }

    public List<Manutencao> getManutencoes() {
        return manutencoes;
    }

    public List<Consumo> getConsumo() {
        return consumo;
    }

    public float getMediaConsumo() {
        return mediaConsumo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getVersao() {
        return versao;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public String getAnoModelo() {
        return anoModelo;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setManutencoes(List<Manutencao> manutencoes) {
        this.manutencoes = manutencoes;
    }

    public void setConsumo(List<Consumo> consumo) {
        this.consumo = consumo;
    }

    public void setMediaConsumo(float mediaConsumo) {
        this.mediaConsumo = mediaConsumo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public void setAnoModelo(String anoModelo) {
        this.anoModelo = anoModelo;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 79 * hash + Objects.hashCode(this.manutencoes);
        hash = 79 * hash + Objects.hashCode(this.consumo);
        hash = 79 * hash + Float.floatToIntBits(this.mediaConsumo);
        hash = 79 * hash + Objects.hashCode(this.marca);
        hash = 79 * hash + Objects.hashCode(this.modelo);
        hash = 79 * hash + Objects.hashCode(this.versao);
        hash = 79 * hash + Objects.hashCode(this.combustivel);
        hash = 79 * hash + Objects.hashCode(this.anoModelo);
        hash = 79 * hash + Objects.hashCode(this.responsavel);
        hash = 79 * hash + Objects.hashCode(this.placa);
        hash = 79 * hash + Objects.hashCode(this.kmCompra);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Veiculo other = (Veiculo) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.manutencoes, other.manutencoes)) {
            return false;
        }
        if (!Objects.equals(this.consumo, other.consumo)) {
            return false;
        }
        if (Float.floatToIntBits(this.mediaConsumo) != Float.floatToIntBits(other.mediaConsumo)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.versao, other.versao)) {
            return false;
        }
        if (!Objects.equals(this.combustivel, other.combustivel)) {
            return false;
        }
        if (!Objects.equals(this.anoModelo, other.anoModelo)) {
            return false;
        }
        if (!Objects.equals(this.responsavel, other.responsavel)) {
            return false;
        }
        if (!Objects.equals(this.placa, other.placa)) {
            return false;
        }
        if (!Objects.equals(this.kmCompra, other.kmCompra)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "id=" + id + ", manutencoes=" + manutencoes + ", consumo=" + consumo + ", mediaConsumo=" + mediaConsumo + ", marca=" + marca + ", modelo=" + modelo + ", versao=" + versao + ", combustivel=" + combustivel + ", anoModelo=" + anoModelo + ", responsavel=" + responsavel + ", placa=" + placa + ", kmCompra=" + kmCompra + '}';
    }

    
    
}
