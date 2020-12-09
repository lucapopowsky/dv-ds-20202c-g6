package ar.edu.davinci.dvds20202cg6.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//para usar lombok le vamos a poner
@Data 
//constructor vacio
@NoArgsConstructor
//constructor que recibe  un double tipoprenda 
@AllArgsConstructor
@Builder 
@Entity
@Table(name="prendas")

public class Prenda {
	@Id
	
	//private Estado estado;
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Column(name = "prd_id")
	private Long id;
	@Column(name = "prd_precio_base")
    private BigDecimal precioBase;

	@Column(name = "prd_tipo_prenda")
	@Enumerated(EnumType.STRING)
    private TipoPrenda tipo;

	@Column(name = "prd_descripcion")
    private String descripcion;



}