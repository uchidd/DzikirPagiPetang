package id.uchidd.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class Petang19Activity extends AppCompatActivity {

    private CardView cvHitungPetang19;
    private TextView tvHitungPetang19;
    private int angkaHitungPetang19 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petang19);

        cvHitungPetang19 = (CardView)findViewById(R.id.cvHitungPetang19);
        tvHitungPetang19 = (TextView)findViewById(R.id.tvHitungPetang19);


        cvHitungPetang19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                angkaHitungPetang19++;
                tvHitungPetang19.setText(angkaHitungPetang19 + "x");
                if (angkaHitungPetang19 == 4){
                    tvHitungPetang19.setText("Selesai");
                    cvHitungPetang19.setVisibility(View.GONE);
                }

            }
        });

    }

    public void goToPetang18(View view) {

        startActivity(new Intent(Petang19Activity.this, Petang18Activity.class));
        finish();

    }

    public void goToBeranda(View view) {

        startActivity(new Intent(Petang19Activity.this, MainActivity.class));
        finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(this, Petang18Activity.class));
        finish();

    }
}
