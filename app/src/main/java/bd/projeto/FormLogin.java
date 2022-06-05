package bd.projeto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.Normalizer;

public class FormLogin extends AppCompatActivity {

    private TextView text_criar_conta;
    private TextView text_esqueceu_senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        getSupportActionBar().hide();
        IniciarComponentes();
        text_criar_conta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FormLogin.this, TelaCadastro.class);
                startActivity(intent);
            }
        }
        );
        text_esqueceu_senha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FormLogin.this, TelaRecuperarSenha.class);
                startActivity(intent);
            }
        }
        );
    }
    private void IniciarComponentes(){
        text_criar_conta = findViewById(R.id.text_criar_conta);
        text_esqueceu_senha = findViewById(R.id.text_esqueceu_senha);
    }

}