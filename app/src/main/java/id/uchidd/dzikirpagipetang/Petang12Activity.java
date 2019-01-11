package id.uchidd.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class Petang12Activity extends AppCompatActivity {

    private CardView cvHitungPetang12;
    private TextView tvHitungPetang12;
    private int angkaHitungPetang12 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petang12);

        cvHitungPetang12 = (CardView)findViewById(R.id.cvHitungPetang12);
        tvHitungPetang12 = (TextView)findViewById(R.id.tvHitungPetang12);


        cvHitungPetang12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                angkaHitungPetang12++;
                tvHitungPetang12.setText(angkaHitungPetang12 + "x");
                if (angkaHitungPetang12 == 4){
                    tvHitungPetang12.setText("Selesai");
                    cvHitungPetang12.setVisibility(View.GONE);
                }

            }
        });

    }

    public void goToPetang11(View view) {

        startActivity(new Intent(Petang12Activity.this, Petang11Activity.class));
        finish();

    }

    public void goToBeranda(View view) {

        startActivity(new Intent(Petang12Activity.this, MainActivity.class));
        finish();

    }

    public void goToPetang13(View view) {

        startActivity(new Intent(Petang12Activity.this, Petang13Activity.class));
        finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(this, Petang11Activity.class));
        finish();

    }
}
