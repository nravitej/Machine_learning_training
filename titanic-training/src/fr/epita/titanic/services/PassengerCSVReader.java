package fr.epita.titanic.services;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.lang.*;
import fr.epita.titanic.datamodel.Passenger;

public class PassengerCSVReader {


     public List<Passenger> read(File file){
          List<Passenger> passengers = new ArrayList<>();
          try {
               List<String> lines = Files.readAllLines(file.toPath());
               for (String line: lines){
                    try {
                         line = line.replaceAll(",", ";");
                         line = line.replaceAll("; ", ", ");
                         String[] split = line.split(";");

                         Passenger instance = new Passenger();
                         try {
                              instance.setPassengerId(Integer.parseInt(split[0]));
                         }catch(NumberFormatException e)
                         {
                              instance.setPassengerId(0);
                         }
                         try {

                              instance.setSurvived(Integer.parseInt(split[1]));
                         }catch(NumberFormatException e)
                         {
                              instance.setSurvived(0);
                         }
                         try {
                              instance.setPclass(Integer.parseInt(split[2]));
                         }catch(NumberFormatException e)
                         {
                              instance.setPclass(0);
                         }
                         instance.setName(split[3]);
                         instance.setSex(split[4]);
                         try {
                              instance.setAge(Double.parseDouble(split[5]));
                         }
                         catch(NumberFormatException e)
                         {
                              instance.setAge(0.0);
                         }
                         //to be completed

                         passengers.add(instance);
                    }
                    catch(NumberFormatException e)
                    {
                         System.out.println(line);
                         e.printStackTrace();
                    }
               }
          } catch (IOException e) {
               System.out.println("Header");
          }


          return passengers;
     }
}
