/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

import java.util.ArrayList;

/**
 *
 * @author santi
 */
public class Fabricante {

    public static ArrayList<Fabricante> fabricantes = new ArrayList<>();
    private String nombre;
    private Pais pais;
    public int ventas;

    public Fabricante() {

    }

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        fabricantes.add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public static Fabricante fabricaMayorVentas() {
        int v = 0;
        for (Fabricante fab : fabricantes) {
            if (fab.ventas > v) {
                v = fab.ventas;
            }
        }
        Fabricante mayor = new Fabricante();
        for (Fabricante fab : fabricantes) {
            if (fab.ventas == v) {
                mayor = fab;
            }
        }
        return mayor;
    }

}
