package com.example.sqlitetask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {

    EditText bookTitleInput, authorInput, isbnInput, descriptionInput;
    Button addBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        bookTitleInput = findViewById(R.id.book_title);
        authorInput = findViewById(R.id.book_author);
        isbnInput = findViewById(R.id.book_isbn);
        descriptionInput = findViewById(R.id.book_description);
        addBtn = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDatabaseHelper myDB = new MyDatabaseHelper(AddActivity.this);
                myDB.addBook(
                        bookTitleInput.getText().toString().trim(),
                        authorInput.getText().toString().trim(),
                        isbnInput.getText().toString().trim(),
                        descriptionInput.getText().toString().trim());
            }
        });


    }
}