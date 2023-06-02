package my.day13_20191450;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "test2.db";
    private static final int DATABASE_VERSION = 2;

    public DBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        // 테이블 생성
        sqLiteDatabase.execSQL("create table contact ( _id integer PRIMARY KEY AUTOINCREMENT , " +
                "name TEXT, tel TEXT)");

   for (int i = 0; i < 10; i++) {
        sqLiteDatabase.execSQL("INSERT INTO contact VALUES (null, " + "'김철수 " + i
                + "'" + ", '010-1234-100" + i + "');");
    }
}
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS contacts");
        onCreate(db);
    }
}

