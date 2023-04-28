package kr.co.company.myuiapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        editText = findViewById(R.id.edit5);
        textView = findViewById(R.id.text4);

        btn= findViewById(R.id.button2);

        // 인텐트 전달받은 결과 뽑기
        Intent intent = getIntent();
        int num1 = intent.getIntExtra("num1", 0);
        int num2 = intent.getIntExtra("num2", 0);

        textView.setText(" "+num1+"+" +num2+ ":");



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(SubActivity.this, kr.co.company.myuiapp3.MainActivity.class);
                // 덧셈 결과값을 에디트텍스트에 입력한 값을 다시 메인에게 전달한다.
                intent1.putExtra("Result",Integer.parseInt(editText.getText().toString()));
                setResult(RESULT_OK,intent1);
                finish();

            }
        });
    }
}