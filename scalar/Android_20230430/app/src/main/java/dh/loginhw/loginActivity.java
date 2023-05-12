package dh.loginhw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ImageView;

public class loginActivity extends AppCompatActivity {
    TextView textView3, textView4;
    ImageView imageView2;
    Button btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        Toast.makeText(this, "입력한 회원 정보 입니다.", Toast.LENGTH_SHORT).show();

        Intent intent = getIntent();
        String num = intent.getStringExtra("num");
        String name = intent.getStringExtra("name");
        textView3.setText("학번:" + " " + num);
        textView4.setText("이름:" + " " + name);

        Button btn2 = findViewById(R.id.button03);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(loginActivity.this, MainActivity.class);
                intent1.putExtra("RESULT", "성공");
                setResult(RESULT_OK, intent1);
                finish();
            }
        });
    }
    public void onCheckboxClicked (View view){
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.checkBox3:
                if (checked) imageView2.setImageResource(R.drawable.symbol);
                else imageView2.setImageResource(0);
                break;
        }
    }
}