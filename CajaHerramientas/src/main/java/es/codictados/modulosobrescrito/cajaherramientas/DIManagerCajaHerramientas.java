package es.codictados.modulosobrescrito.cajaherramientas;

import android.support.annotation.Nullable;

public class DIManagerCajaHerramientas {

    private DIManagerCajaHerramientas() {}

    private static ComponenteCajaHerramientas sComponente;

    public static void init(@Nullable ModuloCajaHerramientas modulo) {

        DaggerComponenteCajaHerramientas.Builder builder = DaggerComponenteCajaHerramientas.builder();

        if (modulo != null) {
            builder.moduloCajaHerramientas(modulo);
        }

        sComponente = builder.build();
    }

    public static ComponenteCajaHerramientas getComponente() {
        return sComponente;
    }
}
