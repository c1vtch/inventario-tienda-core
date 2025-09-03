package com.clases;

public class ProductoElectrodomestico{
    private String nombre;
    private double precio;
    private int cantidadDisponible;

    public ProductoElectrodomestico(String nombre, double precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidad;
    }
    public ProductoElectrodomestico(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = 0;
    }

    // Getters
    public String getNombre(){
        return this.nombre;
    }
    public double getPrecio(){
        return this.precio;
    }
    public int getCantidad(){
        return this.cantidadDisponible;
    }

    //Setters
    public void setNombre(String nombreProducto){
        this.nombre = nombreProducto;
    }
    public void setPrecio(double precioProducto){
        this.precio = precioProducto;
    }
    public void setCantidad(int cantidadProductos){
        this. cantidadDisponible = cantidadProductos;
    }

    public StringBuilder mostrarInformacion(){
        StringBuilder detalles = new StringBuilder();
        detalles.append("Nombre Producto: " + this.nombre +"\n")
                .append("Precio: $"+this.precio+"\n")
                .append("Cantidad: "+ this.cantidadDisponible+"\n");
        return detalles;
    }
}