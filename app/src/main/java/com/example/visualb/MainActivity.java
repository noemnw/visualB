package com.example.visualb;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    Button button ;
    EditText editText1 ,editText2;
    String Username, Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.submit);
        editText1 = (EditText)findViewById(R.id.username);
        editText2 = (EditText) findViewById(R.id.password);

        button.setOnClickListener(login());
    }

    public void login(){
        Username = editText1.getText().toString();
        Password = editText2.getText().toString();

        Toast.makeText("Berhasil Login", Toast.LENGTH_LONG).show();

    }


}
