package id.uchidd.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class Petang5Activity extends AppCompatActivity {

    private CardView cvHitungPetang5;
    private TextView tvHitungPetang5;
    private int angkaHitungPetang5 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petang5);

        cvHitungPetang5 = (CardView)findViewById(R.id.cvHitungPetang5);
        tvHitungPetang5 = (TextView)findViewById(R.id.tvHitungPetang5);


        cvHitungPetang5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                angkaHitungPetang5++;
                tvHitungPetang5.setText(angkaHitungPetang5 + "x");
                if (angkaHitungPetang5 == 4){
                    tvHitungPetang5.setText("Selesai");
                    cvHitungPetang5.setVisibility(View.GONE);
                }

            }
        });

    }
    public void goToPetang4(View view) {

        startActivity(new Intent(Petang5Activity.this, Petang4Activity.class));
        finish();

    }

    public void goToBeranda(View view) {

        startActivity(new Intent(Petang5Activity.this, MainActivity.class));
        finish();

    }

    public void goToPetang6(View view) {

        startActivity(new Intent(Petang5Activity.this, Petang6Activity.class));
        finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(this, Petang4Activity.class));
        finish();

    }

}
