package com.example.sqlitetask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;

public class UpdateActivity extends AppCompatActivity {

    EditText title_input, author_input, isbn_input, description_input;
    Button update_button, delete_button;

    String id, title, author, pages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);


        title_input = findViewById(R.id.book_title2);
        author_input = findViewById(R.id.book_author2);
        isbn_input = findViewById(R.id.book_isbn2);
        descriptioin_input = findViewById(R.id.book_description2);
        update_button = findViewById(R.id.update_btn2);
        //delete_button = findViewById(R.id.delete_button);

    }
}