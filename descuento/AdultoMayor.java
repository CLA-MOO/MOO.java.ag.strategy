package descuento;

import venta.Venta;

public class AdultoMayor implements IDesctoStrategy {
    @Override
    public float getDescto(Venta v) {
        return -1;
    }    
}