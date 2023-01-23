package descuento;

import venta.Venta;

public class MenonitaDescuento implements IDesctoStrategy {

    @Override
    public float getDescto(Venta v) {
        return -1;
    }
}
