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
public class Camion extends Vehiculo {

    public static int cantidadCamiones;
    private int ejes;

    public Camion() {

    }

    public Camion(String placa, String nombre, int precio, int peso,
            Fabricante fabricante, int ejes) {

        super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
        this.ejes = ejes;
        cantidadCamiones++;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

}
