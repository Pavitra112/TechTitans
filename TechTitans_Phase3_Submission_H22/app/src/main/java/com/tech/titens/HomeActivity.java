package com.tech.titens;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.tech.titens.adapter.PatientAdapter;
import com.tech.titens.databinding.HomeBinding;
import com.tech.titens.model.Patient;
import java.util.HashMap;
public class HomeActivity extends AppCompatActivity {

    private PatientAdapter patientAdapter;
    private HomeBinding binding;
    private Intent intent;
    private Query query;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = HomeBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        getSupportActionBar().setTitle("Team Titans");

//
        query = FirebaseDatabase.getInstance()
                .getReference()
                .child("data")
                .orderByChild("age").startAt(40).endAt(50);
        FirebaseRecyclerOptions<Patient> options =
                new FirebaseRecyclerOptions.Builder<Patient>()
                        .setQuery(query, Patient.class)
                        .build();
        patientAdapter = new PatientAdapter(options);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setAdapter(patientAdapter);


        binding.fabButton.setOnClickListener(v ->{
            Intent filt = new Intent();
            filt.setClass(getApplicationContext(), FilterActivity.class);
            startActivity(filt);
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        patientAdapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        patientAdapter.stopListening();
    }

    private void showMessage(String msg){
        Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
    }
}