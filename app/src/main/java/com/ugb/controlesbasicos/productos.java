package com.ugb.controlesbasicos;

public class productos {
    String _id;
    String _rev;
    String idProducto;
    String marca;
    String descripcion;
    String presentacion;
    String stock;
    String precio;
    String urlFotoProducto;

    public productos(String _id, String _rev, String idProducto, String marca, String descripcion, String presentacion, String stock, String  precio, String urlFoto) {
        this._id = _id;
        this._rev = _rev;
        this.idProducto = idProducto;
        this.marca = marca;
        this.descripcion = descripcion;
        this.presentacion =presentacion;
        this.stock = stock;
        this.precio = precio;
        this.urlFotoProducto = urlFoto;
    }
    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }
    public String get_rev() {
        return _rev;
    }
    public void set_rev(String _rev) {
        this._rev = _rev;
    }
    public String getUrlFotoProducto() {
        return urlFotoProducto;
    }

    public void setUrlFotoProducto(String urlFotoProducto) {
        this.urlFotoProducto = urlFotoProducto;
    }

    public String getidProducto() {
        return idProducto;
    }

    public void setidProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}