package com.DTO.TiendaDeportivaVirtual;

public class ProductoVo {
	private long codigo_producto;
    private long ivacompra;
    private long Nitproveedor;
    private long nombre_producto;
    private long precio_compra;
    private long precio_venta;
    
    public ProductoVo(){}
    public ProductoVo(long codigo_producto,long ivacompra,long Nitproveedor,long nombre_producto,long  precio_compra,long precio_venta){
        this.codigo_producto=codigo_producto;
        this.ivacompra=ivacompra;
        this.Nitproveedor=Nitproveedor;
        this.nombre_producto=nombre_producto;
        this.precio_compra=precio_compra;
        this.precio_venta=precio_venta;
        }

    public long getCodigo_producto() {
        return codigo_producto;
    }

    public long getIvacompra() {
        return ivacompra;
    }

    public long getNitproveedor() {
        return Nitproveedor;
    }

    public long getNombre_producto() {
        return nombre_producto;
    }

    public long getPrecio_compra() {
        return precio_compra;
    }

    public long getPrecio_venta() {
        return precio_venta;
    }

    public void setCodigo_producto(long codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public void setIvacompra(long ivacompra) {
        this.ivacompra = ivacompra;
    }

    public void setNitproveedor(long Nitproveedor) {
        this.Nitproveedor = Nitproveedor;
    }

    public void setNombre_producto(long nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public void setPrecio_compra(long precio_compra) {
        this.precio_compra = precio_compra;
    }

    public void setPrecio_venta(long precio_venta) {
        this.precio_venta = precio_venta;
    }
}
