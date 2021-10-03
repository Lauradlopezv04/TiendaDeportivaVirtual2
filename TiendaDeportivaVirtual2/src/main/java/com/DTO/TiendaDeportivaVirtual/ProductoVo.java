package com.DTO.TiendaDeportivaVirtual;

public class ProductoVo {
	private long codigo_producto;
    private double ivacompra;
    private long Nitproveedor;
    private String nombre_producto;
    private double precio_compra;
    private double precio_venta;
    private String archivo;
    
    public ProductoVo(){}
    public ProductoVo(long codigo_producto,long ivacompra,long Nitproveedor,String nombre_producto,double precio_compra,double precio_venta, String archivo){
        this.codigo_producto=codigo_producto;
        this.ivacompra=ivacompra;
        this.Nitproveedor=Nitproveedor;
        this.nombre_producto=nombre_producto;
        this.precio_compra=precio_compra;
        this.precio_venta=precio_venta;
        this.archivo=archivo;
        }
	public String getArchivo() {
		return archivo;
	}
	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}
	public long getCodigo_producto() {
		return codigo_producto;
	}
	public void setCodigo_producto(long codigo_producto) {
		this.codigo_producto = codigo_producto;
	}
	public double getIvacompra() {
		return ivacompra;
	}
	public void setIvacompra(double iva_compra) {
		this.ivacompra = iva_compra;
	}
	public long getNitproveedor() {
		return Nitproveedor;
	}
	public void setNitproveedor(long nitproveedor) {
		Nitproveedor = nitproveedor;
	}
	public String getNombre_producto() {
		return nombre_producto;
	}
	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}
	public double getPrecio_compra() {
		return precio_compra;
	}
	public void setPrecio_compra(double precio_compra) {
		this.precio_compra = precio_compra;
	}
	public double getPrecio_venta() {
		return precio_venta;
	}
	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = precio_venta;
	}

   
}
