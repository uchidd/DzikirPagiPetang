package id.uchidd.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class Pagi17Activity extends AppCompatActivity {

    private CardView cvHitungPagi17;
    private TextView tvHitungPagi17;
    private int angkaHitungPagi17 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagi17);

        cvHitungPagi17 = (CardView)findViewById(R.id.cvHitungPagi17);
        tvHitungPagi17 = (TextView)findViewById(R.id.tvHitungPagi17);


        cvHitungPagi17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                angkaHitungPagi17++;
                tvHitungPagi17.setText(angkaHitungPagi17 + "x");
                if (angkaHitungPagi17 == 4){
                    tvHitungPagi17.setText("Selesai");
                    cvHitungPagi17.setVisibility(View.GONE);
                }

            }
        });

    }

    public void goToPagi16(View view) {

        startActivity(new Intent(Pagi17Activity.this, Pagi16Activity.class));
        finish();

    }
    public void goToBeranda(View view) {

        startActivity(new Intent(Pagi17Activity.this, MainActivity.class));
        finish();

    }
    public void goToPagi18(View view) {

        startActivity(new Intent(Pagi17Activity.this, Pagi18Activity.class));
        finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(this, Pagi16Activity.class));
        finish();

    }
}
