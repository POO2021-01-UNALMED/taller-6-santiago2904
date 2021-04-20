/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

/**
 *
 * @author santi
 */
public class Camioneta extends Vehiculo {

    public static int cantidadCamionetas;
    private boolean volco;

    public Camioneta() {

    }

    public Camioneta(String placa, int puertas,
            String nombre, int precio,
            int peso, Fabricante fabricante, boolean volco) {

        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        this.volco = volco;
        cantidadCamionetas++;
    }

    public boolean isVolco() {
        return volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }

}
