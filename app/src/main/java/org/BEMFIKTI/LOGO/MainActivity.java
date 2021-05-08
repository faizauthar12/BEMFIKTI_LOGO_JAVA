package org.BEMFIKTI.LOGO;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Membuat variable widget.
    private Button btnAdd;
    private Button btnSubstract;
    private Button btnClear;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // menghubungkan variable kepada widget yang berada di layout.
        btnAdd = findViewById(R.id.btnAdd);
        btnSubstract = findViewById(R.id.btnSubstract);
        btnClear = findViewById(R.id.btnClear);
        tvResult = findViewById(R.id.tvResult);
    }
}