package proyectos.create.practica02;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class mostrarMensaje extends AppCompatActivity {

    TextView txt_de, txt_para, txt_mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mostrar_mensaje);
        recibirDatos();
    }

    private void recibirDatos(){
        Bundle recepcion = getIntent().getExtras();

        String de = recepcion.getString("de");
        String para = recepcion.getString("para");
        String contenido = recepcion.getString("mensaje");
        txt_de = findViewById(R.id.txt_de);
        txt_para = findViewById(R.id.txt_email);
        txt_mensaje = findViewById(R.id.txt_contenido);

        txt_de.setText(de);
        txt_para.setText(para);
        txt_mensaje.setText(contenido);
    }
}
