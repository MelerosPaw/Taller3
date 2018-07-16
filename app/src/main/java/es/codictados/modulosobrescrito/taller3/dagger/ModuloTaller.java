package es.codictados.modulosobrescrito.taller3.dagger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import es.codictados.modulosobrescrito.cajaherramientas.Grasa;
import es.codictados.modulosobrescrito.cajaherramientas.MartilloPercutor;
import es.codictados.modulosobrescrito.taller3.GrasaBarata;

@Module
public class ModuloTaller {

    @Provides
    @Singleton
    protected MartilloPercutor provideMartilloPercutor() {
        return new MartilloPercutor();
    }

    @Provides
    @Singleton
    protected Grasa provideGrasa() {
        return new GrasaBarata();
    }
}
