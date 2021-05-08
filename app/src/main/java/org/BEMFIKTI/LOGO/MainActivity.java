package org.BEMFIKTI.LOGO;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // Membuat variable widget.
    private Button btnAdd;
    private Button btnSubstract;
    private Button btnClear;
    private Button btnIntent;
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
        btnIntent = findViewById(R.id.btnIntent);
        tvResult = findViewById(R.id.tvResult);

        // membuat aksi ketika tombol ditekan
        btnAdd.setOnClickListener(this);
        btnSubstract.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnIntent.setOnClickListener(this);

        if (savedInstanceState != null) {
            count = savedInstanceState.getInt("result");
            tvResult.setText(Integer.toString(count));
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("result", count);
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
                break;
            case R.id.btnIntent:
                Intent intent = new Intent(MainActivity.this, IntentActivity.class);
                startActivity(intent);
                break;
        }
    }
}