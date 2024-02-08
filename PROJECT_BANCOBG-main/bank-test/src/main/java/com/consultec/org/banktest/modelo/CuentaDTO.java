package com.consultec.org.banktest.modelo;

import java.io.Serializable;
import java.util.Date;

public class CuentaDTO implements Serializable {


    private String numero_cuenta;

    private String alias;

    private String estado;

    private String tipo_cuenta;

    private double balance;

    private double interes;
    private Date fecha_creacion;

    public CuentaDTO(String numero_cuenta, String alias, String estado, String tipo_cuenta, double balance, double interes, Date fecha_creacion) {
        this.numero_cuenta = numero_cuenta;
        this.alias = alias;
        this.estado = estado;
        this.tipo_cuenta = tipo_cuenta;
        this.balance = balance;
        this.interes = interes;
        this.fecha_creacion = fecha_creacion;
    }

    public CuentaDTO() {

    }

    public String getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(String numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo_cuenta(String tipoCuenta) {
        return tipo_cuenta;
    }

    public void setTipo_cuenta(String tipo_cuenta) {
        this.tipo_cuenta = tipo_cuenta;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }
}
