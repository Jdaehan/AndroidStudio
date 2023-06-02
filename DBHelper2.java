package my.day13_20191450;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper2 extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "test2.db";
    private static final int DATABASE_VERSION = 1;

    public DBHelper2(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        // 테이블 생성
        sqLiteDatabase.execSQL("create table member(_id integer PRIMARY KEY AUTOINCREMENT , " +
                "email TEXT, passwd TEXT)");

}
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS member");
        onCreate(sqLiteDatabase);
    }
}

