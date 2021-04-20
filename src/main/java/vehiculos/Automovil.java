/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller6.vehiculos;

/**
 *
 * @author santi
 */
public class Automovil extends Vehiculo {

    public static int cantidadAutomoviles;
    private int puestos;
    
    public Automovil() {
    }

    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante,int puestos) {
        super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
        this.puestos = puestos;
        cantidadAutomoviles++;
    }

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }
    
    

}
