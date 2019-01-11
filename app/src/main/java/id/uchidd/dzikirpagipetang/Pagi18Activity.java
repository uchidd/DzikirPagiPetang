package id.uchidd.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class Pagi18Activity extends AppCompatActivity {

    private CardView cvHitungPagi18;
    private TextView tvHitungPagi18;
    private int angkaHitungPagi18 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagi18);

        cvHitungPagi18 = (CardView)findViewById(R.id.cvHitungPagi18);
        tvHitungPagi18 = (TextView)findViewById(R.id.tvHitungPagi18);


        cvHitungPagi18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                angkaHitungPagi18++;
                tvHitungPagi18.setText(angkaHitungPagi18 + "x");
                if (angkaHitungPagi18 == 4){
                    tvHitungPagi18.setText("Selesai");
                    cvHitungPagi18.setVisibility(View.GONE);
                }

            }
        });

    }
    public void goToPagi17(View view) {

        startActivity(new Intent(Pagi18Activity.this, Pagi17Activity.class));
        finish();

    }
    public void goToBeranda(View view) {

        startActivity(new Intent(Pagi18Activity.this, MainActivity.class));
        finish();

    }
    public void goToPagi19(View view) {

        startActivity(new Intent(Pagi18Activity.this, Pagi19Activity.class));
        finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(this, Pagi17Activity.class));
        finish();

    }
}
