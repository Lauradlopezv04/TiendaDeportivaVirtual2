package com.DTO.TiendaDeportivaVirtual;

public class ProveedorVo {
	private long Nit;
    private String ciudad_proveedor;
    private String direccion_proveedor;
    private String nombre_proveedor;
    private String telefono_proveedor;
    
    public ProveedorVo(){}
    public ProveedorVo(long Nit,String ciudad_proveedor,String direccion_proveedor,String nombre_proveedor,String telefono_proveedor){
        this.Nit=Nit;
        this.ciudad_proveedor=ciudad_proveedor;
        this.direccion_proveedor=direccion_proveedor;
        this.nombre_proveedor=nombre_proveedor;
        this.telefono_proveedor=telefono_proveedor;
       }

    public String getCiudad_proveedor() {
        return ciudad_proveedor;
    }

    public String getDireccion_proveedor() {
        return direccion_proveedor;
    }

    public long getNit() {
        return Nit;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public String getTelefono_proveedor() {
        return telefono_proveedor;
    }

    public void setCiudad_proveedor(String ciudad_proveedor) {
        this.ciudad_proveedor = ciudad_proveedor;
    }

    public void setDireccion_proveedor(String direccion_proveedor) {
        this.direccion_proveedor = direccion_proveedor;
    }

    public void setNit(long Nit) {
        this.Nit = Nit;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    public void setTelefono_proveedor(String telefono_proveedor) {
        this.telefono_proveedor = telefono_proveedor;
    }
}
