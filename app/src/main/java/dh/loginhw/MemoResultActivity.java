package dh.loginhw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class MemoResultActivity extends AppCompatActivity {
    private RatingBar ratingBar;
    private Button button;
    private TextView TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo_result);
        Button btn4 = findViewById(R.id.button06);

        btn4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = new Intent(MemoResultActivity.this, MemoActivity.class);
                startActivity(intent);
            }
        });
        Button btn5 = findViewById(R.id.button07);
        btn5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = new Intent(MemoResultActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ratingBar = findViewById(R.id.ratingBar);
        button = findViewById(R.id.button09);
        TextView = findViewById(R.id.textView2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float rating = ratingBar.getRating();
                 TextView.setText(String.valueOf(rating)+"점..!!    감사합니다!");


            }
        });
    }
}