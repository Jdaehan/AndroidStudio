package go.myuiapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);

        Button btn1 = findViewById(R.id.button2); // 여기서 부터 타이핑

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) { // xml의 onclick 이랑 같은 속성
                Intent intent = new Intent(Activity1.this, Activity2.class);
                startActivity(intent);
            }
        });
    }
}