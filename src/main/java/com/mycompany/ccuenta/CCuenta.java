/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ccuenta;

import java.util.List;

/**
 *
 * @author ED05 Manuel Gomariz Quero
 * @version 1.0
 * @see ccuenta.ccuenta.CCuentaEmpleados.
 */
/**
 * clase Ccuenta contiene los atributos y métodos de una cuenta correinte
 * nombre es atributo String de la clase CCuenta
 * cuenta es atributo String de la clase CCuenta que contiene los 20 dígitos de mi cuenta corriente
 * saldo es atributo double de la clase CCuenta que contiene el saldo de mi cuenta corriente
 * tipoInteres es atributo double de la clase CCuenta que contiene el tipo de interés de mi cuenta corriente
 * factura es un array de String que contiene los tipos de factura de los que se hará un cargo en mi cuenta
 */
public class CCuenta {

    // Propiedades de la Clase Cuenta
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    private String[] factura = {"seguro", "luz", "agua", "alquiler"};

    /* Constructor sin argumentos */
    public CCuenta() {
    }
    
    
    /**
     * Constructor con parámetro para crear objetos de la clase CCcuenta inicializando sus propiedades dando valor a sus parametros
     * @param nom de tipo String, valor pd de dar, para asignar valor a la propiedad/atributo nombre
     * @param cue de tipo String, valor pd de dar, para asignar valor a la propiedad/atributo cuenta
     * @param sal de tipo double, valor pd de dar, para asignar valor a la propiedad/atributo saldo
     * @param tipo de tipo double, valor pd de dar, para asignar valor a la propiedad/atributo tipoInteres
     */
    // Constructor con parámetro para iniciar todas las propiedades de la clase
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }
    
    /**
     * Método para asignar nombre al atributo nombre (para modificarlo)
     * @param nom de tipo String, valor pd de dar, asignar valor a la propiedad/atributo nombre (para modificarlo)
     */
    // Método para asignar el nombre del titular de la cuenta

    public void setNombre(String nom) {
        nombre = nom;
    }
    /**
     * Método que devuelve el atributo nombre de la clase CCuenta
     * @return devuelve el atributo nombre de tipo String
     */
    // Método que me devuelve el nombre del titular
    public String getNombre() {
        return nombre;
    }
    /**
     * Método que devuelve el atributo saldo de la clase CCuenta
     * @return devuelve el atributo saldo de tipo double
     */
    // Método que me devuelve el saldo disponible en cada momento
    public double getEstado() {
        return getSaldo();
    }

    /* Método para ingresar cantidades en la cuenta. Modifica el saldo.
     * Este método va a ser probado con Junit
     */
    
    /**
     * Método para incrementar el atributo saldo de la clase CCuenta
     * @param cantidad de tipo double, valor pd de dar, para asignar valor a la propiedad/atributo cantidad
     * @throws Exception lanzará excepción si la cantidad es menor que 0
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }


    /* Método para retirar cantidades en la cuenta. Modifica el saldo.
     * Este método va a ser probado con Junit
     */
    /**
     * Método para decrementar el atributo saldo de la clase CCuenta
     * @param cantidad de tipo double, valor pd de dar, para asignar valor a la propiedad/atributo cantidad
     * @throws Exception lanzará excepción si la cantidad es menor que 0 o la cantidad a retirar es mayor al saldo dado por getEstado()
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (getEstado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }
    
    /**
     * Método que devuelve el atributo cuenta de la clase CCuenta
     * @return devuelve el atributo cuenta de tipo double
     */
    
    // Método que me devuelve el número de cuenta
    public String getCuenta() {
        return cuenta;
    }
    
    /**
     * Método para decrementar el saldo de cuenta en función de distintas opciones de tipo de factura incluidas en el atr array [] factura
     * @param tipo de tipo String, para asignar valor a la variable condición:'tipo' del switch entre los valores del array [] factura
     * @param cantidad de tipo double, valor pd de dar, para asignar valor al atributo cantidad incluido en cada case de 'tipo' del switch
     */
    public void cobroFactura(String tipo,double cantidad){
        switch(tipo){
        
            case "alquiler":
                if (cantidad >0 && cantidad<=400)
                    this.setSaldo(this.getSaldo() - cantidad); //this.saldo = this.saldo-cantidad;
                break;
            case "luz":
                if (cantidad<=200)
                    this.setSaldo(this.getSaldo() - cantidad);
            case "agua":
                
                if (cantidad >0 && cantidad<=200)
                    this.setSaldo(this.getSaldo() - cantidad);
                break;
            case "seguro":
                if (cantidad >0 && cantidad<=125)
                    this.setSaldo(this.getSaldo() - cantidad);
                    
                
        }
    
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * @return the factura
     */
    public String[] getFactura() {
        return factura;
    }

    /**
     * @param factura the factura to set
     */
    public void setFactura(String[] factura) {
        this.factura = factura;
    }
    
}
    
 