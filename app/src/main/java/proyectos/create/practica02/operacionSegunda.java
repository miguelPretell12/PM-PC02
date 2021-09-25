package proyectos.create.practica02;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class operacionSegunda extends AppCompatActivity {
    Button btn_limpiar, btn_operar;
    EditText txt_valor1, txt_valor2, txt_valor3;
    TextView txt_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ecuacion_segundo);
        txt_valor1 = findViewById(R.id.txt_valor1);
        txt_valor2 = findViewById(R.id.txt_valor2);
        txt_valor3 = findViewById(R.id.txt_valor3);
        txt_resultado = findViewById(R.id.txt_resultado);
        btn_limpiar = findViewById(R.id.btn_limpiar);
        btn_operar = findViewById(R.id.btn_determinar);

        btn_limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                limpiar();
            }
        });

        btn_operar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operar();
            }
        });
    }

    public void limpiar(){
        txt_valor1.setText("");
        txt_valor2.setText("");
        txt_valor3.setText("");
    }

    public void operar(){
        double a = Double.parseDouble(txt_valor1.getText().toString());
        double b = Double.parseDouble(txt_valor2.getText().toString());
        double c = Double.parseDouble(txt_valor3.getText().toString());

        double v1 = (-b + (Math.sqrt(Math.pow(b,2)-(4*a*c)))) / 2*a;
        double v2 = (-b - (Math.sqrt(Math.pow(b,2)-(4*a*c)))) / 2*a;

        txt_resultado.append("Resultado del x1 ="+ v1 + "\n");
        txt_resultado.append("Resultado del x2 ="+ v2 + "\n");

    }
}
