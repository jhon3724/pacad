package com.proint1.udea.produccion.entidades;

// default package
// Generated 10-may-2014 11:58:30 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * TbPrdDetalleproduciones generated by hbm2java
 */
public class TbPrdDetalleproduciones implements java.io.Serializable {

	private long nbIdn;
	private TbPrdProduccion tbPrdProduccion;
	private TbPrdTipoproducionesxcampo tbPrdTipoproducionesxcampo;
	private String vrValor;
	private char blEstado;
	private String vrAdtusuario;
	private Date dtAdtfecha;

	public TbPrdDetalleproduciones() {
	}

	public TbPrdDetalleproduciones(long nbIdn, TbPrdProduccion tbPrdProduccion,
			TbPrdTipoproducionesxcampo tbPrdTipoproducionesxcampo,
			char blEstado, String vrAdtusuario, Date dtAdtfecha) {
		this.nbIdn = nbIdn;
		this.tbPrdProduccion = tbPrdProduccion;
		this.tbPrdTipoproducionesxcampo = tbPrdTipoproducionesxcampo;
		this.blEstado = blEstado;
		this.vrAdtusuario = vrAdtusuario;
		this.dtAdtfecha = dtAdtfecha;
	}

	public TbPrdDetalleproduciones(long nbIdn, TbPrdProduccion tbPrdProduccion,
			TbPrdTipoproducionesxcampo tbPrdTipoproducionesxcampo,
			String vrValor, char blEstado, String vrAdtusuario, Date dtAdtfecha) {
		this.nbIdn = nbIdn;
		this.tbPrdProduccion = tbPrdProduccion;
		this.tbPrdTipoproducionesxcampo = tbPrdTipoproducionesxcampo;
		this.vrValor = vrValor;
		this.blEstado = blEstado;
		this.vrAdtusuario = vrAdtusuario;
		this.dtAdtfecha = dtAdtfecha;
	}

	public long getNbIdn() {
		return this.nbIdn;
	}

	public void setNbIdn(long nbIdn) {
		this.nbIdn = nbIdn;
	}

	public TbPrdProduccion getTbPrdProduccion() {
		return this.tbPrdProduccion;
	}

	public void setTbPrdProduccion(TbPrdProduccion tbPrdProduccion) {
		this.tbPrdProduccion = tbPrdProduccion;
	}

	public TbPrdTipoproducionesxcampo getTbPrdTipoproducionesxcampo() {
		return this.tbPrdTipoproducionesxcampo;
	}

	public void setTbPrdTipoproducionesxcampo(
			TbPrdTipoproducionesxcampo tbPrdTipoproducionesxcampo) {
		this.tbPrdTipoproducionesxcampo = tbPrdTipoproducionesxcampo;
	}

	public String getVrValor() {
		return this.vrValor;
	}

	public void setVrValor(String vrValor) {
		this.vrValor = vrValor;
	}

	public char getBlEstado() {
		return this.blEstado;
	}

	public void setBlEstado(char blEstado) {
		this.blEstado = blEstado;
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