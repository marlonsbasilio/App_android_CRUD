package bd.projeto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TelaPerfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_perfil);

        getSupportActionBar().hide();
    }
}