/**
 *
 */
package jp.ac.asojuku.jousen.FirstClass;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * @author student
 *
 */
public class DBManager extends SQLiteOpenHelper {

	public DBManager(Context context) {
		super(context, "FirstClass.sqlite3", null, 1);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	/* (非 Javadoc)
	 * @see android.database.sqlite.SQLiteOpenHelper#onCreate(android.database.sqlite.SQLiteDatabase)
	 */
	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO 自動生成されたメソッド・スタブ

		String sql1="CREATE TABLE member(mem_num text PRIMARY KEY,mem_name text,mail text,pass text,sex text)";
		String sql2="CREATE TABLE con(con_num text PRIMARY KEY,mem_num text,title text,des text,pic_pass text)";
		String sql3="CREATE TABLE con_his(mem_num text PRIMARY KEY ,con_num text)";
		String sql4="CREATE TABLE favorite(mem_num text PRIMARY KEY , fav_mem text)";
		String sql5="CREATE TABLE con_det(con_num text PRIMARY KEY , com_mem text,comment text)";

		db.execSQL(sql1);
		db.execSQL(sql2);
		db.execSQL(sql3);
		db.execSQL(sql4);
		db.execSQL(sql5);
	}

	/* (非 Javadoc)
	 * @see android.database.sqlite.SQLiteOpenHelper#onUpgrade(android.database.sqlite.SQLiteDatabase, int, int)
	 */
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO 自動生成されたメソッド・スタブ
			db.execSQL("DROP TABLE member");
			db.execSQL("DROP TABLE con");
			db.execSQL("DROP TABLE con_his");
			db.execSQL("DROP TABLE favorite");
			db.execSQL("DROP TABLE con_dat");

			onCreate(db);
	}

}
