package proyectos.create.practica02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_ecuacion, btn_implicito, btn_explicito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_ecuacion = findViewById(R.id.btn_ecuacion);
        btn_explicito = findViewById(R.id.btn_explicito);
        btn_implicito = findViewById(R.id.btn_implicito);

        btn_ecuacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pantallaEcuacion();
            }
        });

        btn_explicito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviarMensaje();
            }
        });

        btn_implicito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_implicito = new Intent(Intent.ACTION_VIEW);
                intent_implicito.setData(Uri.parse("https://www.youtube.com"));
                startActivity(intent_implicito);
            }
        });
    }

    public void pantallaEcuacion(){
        Intent intent_ecuacion = new Intent(MainActivity.this, operacionSegunda.class);
        startActivity(intent_ecuacion);
    }

    public void enviarMensaje(){
        Intent intent_ecuacion = new Intent(MainActivity.this, enviarMensaje.class);
        startActivity(intent_ecuacion);
    }
}