package dh.loginhw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.annotation.Nullable;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.content.Intent;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    EditText editText1, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "대전대 로그인 초기화면 입니다.", Toast.LENGTH_SHORT).show();
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        imageView = (ImageView) findViewById(R.id.imageView);

        Button btn1 = findViewById(R.id.button01);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, loginActivity.class);
                String num = editText1.getText().toString();
                String name = editText2.getText().toString();
                editText1.setText("");
                editText2.setText("");
                intent.putExtra("num", num);
                intent.putExtra("name", name);
                startActivityForResult(intent, 1);
            }
        });
    }
    @Override
            protected void onActivityResult(int requestCode, int reultCode, @Nullable Intent data){
        int resultCode = 0;
        requestCode:
            super.onActivityResult(requestCode, resultCode, data);
            if((requestCode == 1) &&(resultCode == RESULT_OK)){

            }
            if(requestCode==1){
                if(resultCode==RESULT_OK){
                    String result = data.getStringExtra("RESULT");
                    Toast.makeText(getApplicationContext(),result+"",Toast.LENGTH_SHORT).show();
                }
            }


        Button btn3 = findViewById(R.id.button02);
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, MemoActivity .class);
                startActivity(intent);
            }

        });
    }
    public void onCheckboxClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        switch(view.getId()){
            case R.id.checkBox2:
                if (checked)imageView.setImageResource(R.drawable.jdulogo);
                else imageView.setImageResource(0);
                break;
        }
    }
}