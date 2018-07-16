package es.codictados.modulosobrescrito.taller3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ScrollView;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import es.codictados.modulosobrescrito.cajaherramientas.Grasa;
import es.codictados.modulosobrescrito.cajaherramientas.MartilloPercutor;
import es.codictados.modulosobrescrito.taller3.dagger.DIManagerTaller;

public class MainActivity extends AppCompatActivity {

    @Inject Grasa mGrasa1;
    @Inject Grasa mGrasa2;
    @Inject Grasa mGrasa3;
    @Inject MartilloPercutor mMartilloPercutor1;
    @Inject MartilloPercutor mMartilloPercutor2;
    @Inject MartilloPercutor mMartilloPercutor3;

    @BindView(R.id.scroll)          ScrollView scroll;
    @BindView(R.id.resultados)      TextView resultados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        DIManagerTaller.getComponente().inject(this);
        mostrarResultados();
    }

    private void mostrarResultados() {
        incluirResultado(mGrasa1.getDescripcion());
        incluirResultado(mGrasa2.getDescripcion());
        incluirResultado(mGrasa3.getDescripcion());
        incluirResultado(mMartilloPercutor1.getDescripcion());
        incluirResultado(mMartilloPercutor2.getDescripcion());
        incluirResultado(mMartilloPercutor3.getDescripcion());
    }

    private void incluirResultado(String resultado) {
        String nuevoResultado = resultados.getText() + resultado + "\n\n";
        resultados.setText(nuevoResultado);
        scrollHastaElFinal();
    }

    private void scrollHastaElFinal() {
        scroll.post(new Runnable() {
            @Override
            public void run() {
                scroll.fullScroll(ScrollView.FOCUS_DOWN);
            }
        });
    }
}
