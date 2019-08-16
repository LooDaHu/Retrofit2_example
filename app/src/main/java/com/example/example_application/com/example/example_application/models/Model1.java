package com.example.example_application.com.example.example_application.models;

import com.google.gson.annotations.SerializedName;

public class Model1 {

    /**
     * Member variables
     **/
    @SerializedName("model1_id")
    private int model1Id;

    @SerializedName("model1_int")
    private int model1Int;

    @SerializedName("model1_datetime")
    private String model1DateTime;

    @SerializedName("model1_text")
    private String model1Text;

    @SerializedName("model2_id")
    private int model2Id;

    public class Model1Int{
        public Model1Int(int newModel1Int){
            this.model1Int = newModel1Int;
        }
        public int getModel1Int() {
            return model1Int;
        }

        public void setModel1Int(int model1Int) {
            this.model1Int = model1Int;
        }

        @SerializedName("model1_int")
        private int model1Int;
    }


    @Override
    public String toString() {
        return "\n{ " + "\n\t" + "model1_id:" + model1Id + "," + "\n\t"
                + "model1_int:" + model1Int + "," + "\n\t"
                + "model1_datetime:" + model1DateTime + "," + "\n\t"
                + "model1_text:" + model1Text + "," + "\n\t"
                + "model1_id:" + model2Id + "," + '\n'+"}\n";
    }


    /**
     * Getters and Setters below
     **/
    public int getModel1Id() {
        return model1Id;
    }

    public void setModel1Id(int model1Id) {
        this.model1Id = model1Id;
    }

    public int getModel1Int() {
        return model1Int;
    }

    public void setModel1Int(int model1Int) {
        this.model1Int = model1Int;
    }

    public String getModel1DateTime() {
        return model1DateTime;
    }

    public void setModel1DateTime(String model1DateTime) {
        this.model1DateTime = model1DateTime;
    }

    public String getModel1Text() {
        return model1Text;
    }

    public void setModel1Text(String model1Text) {
        this.model1Text = model1Text;
    }

    public int getModel2Id() {
        return model2Id;
    }

    public void setModel2Id(int model2Id) {
        this.model2Id = model2Id;
    }


}

