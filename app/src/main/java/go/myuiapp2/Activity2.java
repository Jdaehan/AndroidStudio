package go.myuiapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        Button btn = findViewById(R.id.button3);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                //닫기 구현
                //finish();
                Intent intent  = new Intent(Activity2.this,MainActivity.class); //  화면 전환
                startActivity(intent);
                //명시적으로 MainActivity로 바꾸기 빈칸채우기★
            }
        });
    }
}