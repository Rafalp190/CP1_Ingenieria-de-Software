package models;
public class Proveedor {
	
	private int codigoProveedor;
	private String nombreProveedor;
	private int cantidadJugetes;
	/**
	 * @return the codigoProveedor
	 */
	public int getCodigoProveedor() {
		return codigoProveedor;
	}
	/**
	 * @param codigoProveedor the codigoProveedor to set
	 */
	public void setCodigoProveedor(int codigoProveedor) {
		this.codigoProveedor = codigoProveedor;
	}
	/**
	 * @return the nombreProveedor
	 */
	public String getNombreProveedor() {
		return nombreProveedor;
	}
	/**
	 * @param nombreProveedor the nombreProveedor to set
	 */
	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}
	/**
	 * @return the cantidadJugetes
	 */
	public int getCantidadJugetes() {
		return cantidadJugetes;
	}
	/**
	 * @param cantidadJugetes the cantidadJugetes to set
	 */
	public void setCantidadJugetes(int cantidadJugetes) {
		this.cantidadJugetes = cantidadJugetes;
	}
	
}
