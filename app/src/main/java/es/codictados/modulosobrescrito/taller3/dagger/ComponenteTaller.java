package es.codictados.modulosobrescrito.taller3.dagger;

import javax.inject.Singleton;

import dagger.Component;
import es.codictados.modulosobrescrito.cajaherramientas.Grasa;
import es.codictados.modulosobrescrito.taller3.MainActivity;

@Singleton
@Component(modules = { ModuloTaller.class })
public interface ComponenteTaller {
    void inject(MainActivity activity);

    Grasa getGrasa();
}
