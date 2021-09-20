package com.DTO.TiendaDeportivaVirtual;

public class DetalleVentaVo {
	private long codigo_detalle_venta;
    private long cantidad_producto;
    private long codigo_producto;
    private long codigo_venta;
    private long valor_total;
    private long valor_venta;
    private long valoriva;
    
    public DetalleVentaVo(){}
    public DetalleVentaVo(long codigo_detalle_venta,long cantidad_producto,long codigo_producto,long codigo_venta,long  valor_total,long valor_venta,long valoriva){
        this.codigo_detalle_venta=codigo_detalle_venta;
        this.cantidad_producto=cantidad_producto;
        this.codigo_producto=codigo_producto;
        this.codigo_venta=codigo_venta;
        this.valor_total=valor_total;
        this.valor_venta=valor_venta;
        this.valoriva=valoriva;
        }

    public long getCantidad_producto() {
        return cantidad_producto;
    }

    public long getCodigo_detalle_venta() {
        return codigo_detalle_venta;
    }

    public long getCodigo_producto() {
        return codigo_producto;
    }

    public long getCodigo_venta() {
        return codigo_venta;
    }

    public long getValor_total() {
        return valor_total;
    }

    public long getValor_venta() {
        return valor_venta;
    }

    public long getValoriva() {
        return valoriva;
    }

    public void setCantidad_producto(long cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    public void setCodigo_detalle_venta(long codigo_detalle_venta) {
        this.codigo_detalle_venta = codigo_detalle_venta;
    }

    public void setCodigo_producto(long codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public void setCodigo_venta(long codigo_venta) {
        this.codigo_venta = codigo_venta;
    }

    public void setValor_total(long valor_total) {
        this.valor_total = valor_total;
    }

    public void setValor_venta(long valor_venta) {
        this.valor_venta = valor_venta;
    }

    public void setValoriva(long valoriva) {
        this.valoriva = valoriva;
    }
    
}
