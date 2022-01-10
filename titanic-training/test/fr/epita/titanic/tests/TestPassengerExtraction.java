package fr.epita.titanic.tests;

import java.io.File;
import java.util.List;
import java.lang.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import fr.epita.titanic.datamodel.Passenger;
import fr.epita.titanic.services.PassengerCSVReader;

import java.util.*;

public class TestPassengerExtraction {

    public static void main(String[] args) {
        PassengerCSVReader reader = new PassengerCSVReader();
        List<Passenger> passengers = reader.read(new File("titanic-training/train.csv"));

        Double totalAge = 0.0;
        Double malecount=0.0;
        Double femalecount=0.0;
        String sex;
        String male="male";
        Double SXI_U=0.0;
        Double variance;
        Double standard_deviation;
        Integer Survived=0;
        for(Passenger passenger : passengers){
            totalAge += passenger.getAge();
            sex=(passenger.getSex()).toLowerCase();

            if(sex.equals(male))
            {
                malecount=malecount+1;

            }
            if(((passenger.getSex()).toLowerCase()).equals("female"))
            {
                femalecount=femalecount+1;
            }
        }
        double averageAge = totalAge / passengers.size();
        for(Passenger passenger : passengers){
            SXI_U = Math.pow((passenger.getAge())-averageAge,2) + SXI_U;

        }
        for(Passenger passenger : passengers){

            if(passenger.getSurvived() == 1)
            {
                Survived =Survived+1;
            }

        }
        variance=SXI_U/(passengers.size()-1);
        standard_deviation=Math.sqrt(variance);
        System.out.println("standard_deviationAge:"+ standard_deviation);
        System.out.println("Survived:"+ Survived);
        System.out.println("averageAge:"+ averageAge);
        System.out.println("varianceAge:"+ variance);
        System.out.println("Males:"+ malecount);
        System.out.println("FeMales:"+ femalecount);

    }
}

//Updated by Raviteja Naraharisetti upon Prof Thomos Broussard