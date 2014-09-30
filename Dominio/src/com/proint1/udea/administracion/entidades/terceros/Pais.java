package com.proint1.udea.administracion.entidades.terceros;
// default package
// Generated 10-may-2014 11:58:30 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * TbAdmPaises generated by hbm2java
 */
public class Pais implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private long nbIdn;
	private String vrDescripcion;
	private String vrCodigo;
	private String vrAdtusuario;
	private Date dtAdtfecha;

	public Pais() {
	}

	public Pais(long nbIdn, String vrDescripcion, String vrCodigo,
			Date dtAdtfecha) {
		this.nbIdn = nbIdn;
		this.vrDescripcion = vrDescripcion;
		this.vrCodigo = vrCodigo;
		this.dtAdtfecha = dtAdtfecha;
	}

	public Pais(long nbIdn, String vrDescripcion, String vrCodigo,
			String vrAdtusuario, Date dtAdtfecha) {
		this.nbIdn = nbIdn;
		this.vrDescripcion = vrDescripcion;
		this.vrCodigo = vrCodigo;
		this.vrAdtusuario = vrAdtusuario;
		this.dtAdtfecha = dtAdtfecha;

	}

	public long getNbIdn() {
		return this.nbIdn;
	}

	public void setNbIdn(long nbIdn) {
		this.nbIdn = nbIdn;
	}

	public String getVrDescripcion() {
		return this.vrDescripcion;
	}

	public void setVrDescripcion(String vrDescripcion) {
		this.vrDescripcion = vrDescripcion;
	}

	public String getVrCodigo() {
		return this.vrCodigo;
	}

	public void setVrCodigo(String vrCodigo) {
		this.vrCodigo = vrCodigo;
	}

	public String getVrAdtusuario() {
		return this.vrAdtusuario;
	}

	public void setVrAdtusuario(String vrAdtusuario) {
		this.vrAdtusuario = vrAdtusuario;
	}

	public Date getDtAdtfecha() {
		return this.dtAdtfecha;
	}

	public void setDtAdtfecha(Date dtAdtfecha) {
		this.dtAdtfecha = dtAdtfecha;
	}
}