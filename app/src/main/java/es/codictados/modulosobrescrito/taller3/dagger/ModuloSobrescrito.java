package es.codictados.modulosobrescrito.taller3.dagger;

import es.codictados.modulosobrescrito.cajaherramientas.Grasa;
import es.codictados.modulosobrescrito.cajaherramientas.ModuloCajaHerramientas;

public class ModuloSobrescrito extends ModuloCajaHerramientas {

    @Override
    protected String provideFormula() {
        return "Grasa hecha con componentes baratos.";
    }

    @Override
    protected Grasa provideGrasa() {
        return DIManagerTaller.getComponente().getGrasa();
    }
}