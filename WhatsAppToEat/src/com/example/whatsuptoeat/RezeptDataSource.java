package com.example.whatsuptoeat;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class RezeptDataSource {

  // Database fields
  private SQLiteDatabase database;
  private MySQLiteHelper dbHelper;
  private String[] allColumns = { MySQLiteHelper.COLUMN_ID,
      MySQLiteHelper.COLUMN_NAME };

  public RezeptDataSource(Context context) {
    dbHelper = new MySQLiteHelper(context);
  }

  public void open() throws SQLException {
    database = dbHelper.getWritableDatabase();
  }

  public void close() {
    dbHelper.close();
  }

  public Rezept createRezept(String rezept) {
    ContentValues values = new ContentValues();
    values.put(MySQLiteHelper.COLUMN_NAME, rezept);
    long insertId = database.insert(MySQLiteHelper.TABLE_REZEPTE, null,
        values);
    Cursor cursor = database.query(MySQLiteHelper.TABLE_REZEPTE,
        allColumns, MySQLiteHelper.COLUMN_ID + " = " + insertId, null,
        null, null, null);
    cursor.moveToFirst();
    Rezept newRezept = cursorToRezept(cursor);
    cursor.close();
    return newRezept;
  }

  public void deleteRezept(Rezept rezept) {
    long id = rezept.getId();
    System.out.println("Comment deleted with id: " + id);
    database.delete(MySQLiteHelper.TABLE_REZEPTE, MySQLiteHelper.COLUMN_ID
        + " = " + id, null);
  }

  public List<Rezept> getAllRezepte() {
    List<Rezept> rezepte = new ArrayList<Rezept>();

    Cursor cursor = database.query(MySQLiteHelper.TABLE_REZEPTE,
        allColumns, null, null, null, null, null);

    cursor.moveToFirst();
    while (!cursor.isAfterLast()) {
      Rezept rezept = cursorToRezept(cursor);
      rezepte.add(rezept);
      cursor.moveToNext();
    }
    // Make sure to close the cursor
    cursor.close();
    return rezepte;
  }

  private Rezept cursorToRezept(Cursor cursor) {
    Rezept rezept = new Rezept();
    rezept.setId(cursor.getLong(0));
    rezept.setName(cursor.getString(1));
    return rezept;
  }
} 
