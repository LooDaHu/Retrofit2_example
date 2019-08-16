package com.example.example_application.com.example.example_application.models;

import com.google.gson.annotations.SerializedName;

public class ResponseBody<T> {

    @SerializedName("model1_id")
    private int model1Id;

    public T requestBody;

    public int getModel1Id() {
        return model1Id;
    }

    public void setModel1Id(int model1Id) {
        this.model1Id = model1Id;
    }

    @Override
    public String toString() {
        return "{" + "\n\t" + "model1_id:" + model1Id + "\n" + "}";
    }

    public class DeleteResponse {
        @Override
        public String toString() {
            return "{}";
        }
    }
}
