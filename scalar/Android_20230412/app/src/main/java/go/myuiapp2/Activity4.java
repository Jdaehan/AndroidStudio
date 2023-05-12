package go.myuiapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {

    TextView textView, textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity4);

        textView = findViewById(R.id.textView2);
        textView2 = findViewById(R.id.textView3);

        ///////////////////////////////////////
        Intent intent = getIntent();

        String id = intent.getStringExtra("id");   // ★ getStringExtra 중요함. id는 key
        String pwd = intent.getStringExtra("passwd"); // ★ 빈칸 채우기 나옴 passwd 는 key

        textView.setText(id+"");
        textView2.setText(pwd+"");
        Button button =  findViewById(R.id.btn_back);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //finish();
                Intent intent1 = new Intent(Activity4.this, Activity3.class); // 화면 전환
                intent1.putExtra("RESULT","로그인성공");
                setResult(RESULT_OK, intent1);
                finish();
            }
        });
    }
}