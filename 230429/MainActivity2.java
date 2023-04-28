package kr.co.company.myuiapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity2 extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main2);

        String[] array = {"Apple", "Banana", "Cherry", "Watermelon","Apple", "Banana", "Cherry", "Watermelon",
                "Apple", "Banana", "Cherry", "Watermelon"};

        // 어댑터 생성
        ArrayAdapter<String> adapter = new
                ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,array);
        //리스트 뷰와 어댑터 연결
        setListAdapter(adapter);
    }

    @Override  //우측 마우스키 Generate 클릭
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        String result = (String)getListAdapter().getItem(position);
        Toast.makeText(this,  result+"", Toast.LENGTH_LONG).show();

    }
}
