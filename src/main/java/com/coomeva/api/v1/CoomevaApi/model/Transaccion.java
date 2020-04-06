// Generated with g9.

package com.coomeva.api.v1.CoomevaApi.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Transaccion implements Serializable {

  

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="IdTransaccion", unique=true, nullable=false, precision=10)
    private int idTransaccion;
    @Column(name="NumeroOperacion", nullable=false, precision=10)
    private int numeroOperacion;
    @Column(name="CuentaOrigen", nullable=false, precision=10)
    private int cuentaOrigen;
    @Column(name="CuentaDestino", nullable=false, precision=10)
    private int cuentaDestino;
    @Column(name="BancoDestino", nullable=false, length=100)
    private String bancoDestino;
    @Column(name="Monto", nullable=false, precision=10)
    private int monto;
    @Column(name="Comercio", nullable=false, length=100)
    private String comercio;
    @Column(name="CostoOperacion", nullable=false, precision=10)
    private int costoOperacion;
    @Column(name="FechaHora", nullable=false)
    private String fechaHora;
    @Column(name="Cedula", nullable=false, precision=10)
    private int cedula;
    @Column(name="Usuario", nullable=false, length=100)
    private String usuario;
    @Column(name="NumeroCuenta", nullable=false, precision=10)
    private int numeroCuenta;

    /** Default constructor. */
    public Transaccion() {
        super();
    }

    /**
     * Access method for idTransaccion.
     *
     * @return the current value of idTransaccion
     */
    public int getIdTransaccion() {
        return idTransaccion;
    }

    /**
     * Setter method for idTransaccion.
     *
     * @param aIdTransaccion the new value for idTransaccion
     */
    public void setIdTransaccion(int aIdTransaccion) {
        idTransaccion = aIdTransaccion;
    }

    /**
     * Access method for numeroOperacion.
     *
     * @return the current value of numeroOperacion
     */
    public int getNumeroOperacion() {
        return numeroOperacion;
    }

    /**
     * Setter method for numeroOperacion.
     *
     * @param aNumeroOperacion the new value for numeroOperacion
     */
    public void setNumeroOperacion(int aNumeroOperacion) {
        numeroOperacion = aNumeroOperacion;
    }

    /**
     * Access method for cuentaOrigen.
     *
     * @return the current value of cuentaOrigen
     */
    public int getCuentaOrigen() {
        return cuentaOrigen;
    }

    /**
     * Setter method for cuentaOrigen.
     *
     * @param aCuentaOrigen the new value for cuentaOrigen
     */
    public void setCuentaOrigen(int aCuentaOrigen) {
        cuentaOrigen = aCuentaOrigen;
    }

    /**
     * Access method for cuentaDestino.
     *
     * @return the current value of cuentaDestino
     */
    public int getCuentaDestino() {
        return cuentaDestino;
    }

    /**
     * Setter method for cuentaDestino.
     *
     * @param aCuentaDestino the new value for cuentaDestino
     */
    public void setCuentaDestino(int aCuentaDestino) {
        cuentaDestino = aCuentaDestino;
    }

    /**
     * Access method for bancoDestino.
     *
     * @return the current value of bancoDestino
     */
    public String getBancoDestino() {
        return bancoDestino;
    }

    /**
     * Setter method for bancoDestino.
     *
     * @param aBancoDestino the new value for bancoDestino
     */
    public void setBancoDestino(String aBancoDestino) {
        bancoDestino = aBancoDestino;
    }

    /**
     * Access method for monto.
     *
     * @return the current value of monto
     */
    public int getMonto() {
        return monto;
    }

    /**
     * Setter method for monto.
     *
     * @param aMonto the new value for monto
     */
    public void setMonto(int aMonto) {
        monto = aMonto;
    }

    /**
     * Access method for comercio.
     *
     * @return the current value of comercio
     */
    public String getComercio() {
        return comercio;
    }

    /**
     * Setter method for comercio.
     *
     * @param aComercio the new value for comercio
     */
    public void setComercio(String aComercio) {
        comercio = aComercio;
    }

    /**
     * Access method for costoOperacio.
     *
     * @return the current value of costoOperacio
     */
    public int getCostoOperacion() {
        return costoOperacion;
    }

    /**
     * Setter method for costoOperacio.
     *
     * @param aCostoOperacio the new value for costoOperacio
     */
    public void setCostoOperacion(int aCostoOperacion) {
        costoOperacion = aCostoOperacion;
    }

    /**
     * Access method for fechaHora.
     *
     * @return the current value of fechaHora
     */
    public String getFechaHora() {
        return fechaHora;
    }

    /**
     * Setter method for fechaHora.
     *
     * @param aFechaHora the new value for fechaHora
     */
    public void setFechaHora(String aFechaHora) {
    	Date objDate = new Date(); // Sistema actual La fecha y la hora se asignan a objDate 
        String strDateFormat = "dd/MM/yyyy hh:mm:ss a"; // El formato de fecha está especificado  
        SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat); // La cadena de formato de fecha se pasa como un argumento al objeto 
        this.fechaHora = objSDF.format(objDate);
    }
    
    /**
     * Access method for cedula.
     *
     * @return the current value of cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * Setter method for cedula.
     *
     * @param aCedula the new value for cedula
     */
    public void setCedula(int aCedula) {
        cedula = aCedula;
    }

    /**
     * Access method for usuario.
     *
     * @return the current value of usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Setter method for usuario.
     *
     * @param aUsuario the new value for usuario
     */
    public void setUsuario(String aUsuario) {
        usuario = aUsuario;
    }

    /**
     * Access method for numeroCuenta.
     *
     * @return the current value of numeroCuenta
     */
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Setter method for numeroCuenta.
     *
     * @param aNumeroCuenta the new value for numeroCuenta
     */
    public void setNumeroCuenta(int aNumeroCuenta) {
        numeroCuenta = aNumeroCuenta;
    }

	public Transaccion(int idTransaccion, int numeroOperacion, int cuentaOrigen, int cuentaDestino, String bancoDestino,
			int monto, String comercio, int costoOperacion, String fechaHora, int cedula, String usuario,
			int numeroCuenta) {
		super();
		this.idTransaccion = idTransaccion;
		this.numeroOperacion = numeroOperacion;
		this.cuentaOrigen = cuentaOrigen;
		this.cuentaDestino = cuentaDestino;
		this.bancoDestino = bancoDestino;
		this.monto = monto;
		this.comercio = comercio;
		this.costoOperacion = costoOperacion;
		this.fechaHora = fechaHora;
		this.cedula = cedula;
		this.usuario = usuario;
		this.numeroCuenta = numeroCuenta;
	}


   

}
