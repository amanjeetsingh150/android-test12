package testapp.evenprime.org.test1;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
/**
 * Created by dravit on 8/15/2016.
 */
public class DatabaseHandler extends SQLiteOpenHelper{
    private static final int DATABASE_VERSION=1;
    private static final String DATABASE_NAME="c_man";
    private static String TABLE_CONTACT="contacts";
    private static String KEY_ID="id";
    private static String KEY_NAME="name";
    private static String KEY_NUM="num";

    public DatabaseHandler(Context context)
    {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqldb) {
    String CREATE_TABLE="CREATE TABLE"+TABLE_CONTACT+"("+KEY_ID+"   int   PRIMARY KEY,"
            +KEY_NAME+" char(26),"
            +KEY_NUM+"  char(10)" +
            ");";
        sqldb.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqldb, int i, int i1) {

    }
}
