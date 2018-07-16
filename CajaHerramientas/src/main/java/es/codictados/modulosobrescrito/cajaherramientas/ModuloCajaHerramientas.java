package es.codictados.modulosobrescrito.cajaherramientas;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ModuloCajaHerramientas {

    @Provides
    protected String provideFormula() {
        return "Grasa hecha a base de componentes de calidad.";
    }

    @Provides
    @Singleton
    protected Grasa provideGrasa() {
        return new Grasa();
    }
}
