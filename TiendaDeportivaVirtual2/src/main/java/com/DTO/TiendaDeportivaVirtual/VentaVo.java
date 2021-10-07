package com.DTO.TiendaDeportivaVirtual;
// Clase VentaVo
public class VentaVo {
	// Atributos
	private long codigo_venta;
    private long cedula_usuario;
    private long cedula_cliente;
    private long ivaventa;
    private long total_venta;
    private long valor_venta;
    // Constructor vacio
    public VentaVo(){}
    // Constructor
    public VentaVo(long codigo_venta,long cedula_usuario,long cedula_cliente,long ivaventa,long  total_venta,long valor_venta){
        this.codigo_venta=codigo_venta;
        this.cedula_usuario=cedula_usuario;
        this.cedula_cliente=cedula_cliente;
        this.ivaventa=ivaventa;
        this.total_venta=total_venta;
        this.valor_venta=valor_venta;
        }
    // Getters y setters
    public long getCedula_cliente() {
        return cedula_cliente;
    }

    public long getCedula_usuario() {
        return cedula_usuario;
    }

    public long getCodigo_venta() {
        return codigo_venta;
    }

    public long getIvaventa() {
        return ivaventa;
    }

    public long getTotal_venta() {
        return total_venta;
    }

    public long getValor_venta() {
        return valor_venta;
    }

    public void setCedula_cliente(long cedula_cliente) {
        this.cedula_cliente = cedula_cliente;
    }

    public void setCedula_usuario(long cedula_usuario) {
        this.cedula_usuario = cedula_usuario;
    }

    public void setCodigo_venta(long codigo_venta) {
        this.codigo_venta = codigo_venta;
    }

    public void setIvaventa(long ivaventa) {
        this.ivaventa = ivaventa;
    }

    public void setTotal_venta(long total_venta) {
        this.total_venta = total_venta;
    }

    public void setValor_venta(long valor_venta) {
        this.valor_venta = valor_venta;
    }
}
