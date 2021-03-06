package com.proint1.udea.produccion.entidades;

// default package
// Generated 8/11/2014 11:56:05 AM by Hibernate Tools 4.0.0

import java.io.Serializable;

/**
 * TbPrdHistoriamiembrosId generated by hbm2java
 */
public class TbPrdHistoriamiembrosId implements java.io.Serializable {

	private long nbGpiIdn;
	private long nbAutIdn;
	private Serializable dtFecha;

	public TbPrdHistoriamiembrosId() {
	}

	public TbPrdHistoriamiembrosId(long nbGpiIdn, long nbAutIdn,
			Serializable dtFecha) {
		this.nbGpiIdn = nbGpiIdn;
		this.nbAutIdn = nbAutIdn;
		this.dtFecha = dtFecha;
	}

	public long getNbGpiIdn() {
		return this.nbGpiIdn;
	}

	public void setNbGpiIdn(long nbGpiIdn) {
		this.nbGpiIdn = nbGpiIdn;
	}

	public long getNbAutIdn() {
		return this.nbAutIdn;
	}

	public void setNbAutIdn(long nbAutIdn) {
		this.nbAutIdn = nbAutIdn;
	}

	public Serializable getDtFecha() {
		return this.dtFecha;
	}

	public void setDtFecha(Serializable dtFecha) {
		this.dtFecha = dtFecha;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TbPrdHistoriamiembrosId))
			return false;
		TbPrdHistoriamiembrosId castOther = (TbPrdHistoriamiembrosId) other;

		return (this.getNbGpiIdn() == castOther.getNbGpiIdn())
				&& (this.getNbAutIdn() == castOther.getNbAutIdn())
				&& ((this.getDtFecha() == castOther.getDtFecha()) || (this
						.getDtFecha() != null && castOther.getDtFecha() != null && this
						.getDtFecha().equals(castOther.getDtFecha())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getNbGpiIdn();
		result = 37 * result + (int) this.getNbAutIdn();
		result = 37 * result
				+ (getDtFecha() == null ? 0 : this.getDtFecha().hashCode());
		return result;
	}

}
