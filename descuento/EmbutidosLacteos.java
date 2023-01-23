package descuento;

import venta.Venta;

public class EmbutidosLacteos implements IDesctoStrategy {

    @Override
    public float getDescto(Venta v) {
        return -1;
    }
}
