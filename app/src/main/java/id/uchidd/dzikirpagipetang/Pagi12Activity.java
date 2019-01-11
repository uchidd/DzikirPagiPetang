package id.uchidd.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class Pagi12Activity extends AppCompatActivity {

    private CardView cvHitungPagi12;
    private TextView tvHitungPagi12;
    private int angkaHitungPagi12 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagi12);

        cvHitungPagi12 = (CardView)findViewById(R.id.cvHitungPagi12);
        tvHitungPagi12 = (TextView)findViewById(R.id.tvHitungPagi12);


        cvHitungPagi12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                angkaHitungPagi12++;
                tvHitungPagi12.setText(angkaHitungPagi12 + "x");
                if (angkaHitungPagi12 == 4){
                    tvHitungPagi12.setText("Selesai");
                    cvHitungPagi12.setVisibility(View.GONE);
                }

            }
        });

    }
    public void goToPagi11(View view) {

        startActivity(new Intent(Pagi12Activity.this, Pagi11Activity.class));
        finish();

    }
    public void goToBeranda(View view) {

        startActivity(new Intent(Pagi12Activity.this, MainActivity.class));
        finish();

    }
    public void goToPagi13(View view) {

        startActivity(new Intent(Pagi12Activity.this, Pagi13Activity.class));
        finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(this, Pagi11Activity.class));
        finish();

    }
}
