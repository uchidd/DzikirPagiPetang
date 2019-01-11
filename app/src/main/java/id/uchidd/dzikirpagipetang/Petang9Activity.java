package id.uchidd.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class Petang9Activity extends AppCompatActivity {

    private CardView cvHitungPetang9;
    private TextView tvHitungPetang9;
    private int angkaHitungPetang9 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petang9);

        cvHitungPetang9 = (CardView)findViewById(R.id.cvHitungPetang9);
        tvHitungPetang9 = (TextView)findViewById(R.id.tvHitungPetang9);


        cvHitungPetang9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                angkaHitungPetang9++;
                tvHitungPetang9.setText(angkaHitungPetang9 + "x");
                if (angkaHitungPetang9 == 4){
                    tvHitungPetang9.setText("Selesai");
                    cvHitungPetang9.setVisibility(View.GONE);
                }

            }
        });

    }

    public void goToPetang8(View view) {

        startActivity(new Intent(Petang9Activity.this, Petang8Activity.class));
        finish();

    }

    public void goToBeranda(View view) {

        startActivity(new Intent(Petang9Activity.this, MainActivity.class));
        finish();

    }

    public void goToPetang10(View view) {

        startActivity(new Intent(Petang9Activity.this, Petang10Activity.class));
        finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(this, Petang8Activity.class));
        finish();

    }
}
