package com.example.coa;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HelloApplication  {


    public static void main(String[] args) {

        ArrayList<String> ar = new ArrayList<>();
        Scanner sc = new Scanner (System.in);

        System.out.print("Please tell me , what is the size of your records ? ");
        int size = sc.nextInt();
        System.out.println("Thank you ! Please paste the " + size + "Records");
        for(int i = 0 ; i < size ; i++){
            ar.add(sc.nextLine());
        }
        for(int i = 0 ; i < size ; i++){
            breakTheCodeInArrayList(ar.get(i));
           // System.out.println(ar.get(i));
            //System.out.println(ar.size());
        }


    }

    public static void breakTheCodeInArrayList(String str){
        for(int j = str.length()-1 ; j >= 0 ; j--){
            if(str.charAt(j)!='0'){
                System.out.println(str.substring(0,j+1));
                break;
            }
        }
    }


}