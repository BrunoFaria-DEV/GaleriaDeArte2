import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bruno
 */
@Entity
@Table(name="Obra")
public class ObraDeArte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "TITULO", nullable = true)
    private String titulo;
    @Column(name = "AUTOR", nullable = true)
    private String autor;
    @Column(name = "TECNICA", nullable = true)
    private String tecnica;
    @Column(name = "PROCEDENCIA", nullable = true)
    private String procedencia;
    @Column(name = "TIPO", nullable = true)
    private String tipo;
    @Column(name = "DIMENSOES", nullable = true)
    private String dimensoes;
    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_HORA", nullable = true)
    private Calendar data_hora;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDimensoes() {
        return dimensoes;
    }

    public void setDimensoes(String dimensoes) {
        this.dimensoes = dimensoes;
    }

    public Calendar getData_hora() {
        return data_hora;
    }

    public void setData_hora(Calendar data_hora) {
        this.data_hora = data_hora;
    }
}
