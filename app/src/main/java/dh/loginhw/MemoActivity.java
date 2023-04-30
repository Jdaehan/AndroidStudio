package dh.loginhw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.Toast;

public class MemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo);
        Toast.makeText(this, "Sorry. 다양한 시스템은 개발중이니 간단히 메모기능이 있다고 이해부탁드려요!", Toast.LENGTH_LONG).show();

        Button btn4 = findViewById(R.id.button04);

        btn4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = new Intent(MemoActivity. this, MainActivity.class);
                startActivity(intent);
            }
        });
        Button btn5 = findViewById(R.id.button05);

        btn5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent intent = new Intent(MemoActivity. this, MemoResultActivity.class);
                startActivity(intent);
            }
        });


    }
}