package go.myuiapp2;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import go.myuiapp2.Activity3;

public class Activity3 extends AppCompatActivity { // 교과서에 없는 추가적인 수업자료
    EditText editText1, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);

        editText1 = findViewById(R.id.editTextTextPersonName);
        editText2 = findViewById(R.id.editTextTextPassword);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Activity3.this, Activity4.class);
                String id = editText1.getText().toString();
                String pwd = editText2.getText().toString();
                editText1.setText("");
                editText2.setText("");

                /////////////////////////////////////
                intent.putExtra("id", id);  // ★ putExtra 심다. "key", value(값. 이게 중요함)
                intent.putExtra("passwd", pwd); // ★
                ///////////////////////////////
                //startActivity(intent);
                startActivityForResult(intent,1);
            }
        });
    }/////////////////////////
    // 결과 받기 ★
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) { //★ requestCode: 상황에 따라 요청할 내용을 구분
        super.onActivityResult(requestCode, resultCode, data);
//        if((requestCode == 1)&&(resultCode == RESULT_OK)){
//
//        }
        if(requestCode == 1) {
            if(resultCode == RESULT_OK){
                String result = data.getStringExtra("RESULT"); // get★String★Extra
                Toast.makeText(getApplicationContext(),result+"",Toast.LENGTH_LONG).show();
            }
        }

    }
}