package com.tech.titens.model;

public class Patient {
    private int id;
    private int age;
    private int gender;
    private int chest_pain;
    private int blood_pressure;
    private int cholesterol;
    private int heart_rate;
    private int exercise_angina;
    private int plasma_glucose;
    private int skin_thickness;
    private int insulin;
    private int bmi;
    private double diabetes_pedigree;
    private int hypertension;
    private int heart_disease;
    private String residence_type;
    private String smoking_status;
    private String triage;

    // Empty constructor (required for Firebase)
    public Patient() {
    }

    public Patient(int id, int age, int gender, int chest_pain, int blood_pressure, int cholesterol,
                   int heart_rate, int exercise_angina, int plasma_glucose, int skin_thickness, int insulin,
                   int bmi, double diabetes_pedigree, int hypertension, int heart_disease,
                   String residence_type, String smoking_status, String triage) {
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.chest_pain = chest_pain;
        this.blood_pressure = blood_pressure;
        this.cholesterol = cholesterol;
        this.heart_rate = heart_rate;
        this.exercise_angina = exercise_angina;
        this.plasma_glucose = plasma_glucose;
        this.skin_thickness = skin_thickness;
        this.insulin = insulin;
        this.bmi = bmi;
        this.diabetes_pedigree = diabetes_pedigree;
        this.hypertension = hypertension;
        this.heart_disease = heart_disease;
        this.residence_type = residence_type;
        this.smoking_status = smoking_status;
        this.triage = triage;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getChest_pain() {
        return chest_pain;
    }

    public void setChest_pain(int chest_pain) {
        this.chest_pain = chest_pain;
    }

    public int getBlood_pressure() {
        return blood_pressure;
    }

    public void setBlood_pressure(int blood_pressure) {
        this.blood_pressure = blood_pressure;
    }

    public int getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(int cholesterol) {
        this.cholesterol = cholesterol;
    }

    public int getHeart_rate() {
        return heart_rate;
    }

    public void setHeart_rate(int heart_rate) {
        this.heart_rate = heart_rate;
    }

    public int getExercise_angina() {
        return exercise_angina;
    }

    public void setExercise_angina(int exercise_angina) {
        this.exercise_angina = exercise_angina;
    }

    public int getPlasma_glucose() {
        return plasma_glucose;
    }

    public void setPlasma_glucose(int plasma_glucose) {
        this.plasma_glucose = plasma_glucose;
    }

    public int getSkin_thickness() {
        return skin_thickness;
    }

    public void setSkin_thickness(int skin_thickness) {
        this.skin_thickness = skin_thickness;
    }

    public int getInsulin() {
        return insulin;
    }

    public void setInsulin(int insulin) {
        this.insulin = insulin;
    }

    public int getBmi() {
        return bmi;
    }

    public void setBmi(int bmi) {
        this.bmi = bmi;
    }

    public double getDiabetes_pedigree() {
        return diabetes_pedigree;
    }

    public void setDiabetes_pedigree(double diabetes_pedigree) {
        this.diabetes_pedigree = diabetes_pedigree;
    }

    public int getHypertension() {
        return hypertension;
    }

    public void setHypertension(int hypertension) {
        this.hypertension = hypertension;
    }

    public int getHeart_disease() {
        return heart_disease;
    }

    public void setHeart_disease(int heart_disease) {
        this.heart_disease = heart_disease;
    }

    public String getResidence_type() {
        return residence_type;
    }

    public void setResidence_type(String residence_type) {
        this.residence_type = residence_type;
    }

    public String getSmoking_status() {
        return smoking_status;
    }

    public void setSmoking_status(String smoking_status) {
        this.smoking_status = smoking_status;
    }

    public String getTriage() {
        return triage;
    }

    public void setTriage(String triage) {
        this.triage = triage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}