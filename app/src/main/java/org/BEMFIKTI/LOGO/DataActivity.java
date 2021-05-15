package org.BEMFIKTI.LOGO;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {

    // buat variable untuk menerima data.
    public static final String EXTRA_COUNT = "extra_count";

    // Membuat variable widget.
    private TextView tvCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        // menghubungkan variable kepada widget yang berada di layout.
        tvCount = findViewById(R.id.tvCount);

        // masukkan nilai yang dikirim ke suatu variable
        String count = getIntent().getStringExtra(EXTRA_COUNT);

        // setText tvCount.
        String text = "Jumlah angka pada Main Activity : " + count;
        tvCount.setText(text);

        // panggil actionbar
        ActionBar actionBar = getSupportActionBar();

        // munculin tombol back
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    // buat logika ketika tombol back pada action bar ditekan.
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}