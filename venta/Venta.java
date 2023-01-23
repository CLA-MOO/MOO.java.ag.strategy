package venta;

import descuento.*;
import productos.Producto;
import java.util.*;

public class Venta {
    int diaSemana;
    boolean terceraEdad;
    List<LineaDeDetalle> ld = new ArrayList<LineaDeDetalle>();
    IDesctoStrategy IDescto;

    // Inicializa una venta
    public Venta(int diaSemana, boolean terceraEdad)
    {
        
    }

    // Agrega un producto a la venta
    public void addProducto(Producto p, double ctd)
    {
        
    }

    // Agrega un descuento a la venta
    public void addDescto()
    {
      
    }

    // Consulta el total de la venta
    public double getTotal()
    {
        return -1;
    }
}