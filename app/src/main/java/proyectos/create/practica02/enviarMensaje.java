package proyectos.create.practica02;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class enviarMensaje extends AppCompatActivity {

    EditText txt_de1, txt_para, txt_content;
    Button btn_enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enviar_mensaje);

        btn_enviar = findViewById(R.id.btn_enviar);
        txt_de1 = findViewById(R.id.txt_de1);
        txt_para = findViewById(R.id.txt_email);
        txt_content = findViewById(R.id.txt_content);

        btn_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviar();
            }
        });
    }

    public void enviar(){
        String de1 = txt_de1.getText().toString();
        String para = txt_para.getText().toString();
        String content = txt_content.getText().toString();

        Intent intent_enviar = new Intent(enviarMensaje.this, mostrarMensaje.class);
        intent_enviar.putExtra("de", de1);
        intent_enviar.putExtra("para",para);
        intent_enviar.putExtra("mensaje",content);
        startActivity(intent_enviar);
    }
}
