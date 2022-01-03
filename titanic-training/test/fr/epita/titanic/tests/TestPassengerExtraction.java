package fr.epita.titanic.tests;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import fr.epita.titanic.datamodel.Passenger;
import fr.epita.titanic.services.PassengerCSVReader;

public class TestPassengerExtraction {

    public static void main(String[] args) {
        PassengerCSVReader reader = new PassengerCSVReader();
        List<Passenger> passengers = reader.read(new File("S:\\Work\\ae\\Epita\\workspaces\\2021-t3-java-uml-ais\\titanic-training\\test.csv"));

        Double totalAge = 0.0;
        for(Passenger passenger : passengers){
            totalAge += passenger.getAge();
        }
        double averageAge = totalAge / passengers.size();
        System.out.println(averageAge);

    }
}
