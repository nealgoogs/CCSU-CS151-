//Moneyball! (5 pts) 
//Write a program which reads the file "2021 CCSU Volleyball.txt" 
//and performs the following:
  //• Store the data from the file in a 2 layer array.
    //o (skip the first header row of the file)
  //• Print the array, with each element separated by one space
  //• Loop through the array and calculate each of the following:
    //o Kills per set
    //o Assists per set
    //o Points per set
    //o Note: you’ll need to parse the String element into doubles
    //to use in the math equation. It’s easiest to make three 
    //separate loops, one for each statistic.
  //• Print the value and the name of the top player for each 
  //of these statistics.
  
//Niall Geoghegan
//Homework 5

import java.util.Scanner;
import java.io.*;

public class Volleyball{
  
  public static void main (String [] args) throws FileNotFoundException{
    
    File fileName = new File("VolleyballStats.txt");
    Scanner fileReader = new Scanner(fileName);
    
    String[][] stats = new String[15][17];
    
    fileReader.nextLine();
    
    int row = 0;
    int column = stats[0].length;
    while (fileReader.hasNext()){
      String line = fileReader.nextLine();
      String[] rowArray = line.split(",");
      stats[row] = rowArray;
      row++;
      column++;
    }
    
    
    
    for(int outer=0; outer<stats.length; outer++){
      for (int inner=0; inner<stats[outer].length; inner++){
        System.out.print(stats[outer][inner] + " ");
      }
      System.out.println();
    }
    
    /*double totalSets = 0;
    
    for(row = 0; row<stats.length; row++){
      double sets1 = Double.parseDouble( stats[0][5]);
      double sets2 = Double.parseDouble( stats[1][5]);
      double sets3 = Double.parseDouble( stats[2][5]);
      double sets4 = Double.parseDouble( stats[3][5]);
      double sets5 = Double.parseDouble( stats[4][5]);
      double sets6 = Double.parseDouble( stats[5][5]);
      double sets7 = Double.parseDouble( stats[6][5]);
      double sets8 = Double.parseDouble( stats[7][5]);
      double sets9 = Double.parseDouble( stats[8][5]);
      double sets10 = Double.parseDouble( stats[9][5]);
      double sets11 = Double.parseDouble( stats[10][5]);
      double sets12 = Double.parseDouble( stats[11][5]);
      double sets13 = Double.parseDouble( stats[12][5]);
      double sets14 = Double.parseDouble( stats[13][5]);
      double sets15 = Double.parseDouble( stats[14][5]);
      totalSets = sets1 + sets2 + sets3 + sets4 
      + sets5 + sets6 + sets7 + sets8 + sets9 + sets10 
      + sets11 + sets12 + sets13 + sets14 + sets15;
      
    }
    //System.out.println("Total sets: " + totalSets);
    
    double totalKills = 0;
    double killsPerSet = 0;
    //Kill Set Loop
    for(row = 0; row<stats.length; row++){
      double kills1 = Double.parseDouble( stats[0][6]);
      double kills2 = Double.parseDouble( stats[1][6]);
      double kills3 = Double.parseDouble( stats[2][6]);
      double kills4 = Double.parseDouble( stats[3][6]);
      double kills5 = Double.parseDouble( stats[4][6]);
      double kills6 = Double.parseDouble( stats[5][6]);
      double kills7 = Double.parseDouble( stats[6][6]);
      double kills8 = Double.parseDouble( stats[7][6]);
      double kills9 = Double.parseDouble( stats[8][6]);
      double kills10 = Double.parseDouble( stats[9][6]);
      double kills11 = Double.parseDouble( stats[10][6]);
      double kills12 = Double.parseDouble( stats[11][6]);
      double kills13 = Double.parseDouble( stats[12][6]);
      double kills14 = Double.parseDouble( stats[13][6]);
      double kills15 = Double.parseDouble( stats[14][6]);
      totalKills = kills1 + kills2 + kills3 + kills4 
      + kills5 + kills6 + kills7 + kills8 + kills9 + kills10 
      + kills11 + kills12 + kills13 + kills14 + kills15;
      killsPerSet = totalKills / totalSets;
    }
    System.out.println("Kills per set: " + killsPerSet);
    //System.out.println("Total kills: " + totalKills);*/
    
    //kills per set proper code
    double kills = 0;
    double sets = 0;
    double killsPerSet = 0;
    double maxKiller = 0.0;
    String maxName = "";
    
    for(row = 0; row<stats.length; row++){
      for(column = 0; column<stats[0].length; column++){
        kills = Double.parseDouble(stats[row][6]);
        sets = Double.parseDouble(stats[row][5]);
        killsPerSet = kills/sets;
        if(killsPerSet>maxKiller){
          maxKiller = killsPerSet;
          maxName = stats[row][1];
        }
        //System.out.println("sets: " + sets + "kills: " + kills);
        //System.out.println("ASJLS: " + killsPerSet);
      }   
    //System.out.println("sets: " + sets + " kills: " + kills);      
    }
    
    //assists per set
    
    double assists = 0;
    double assistsPerSet = 0;
    double maxAssists = 0.0;
    String maxAssistance = "";
    
    for(row = 0; row<stats.length; row++){
      for(column = 0; column<stats[0].length; column++){
        assists = Double.parseDouble(stats[row][9]);
        sets = Double.parseDouble(stats[row][5]);
        assistsPerSet = assists/sets;
        if(assistsPerSet>maxAssists){
          maxAssists = assistsPerSet;
          maxAssistance = stats[row][1];
        }
        //System.out.println("sets: " + sets + "kills: " + kills);
        //System.out.println("ASJLS: " + killsPerSet);
      }   
    //System.out.println("sets: " + sets + " assists: " + assists);      
    }
    
    //points per set
    
    double points = 0;
    double pointsPerSet = 0;
    double maxPoints = 0.0;
    String maxPointWoman = "";
    
    for(row = 0; row<stats.length; row++){
      for(column = 0; column<stats[0].length; column++){
        points = Double.parseDouble(stats[row][16]);
        sets = Double.parseDouble(stats[row][5]);
        pointsPerSet = points/sets;
        if(pointsPerSet>maxPoints){
          maxPoints = pointsPerSet;
          maxPointWoman = stats[row][1];
        }
        //System.out.println("sets: " + sets + "kills: " + kills);
        //System.out.println("ASJLS: " + killsPerSet);
      }   
    //System.out.println("sets: " + sets + " points: " + points);      
    }
  //System.out.println("Total kills: " + kills);
  //System.out.println("ASJLS: " + killsPerSet);
  
    /*double maxKiller = 0.0;
    String maxName = "";
    
    if(killsPerSet>maxKiller){
      maxKiller = killsPerSet;
      maxName = stats[row][1];
    }*/
    System.out.println();
    System.out.printf("Most kills per set: (%.2f) %s%n",maxKiller, maxName);
    System.out.printf("Most assists per set: (%.2f) %s%n",maxAssists,maxAssistance);
    System.out.printf("Most points per set: (%.2f) %s%n",maxPoints,maxPointWoman);
  }
}