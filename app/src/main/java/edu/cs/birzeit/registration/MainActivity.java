package edu.cs.birzeit.registration;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Button Finish;
    EditText FullName;
    EditText Username;
    EditText Password;
    RadioButton MaleRB;
    RadioButton FemaleRB;
    Toast toast;
    Spinner spinner;
    String SpinnerValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FullName = (EditText) findViewById(R.id.full_name);
        Username = (EditText) findViewById(R.id.username);
        Password = (EditText) findViewById(R.id.password);
        MaleRB = (RadioButton) findViewById(R.id.rb_male);
        FemaleRB = (RadioButton) findViewById(R.id.rb_female);
        spinner = (Spinner) findViewById(R.id.spinner);
        Finish = (Button) findViewById(R.id.finish);
        toast = new Toast(this);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.countries,
                R.layout.spinner_color_layout);
        adapter.setDropDownViewResource(R.layout.spinner_dropdown_layout);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


        Finish.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Successfully Registered", Toast.LENGTH_SHORT).show();
                if (SpinnerValue.equals("Country")) {
                    SpinnerValue = "";
                }
                Intent displayDataIntent = new Intent(MainActivity.this, DisplayData.class);
                displayDataIntent.putExtra("full_name", FullName.getText().toString());
                displayDataIntent.putExtra("username", Username.getText().toString());
                displayDataIntent.putExtra("password", Password.getText().toString());

                if (MaleRB.isChecked()) {
                    displayDataIntent.putExtra("gender", MaleRB.getText().toString());

                } else if (FemaleRB.isChecked()) {
                    displayDataIntent.putExtra("gender", FemaleRB.getText().toString());
                }

                displayDataIntent.putExtra("country", SpinnerValue);


                startActivity(displayDataIntent);
            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        SpinnerValue = spinner.getSelectedItem().toString();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}