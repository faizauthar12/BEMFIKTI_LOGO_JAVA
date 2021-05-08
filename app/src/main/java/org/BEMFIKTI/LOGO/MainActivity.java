package org.BEMFIKTI.LOGO;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // Membuat variable widget.
    private Button btnAdd;
    private Button btnSubstract;
    private Button btnClear;
    private TextView tvResult;

    // membuat nilai default untuk tvResult
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // menghubungkan variable kepada widget yang berada di layout.
        btnAdd = findViewById(R.id.btnAdd);
        btnSubstract = findViewById(R.id.btnSubstract);
        btnClear = findViewById(R.id.btnClear);
        tvResult = findViewById(R.id.tvResult);

        // membuat aksi ketika tombol ditekan
        btnAdd.setOnClickListener(this);
        btnSubstract.setOnClickListener(this);
        btnClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnAdd:
                // Tambah nilai result.
                count++;
                tvResult.setText(Integer.toString(count));
                break;
            case R.id.btnSubstract:
                // kurangi nilai result.
                count--;
                tvResult.setText(Integer.toString(count));
                break;
            case R.id.btnClear:
                // ubah nilai result menjadi 0.
                count = 0;
                tvResult.setText(Integer.toString(count));
        }
    }
}