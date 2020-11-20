package th.ac.su.cp.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;

public class Info extends AppCompatActivity {
    public RadioButton male,female;
    public EditText height,weight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        male = findViewById(R.id.male_but);
        female = findViewById(R.id.female_but);
        ///สลับปุ่ม
            if(male.isChecked()){
            female.setChecked(true);
        }else if(female.isChecked()){
            male.setChecked(true);
        }
        ///////

            height = (EditText)findViewById(R.id.hi_but);
            weight = (EditText) findViewById(R.id.we_but);
        double wei = Double.parseDouble(weight.getText().toString());
        double hi = Double.parseDouble(height.getText().toString());
            double bmi,h;
            h = hi/100;
            bmi = wei/h*h;
    }
}