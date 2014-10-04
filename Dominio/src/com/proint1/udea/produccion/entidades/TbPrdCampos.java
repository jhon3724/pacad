package com.proint1.udea.produccion.entidades;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TbPrdCampos generated by hbm2java
 */
public class TbPrdCampos implements java.io.Serializable {

	private static final long serialVersionUID = 8160287708542189627L;
	
	private long nbIdn;
	private String vrDescripcion;
	private char vrTipocampo;
	private short nbTama�ocampo;
	private Boolean nbDecimales;
	private char blEstado;
	private String vrAdtusuario;
	private Date dtAdtfecha;
	private Set tbPrdTipoproduccionesxcampos = new HashSet(0);

	public TbPrdCampos() {
	}

	public TbPrdCampos(long nbIdn, String vrDescripcion, char vrTipocampo,
			short nbTama�ocampo, char blEstado, String vrAdtusuario,
			Date dtAdtfecha) {
		this.nbIdn = nbIdn;
		this.vrDescripcion = vrDescripcion;
		this.vrTipocampo = vrTipocampo;
		this.nbTama�ocampo = nbTama�ocampo;
		this.blEstado = blEstado;
		this.vrAdtusuario = vrAdtusuario;
		this.dtAdtfecha = dtAdtfecha;
	}

	public TbPrdCampos(long nbIdn, String vrDescripcion, char vrTipocampo,
			short nbTama�ocampo, Boolean nbDecimales, char blEstado,
			String vrAdtusuario, Date dtAdtfecha,
			Set tbPrdTipoproduccionesxcampos) {
		this.nbIdn = nbIdn;
		this.vrDescripcion = vrDescripcion;
		this.vrTipocampo = vrTipocampo;
		this.nbTama�ocampo = nbTama�ocampo;
		this.nbDecimales = nbDecimales;
		this.blEstado = blEstado;
		this.vrAdtusuario = vrAdtusuario;
		this.dtAdtfecha = dtAdtfecha;
		this.tbPrdTipoproduccionesxcampos = tbPrdTipoproduccionesxcampos;
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

	public char getVrTipocampo() {
		return this.vrTipocampo;
	}

	public void setVrTipocampo(char vrTipocampo) {
		this.vrTipocampo = vrTipocampo;
	}

	public short getNbTama�ocampo() {
		return this.nbTama�ocampo;
	}

	public void setNbTama�ocampo(short nbTama�ocampo) {
		this.nbTama�ocampo = nbTama�ocampo;
	}

	public Boolean getNbDecimales() {
		return this.nbDecimales;
	}

	public void setNbDecimales(Boolean nbDecimales) {
		this.nbDecimales = nbDecimales;
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

	public Set getTbPrdTipoproduccionesxcampos() {
		return this.tbPrdTipoproduccionesxcampos;
	}

	public void setTbPrdTipoproduccionesxcampos(Set tbPrdTipoproduccionesxcampos) {
		this.tbPrdTipoproduccionesxcampos = tbPrdTipoproduccionesxcampos;
	}

}