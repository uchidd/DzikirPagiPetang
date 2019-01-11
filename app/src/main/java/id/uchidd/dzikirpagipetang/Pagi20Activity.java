package id.uchidd.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class Pagi20Activity extends AppCompatActivity {

    private CardView cvHitungPagi20;
    private TextView tvHitungPagi20;
    private int angkaHitungPagi20 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagi20);

        cvHitungPagi20 = (CardView)findViewById(R.id.cvHitungPagi20);
        tvHitungPagi20 = (TextView)findViewById(R.id.tvHitungPagi20);


        cvHitungPagi20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                angkaHitungPagi20++;
                tvHitungPagi20.setText(angkaHitungPagi20 + "x");
                if (angkaHitungPagi20 == 101){
                    tvHitungPagi20.setText("Selesai");
                    cvHitungPagi20.setVisibility(View.GONE);
                }

            }
        });

    }
    public void goToPagi19(View view) {

        startActivity(new Intent(Pagi20Activity.this, Pagi19Activity.class));
        finish();

    }
    public void goToBeranda(View view) {

        startActivity(new Intent(Pagi20Activity.this, MainActivity.class));
        finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(this, Pagi19Activity.class));
        finish();

    }
}
