package com.tech.titens.adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.tech.titens.R;
import com.tech.titens.model.Patient; // Use the correct Patient model import

public class PatientAdapter extends FirebaseRecyclerAdapter<Patient, PatientAdapter.PatientViewHolder> {

    public PatientAdapter(@NonNull FirebaseRecyclerOptions<Patient> options) {
        super(options);
    }

    @NonNull
    @Override
    public PatientViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_patient, parent, false);
        return new PatientViewHolder(view);
    }

    @Override
    protected void onBindViewHolder(@NonNull PatientViewHolder holder, int position, @NonNull Patient model) {
        holder.bind(model);
    }

    public static class PatientViewHolder extends RecyclerView.ViewHolder {
        // Add other TextViews for different attributes
        private TextView ageTextView;
        private TextView genderTextView;
        private TextView chestPainTextView;
        private TextView bloodPressureTextView;
        private TextView cholesterolTextView;
        private TextView heartRateTextView;
        private TextView exerciseAnginaTextView;
        private TextView plasmaGlucoseTextView;
        private TextView skinnThicknessTextView;
        private TextView insulineTextView;
        private TextView bmiTextView;
        private TextView diabetesTextView;
        private TextView hypertentionTextView;
        private TextView heartdiseaseTextView;
        private TextView residenceTypeTextView;
        private TextView smokingStatusTextView;
        private TextView triageTextView;

        private TextView id;
        public PatientViewHolder(View itemView) {
            super(itemView);
            ageTextView = itemView.findViewById(R.id.age);
            genderTextView = itemView.findViewById(R.id.gender);
            chestPainTextView = itemView.findViewById(R.id.chestPain);
            bloodPressureTextView = itemView.findViewById(R.id.bloodPressure);
            cholesterolTextView = itemView.findViewById(R.id.cholesterol);
            heartRateTextView = itemView.findViewById(R.id.heartRate);
            exerciseAnginaTextView = itemView.findViewById(R.id.exerciseAngina);
            plasmaGlucoseTextView = itemView.findViewById(R.id.plasamGlucose);
            skinnThicknessTextView = itemView.findViewById(R.id.skinThickness);
            insulineTextView = itemView.findViewById(R.id.insulin);
            bmiTextView = itemView.findViewById(R.id.bmi);
            diabetesTextView = itemView.findViewById(R.id.diabetes);
            hypertentionTextView = itemView.findViewById(R.id.hypertention);
            heartdiseaseTextView = itemView.findViewById(R.id.heartDisease);
            residenceTypeTextView = itemView.findViewById(R.id.residenceType);
            smokingStatusTextView = itemView.findViewById(R.id.smokingStatus);
            triageTextView = itemView.findViewById(R.id.textview18);
            id = itemView.findViewById(R.id.id);
            // Initialize other TextViews for different attributes
        }

        public void bind(Patient patient) {
            try{
                id.setText("Id : patient_".concat(String.valueOf(patient.getId())));
            } catch (Exception e){

            }
            try {
                ageTextView.setText("Age : ".concat(String.valueOf(patient.getAge())));
            } catch (Exception e) {
            }
            try {
                genderTextView.setText("Gender : " + String.valueOf(patient.getGender()));
            } catch (Exception e) {
            }
            try {
                chestPainTextView.setText("Chest Pain : " + String.valueOf(patient.getChest_pain()));
            } catch (
                    Exception e) {
            }
            try {
                bloodPressureTextView.setText("Blood Presure : " + String.valueOf(patient.getBlood_pressure()));
            } catch (
                    Exception e) {
            }
            try {
                cholesterolTextView.setText("Cholesterol : " + String.valueOf(patient.getCholesterol()));
            } catch (
                    Exception e) {
            }
            try {
                heartRateTextView.setText("Heart Rate : " + String.valueOf(patient.getHeart_rate()));
            } catch (
                    Exception e) {
            }
            try {
                exerciseAnginaTextView.setText("Exercise : " + String.valueOf(patient.getExercise_angina()));
            } catch (Exception e) {
            }
            try {
                plasmaGlucoseTextView.setText("Plasma Glucose" + String.valueOf(patient.getPlasma_glucose()));
            } catch (Exception e) {
            }
            try {
                skinnThicknessTextView.setText("Skint Thikness : " + String.valueOf(patient.getSkin_thickness()));
            } catch (Exception e) {
            }
            try {
                insulineTextView.setText("Insuline : " + String.valueOf(patient.getInsulin()));
            } catch (Exception e) {
            }
            try {
                bmiTextView.setText("Bmi :" + String.valueOf(patient.getBmi()));
            } catch (
                    Exception e) {
            }
            try {
                diabetesTextView.setText("Diabetes : " + String.valueOf(patient.getDiabetes_pedigree()));
            } catch (
                    Exception e) {
            }
            try {
                hypertentionTextView.setText("Hypertention : " + String.valueOf(patient.getHypertension()));
            } catch (Exception e) {
            }
            try {
                heartdiseaseTextView.setText("Heart Disease : " + String.valueOf(patient.getHeart_disease()));
            } catch (Exception e) {
            }
            try {
                residenceTypeTextView.setText("Residence Type : " + String.valueOf(patient.getResidence_type()));
            } catch (Exception e) {
            }
            try {
                smokingStatusTextView.setText("Smoking Status : " + String.valueOf(patient.getSmoking_status()));
            } catch (Exception e) {
            }
            try {
                triageTextView.setText("TriageView : " + String.valueOf(patient.getTriage()));
            } catch (
                    Exception e) {

            }
        }
    }
}
