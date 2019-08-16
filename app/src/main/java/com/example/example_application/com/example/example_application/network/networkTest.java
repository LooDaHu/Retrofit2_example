package com.example.example_application.com.example.example_application.network;

import com.example.example_application.com.example.example_application.models.Model1;

public class networkTest {
    public static void main(String[] args){
        Retrofit2Client newClient = new Retrofit2Client();
//        newClient.getModel1(2); // GET a Model1 Item by a model1_id.

//        Model1 newModel1 = new Model1();
//        newModel1.setModel1Int(121);
//        newModel1.setModel1DateTime("2019-12-12T00:55:55Z");
//        newModel1.setModel1Text("NEW MODEL52!!");
//        newModel1.setModel2Id(1);
//        newClient.postModel1(newModel1);
        Model1.Model1Int newModel1Int = new Model1().new Model1Int(139);
//        System.out.println(newModel1Int.getModel1Int());
//        newClient.patchModel1(newModel1Int, 5);
        newClient.delModel1(7);
    }
}
