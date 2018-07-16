package es.codictados.modulosobrescrito.taller3;

import android.app.Application;

import es.codictados.modulosobrescrito.cajaherramientas.DIManagerCajaHerramientas;
import es.codictados.modulosobrescrito.taller3.dagger.ModuloSobrescrito;

public class Aplicacion extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DIManagerCajaHerramientas.init(new ModuloSobrescrito());
    }
}
