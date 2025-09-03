package com.clases;

public class ComputadoraPortatil extends ProductoElectrodomestico{
    private String marca;
    private String ram;
    private int numSerie;

    public ComputadoraPortatil (String nombre, double precio, int cantidad, String marca, String ram, int numSerie){
        super(nombre, precio, cantidad);
        this.marca = marca;
        this.ram = ram;
        this.numSerie = numSerie;
    }
    @Override
    public StringBuilder mostrarInformacion() {
        return super.mostrarInformacion().append("Marca: "+this.marca+"\n")
                                        .append("Memoria RAM: "+ this.ram+"\n")
                                        .append("Numero de serie: "+ this.numSerie+"\n");
    }
}
