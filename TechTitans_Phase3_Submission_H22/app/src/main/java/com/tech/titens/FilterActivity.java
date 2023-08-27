package com.tech.titens;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.tech.titens.databinding.FilterBinding;

import java.util.HashMap;
import java.util.concurrent.Exchanger;

public class FilterActivity extends AppCompatActivity {

    private FilterBinding filteroptionBinding;

    private final Intent intent = new Intent();

    @Override
    protected void onCreate(Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        filteroptionBinding = FilterBinding.inflate(getLayoutInflater());
        View view = filteroptionBinding.getRoot();
        setContentView(view);
        initialize(_savedInstanceState);
        initializeLogic();
    }

    private void initialize(Bundle _savedInstanceState) {

        filteroptionBinding.materialbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View _view) {
                try {
                    if (filteroptionBinding.ageMin.getText().toString().isEmpty() && filteroptionBinding.agemax.getText().toString().isEmpty()) {
                        showMsg("Age Field can't be empty");
                    } else if (toDouble(filteroptionBinding.ageMin) > toDouble(filteroptionBinding.agemax)) {
                        showMsg("Min Age can't ne grater then Max ");
                    } else if (filteroptionBinding.chestPainMin.getText().toString().isEmpty() && filteroptionBinding.chestPainMax.getText().toString().isEmpty()) {
                        showMsg("Chest Pain Field can't be empty");
                    } else if (toDouble(filteroptionBinding.chestPainMin) > toDouble(filteroptionBinding.chestPainMax)) {
                        showMsg("Min Chest Pain can't ne grater then Max ");
                    } else if (filteroptionBinding.bloodPressureMin.getText().toString().isEmpty() && filteroptionBinding.bloodPressureMin.getText().toString().isEmpty()) {
                        showMsg("Blood Pressure Field can't be empty");
                    } else if (toDouble(filteroptionBinding.bloodPressureMin) > toDouble(filteroptionBinding.bloodPressureMax)) {
                        showMsg("Min Blood Pressure can't ne grater then Max ");
                    } else if (filteroptionBinding.cholesterolMin.getText().toString().isEmpty() && filteroptionBinding.cholesterolMax.getText().toString().isEmpty()) {
                        showMsg("Cholesterol Field can't be empty");
                    } else if (toDouble(filteroptionBinding.cholesterolMin) > toDouble(filteroptionBinding.cholesterolMax)) {
                        showMsg("Min Cholesterol can't ne grater then Max ");
                    } else if (filteroptionBinding.heartRateMin.getText().toString().isEmpty() && filteroptionBinding.heartRateMax.getText().toString().isEmpty()) {
                        showMsg(" Heart Rate Field can't be empty");
                    } else if (toDouble(filteroptionBinding.heartRateMin) > toDouble(filteroptionBinding.heartRateMax)) {
                        showMsg("Min Heart Rate can't ne grater then Max ");
                    } else if (filteroptionBinding.exerciseAnginaMin.getText().toString().isEmpty() && filteroptionBinding.exerciseAnginaMax.getText().toString().isEmpty()) {
                        showMsg("Exercise Field can't be empty");
                    } else if (toDouble(filteroptionBinding.exerciseAnginaMin) > toDouble(filteroptionBinding.exerciseAnginaMax)) {
                        showMsg("Min Exercise can't ne grater then Max ");
                    } else if (filteroptionBinding.plasamGlucoseMin.getText().toString().isEmpty() && filteroptionBinding.plasmaGlucoseMax.getText().toString().isEmpty()) {
                        showMsg("Plasma Glucose Field can't be empty");
                    } else if (toDouble(filteroptionBinding.plasamGlucoseMin) > toDouble(filteroptionBinding.plasmaGlucoseMax)) {
                        showMsg("Min Plasma Glucose can't ne grater then Max ");
                    } else if (filteroptionBinding.prioritiesMin.getText().toString().isEmpty() && filteroptionBinding.prioritiesMax.getText().toString().isEmpty()) {
                        showMsg("Priorities Field can't be empty");
                    } else if (toDouble(filteroptionBinding.prioritiesMin) > toDouble(filteroptionBinding.prioritiesMax)) {
                        showMsg("Min Priorities can't ne grater then Max ");
                    } else {
                        putData(filteroptionBinding.ageMin, filteroptionBinding.ageMin, "age_data");
                        putData(filteroptionBinding.chestPainMin, filteroptionBinding.chestPainMax, "chestPain_data");
                        putData(filteroptionBinding.bloodPressureMin, filteroptionBinding.bloodPressureMax, "bloodPressure_data");
                        putData(filteroptionBinding.cholesterolMin, filteroptionBinding.cholesterolMax, "cholesterol_data");
                        putData(filteroptionBinding.heartRateMin, filteroptionBinding.heartRateMax, "heartRate_data");
                        putData(filteroptionBinding.exerciseAnginaMin, filteroptionBinding.exerciseAnginaMax, "exerciseAngina_data");
                        putData(filteroptionBinding.plasamGlucoseMin, filteroptionBinding.plasmaGlucoseMax, "plasamGlucose_data");
                        putData(filteroptionBinding.prioritiesMin, filteroptionBinding.prioritiesMax, "priorities_data");
                        intent.putExtra("filter", "true");
                        intent.setClass(getApplicationContext(), HomeActivity.class);
                        startActivity(intent);
                    }
                } catch (Exception e){
                    System.out.println("====================================");
                    System.out.println("====================================");
                    System.out.println("====================================");
                    System.out.println("====================================");
                    System.out.println(e.toString());
                    System.out.println("====================================");
                    System.out.println("====================================");
                    System.out.println("====================================");
                    System.out.println("====================================");
                }
            }
        });
    }

    private double toDouble(EditText editText) {
        return Double.parseDouble(editText.getText().toString());
    }

    private void putData(EditText editText1, EditText editText2, String type){
        intent.putExtra(type + "_max", toDouble(editText2));
        intent.putExtra(type + "_min", toDouble(editText1));
    }
    private void initializeLogic() {
        getSupportActionBar().setTitle("Data Filter");
        cardItem(filteroptionBinding.linear4);
        cardItem(filteroptionBinding.linear5);
        cardItem(filteroptionBinding.linear7);
        cardItem(filteroptionBinding.linear9);
        cardItem(filteroptionBinding.linear11);
        cardItem(filteroptionBinding.linear13);
        cardItem(filteroptionBinding.linear15);
        cardItem(filteroptionBinding.linear19);
    }
    private void showMsg(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    private void cardItem(LinearLayout _layout){
        _layout.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int a, int b, int c, int d) {
                this.setCornerRadius(a);
                this.setStroke(b, c);
                this.setColor(d);
                return this;
            }
        }.getIns((int) 5, (int) 2, 0xFF000000, 0xFFFFFFFF));
    }

}
