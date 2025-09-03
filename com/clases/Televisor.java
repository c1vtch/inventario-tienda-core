package com.clases;

public class Televisor extends ProductoElectrodomestico {
    private String tamanoPantalla;
    private String resolucion;

    public Televisor(String nombre, double precio, int cantidad, String tamanoPantalla, String resolucion){
        super(nombre,precio,cantidad);
        this.tamanoPantalla = tamanoPantalla;
        this.resolucion = resolucion;
    }
   
    @Override
    public StringBuilder mostrarInformacion() {
        return super.mostrarInformacion()
                .append("Tamano pantalla: "+ this.tamanoPantalla + "\n")
                .append("Resolucion: " + this.resolucion + "\n");
    }
}

