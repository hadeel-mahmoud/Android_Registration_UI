package edu.cs.birzeit.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayData extends AppCompatActivity {
    TextView FullName;
    TextView Username;
    TextView Gender;
    TextView Country;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_data);
        FullName = (TextView)findViewById(R.id.full_name);
        Username = (TextView)findViewById(R.id.username);
//        Gender = (TextView)findViewById(R.id.gender);
//        Country = (TextView)findViewById(R.id.country);



        Intent intent = getIntent();

        String FN =  intent.getStringExtra("full_name");
        String UM =  intent.getStringExtra("username");
        FullName.setText(FN);

        Username.setText(UM);

//        Gender.setText(intent.getStringExtra("Gender"));
//
//        Country.setText(intent.getStringExtra("country"));


        System.out.println( intent.getStringExtra("full_name"));
        System.out.println( intent.getStringExtra("username"));
        System.out.println( intent.getStringExtra("Gender"));
        System.out.println( intent.getStringExtra("country"));






    }
}