package id.uchidd.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class Petang17Activity extends AppCompatActivity {

    private CardView cvHitungPetang17;
    private TextView tvHitungPetang17;
    private int angkaHitungPetang17 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petang17);

        cvHitungPetang17 = (CardView)findViewById(R.id.cvHitungPetang17);
        tvHitungPetang17 = (TextView)findViewById(R.id.tvHitungPetang17);


        cvHitungPetang17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                angkaHitungPetang17++;
                tvHitungPetang17.setText(angkaHitungPetang17 + "x");
                if (angkaHitungPetang17 == 101){
                    tvHitungPetang17.setText("Selesai");
                    cvHitungPetang17.setVisibility(View.GONE);
                }

            }
        });

    }

    public void goToPetang16(View view) {

        startActivity(new Intent(Petang17Activity.this, Petang16Activity.class));
        finish();

    }

    public void goToBeranda(View view) {

        startActivity(new Intent(Petang17Activity.this, MainActivity.class));
        finish();

    }

    public void goToPetang18(View view) {

        startActivity(new Intent(Petang17Activity.this, Petang18Activity.class));
        finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(this, Petang16Activity.class));
        finish();

    }
}
