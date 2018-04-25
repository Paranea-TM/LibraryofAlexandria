package com.monash.a2.libraryofalexandria;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextTitle;
    private EditText editTextISBN;
    private EditText editTextAuthor;
    private EditText editTextPublisher;
    private EditText editTextEdition;
    private EditText editTextYear;
    private EditText editTextGenre;
    private EditText editTextDesc;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        editTextTitle = (EditText) findViewById(R.id.editTextTitle);
        editTextISBN = (EditText) findViewById(R.id.editTextISBN);
        editTextAuthor = (EditText) findViewById(R.id.editTextAuthor);
        editTextPublisher = (EditText) findViewById(R.id.editTextPublisher);
        editTextEdition = (EditText) findViewById(R.id.editTextEdition);
        editTextYear = (EditText) findViewById(R.id.editTextYear);
        editTextGenre = (EditText) findViewById(R.id.editTextGenre);
        editTextDesc = (EditText) findViewById(R.id.editTextDesc);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = editTextTitle.getText().toString();
                String isbn = editTextISBN.getText().toString();
                String author = editTextAuthor.getText().toString();
                String publisher = editTextPublisher.getText().toString();
                int edition = new Integer(editTextEdition.getText().toString());
                int year = new Integer(editTextYear.getText().toString());
                String genre = editTextGenre.getText().toString();
                String desc = editTextDesc.getText().toString();

                Book book = new Book(title,isbn,author,publisher,edition,year,genre,desc);
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("ADD A BOOK");
                builder.setMessage(book.showDetail());
                builder.setPositiveButton("Ok", null);
                builder.show();
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
