// Generated with g9.

package com.coomeva.api.v1.CoomevaApi.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Cuenta implements Serializable {

   

    @Column(name="Cedula", nullable=false, precision=10)
    private int cedula;
    @Column(name="Usuario", nullable=false, length=100)
    private String usuario;
    @Column(name="NumeroCuenta", nullable=false, precision=10)
    private int numeroCuenta;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="IdCuenta", unique=true, nullable=false, precision=10)
    private int idCuenta;

    /** Default constructor. */
    public Cuenta() {
        super();
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

    /**
     * Access method for idCuenta.
     *
     * @return the current value of idCuenta
     */
    public int getIdCuenta() {
        return idCuenta;
    }

    /**
     * Setter method for idCuenta.
     *
     * @param aIdCuenta the new value for idCuenta
     */
    public void setIdCuenta(int aIdCuenta) {
        idCuenta = aIdCuenta;
    }

    /**
     * Compares the key for this instance with another Cuenta.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Cuenta and the key objects are equal
     */
   


}
