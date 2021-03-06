package com.proint1.udea.produccion.entidades;


// default package
// Generated 8/11/2014 11:56:05 AM by Hibernate Tools 4.0.0

/**
 * TbPrdMiembrosxgrupoId generated by hbm2java
 */
public class TbPrdMiembrosxgrupoId implements java.io.Serializable {

	private long nbGpiIdn;
	private long nbAutIdn;

	public TbPrdMiembrosxgrupoId() {
	}

	public TbPrdMiembrosxgrupoId(long nbGpiIdn, long nbAutIdn) {
		this.nbGpiIdn = nbGpiIdn;
		this.nbAutIdn = nbAutIdn;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TbPrdMiembrosxgrupoId))
			return false;
		TbPrdMiembrosxgrupoId castOther = (TbPrdMiembrosxgrupoId) other;

		return (this.getNbGpiIdn() == castOther.getNbGpiIdn())
				&& (this.getNbAutIdn() == castOther.getNbAutIdn());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getNbGpiIdn();
		result = 37 * result + (int) this.getNbAutIdn();
		return result;
	}

}