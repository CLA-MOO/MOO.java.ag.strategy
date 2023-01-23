package productos;

import java.util.*;

public class CatProductos {
    List<Producto> productos = new ArrayList<Producto>();

    // Inicializa el catalogo de productos
    public CatProductos()
    {
    
    }

    // Consulta un producto del catalogo
    public Producto getProducto(int clave)
    {
        return new Producto(0, "", 0);
    }
}