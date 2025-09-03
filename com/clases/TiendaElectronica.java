package com.clases;
import java.util.ArrayList;

public class TiendaElectronica {
    private static  ArrayList<ProductoElectrodomestico> inventario = new ArrayList<ProductoElectrodomestico>();

    public static void anadeProductos(ProductoElectrodomestico producto){
        inventario.add(producto);
    }
    public static void mostrarProductos(){
        System.out.println("Productos en inventario");
        System.out.println("_______________________");
        for(ProductoElectrodomestico producto : inventario){
            System.out.println(producto.mostrarInformacion());
        }
    }

    public static void buscarProducto(String nombre){
        boolean productoEncontrado = false;
        for(ProductoElectrodomestico producto : inventario){

            String nombreProducto = producto.getNombre();
            
            if(nombreProducto.equals(nombre)){
                System.out.println("Producto encontrado");
                System.out.println(producto.mostrarInformacion());
                productoEncontrado = true;
                break;
            }
        }
        if(!productoEncontrado){
            System.out.println("Producto no encontrado");
        }
    }

    public static void realizaVenta(ProductoElectrodomestico productoAVender, int cantidadDeProductos){
        int cantidad = productoAVender.getCantidad();
        if(cantidad >= cantidadDeProductos){
            productoAVender.setCantidad(cantidad-= cantidadDeProductos);
        }else if(cantidad < cantidadDeProductos){
            System.out.println("No hay suficiente stock");
        }
    }

}
