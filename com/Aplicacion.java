package com;
import com.clases.ComputadoraPortatil;
import com.clases.ProductoElectrodomestico;
import com.clases.Televisor;
import com.clases.TiendaElectronica;

public class Aplicacion {
    public static void main(String args []){

        ProductoElectrodomestico tele = new ProductoElectrodomestico("tele", 23450, 20);
        ProductoElectrodomestico tablet = new ProductoElectrodomestico("tablet", 25450, 10);

        Televisor televisor1 = new Televisor("LG tv", 250000, 6, "46 pulgadas", "1920x1080");
        Televisor televisor2 = new Televisor("Samsung oled", 150000, 6, "32 pulgadas", "1920x1080");
        
        ComputadoraPortatil compu = new ComputadoraPortatil("TUF", 340000, 5, "Asus", "16gb", 23455645);
        ComputadoraPortatil compu2 = new ComputadoraPortatil("Pulse", 380000, 5, "MSI", "16gb", 56098445);

        
        TiendaElectronica.anadeProductos(compu);
        TiendaElectronica.anadeProductos(compu2);
        TiendaElectronica.anadeProductos(tele);
        TiendaElectronica.anadeProductos(tablet);
        TiendaElectronica.anadeProductos(televisor1);
        TiendaElectronica.anadeProductos(televisor2);

        TiendaElectronica.realizaVenta(tele, 5);
        TiendaElectronica.realizaVenta(compu, 3);
        TiendaElectronica.realizaVenta(tablet, 7);
        TiendaElectronica.mostrarProductos(); 
        
        TiendaElectronica.realizaVenta(compu2, 6);
    }
}
