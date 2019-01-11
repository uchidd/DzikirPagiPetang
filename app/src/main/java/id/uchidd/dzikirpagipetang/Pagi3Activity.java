package id.uchidd.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class Pagi3Activity extends AppCompatActivity {

    private CardView cvHitungPagi3;
    private TextView tvHitungPagi3;
    private int angkaHitungPagi3 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagi3);

        cvHitungPagi3 = (CardView)findViewById(R.id.cvHitungPagi3);
        tvHitungPagi3 = (TextView)findViewById(R.id.tvHitungPagi3);

        cvHitungPagi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                angkaHitungPagi3++;
                tvHitungPagi3.setText(angkaHitungPagi3 + "x");
                if (angkaHitungPagi3 == 4){
                    tvHitungPagi3.setText("Selesai");
                    cvHitungPagi3.setVisibility(View.GONE);
                }

            }
        });

    }

    public void goToPagi2(View view) {

        startActivity(new Intent(Pagi3Activity.this, Pagi2Activity.class));
        finish();

    }
    public void goToBeranda(View view) {

        startActivity(new Intent(Pagi3Activity.this, MainActivity.class));
        finish();

    }
    public void goToPagi4(View view) {

        startActivity(new Intent(Pagi3Activity.this, Pagi4Activity.class));
        finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(this, Pagi2Activity.class));
        finish();

    }
}
