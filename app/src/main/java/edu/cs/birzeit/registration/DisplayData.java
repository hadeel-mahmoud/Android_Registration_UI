package edu.cs.birzeit.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayData extends AppCompatActivity {
    TextView FullName;
    TextView Email;
    TextView Username;
    TextView Country;
    TextView Gender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_data);
        FullName = (TextView)findViewById(R.id.full_name_display);
        Email = (TextView)findViewById(R.id.email_display);
        Username = (TextView)findViewById(R.id.username_display);
        Country = (TextView)findViewById(R.id.country_display);
        Gender = (TextView)findViewById(R.id.gender_display);





        Intent intent = getIntent();

        String FN =  intent.getStringExtra("full_name");
        String UM =  intent.getStringExtra("username");
        String email =  intent.getStringExtra("email");
        String country =  intent.getStringExtra("country");
        String gender =  intent.getStringExtra("gender");

        FullName.setText(FN);
        Email.setText(email);
        Username.setText(UM);
        Country.setText(country);
        Gender.setText(gender);


//        Gender.setText(intent.getStringExtra("Gender"));
//
//        Country.setText(intent.getStringExtra("country"));


        System.out.println( intent.getStringExtra("full_name"));
        System.out.println( intent.getStringExtra("username"));
        System.out.println( intent.getStringExtra("Gender"));
        System.out.println( intent.getStringExtra("country"));






    }
}