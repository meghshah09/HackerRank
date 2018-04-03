import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int currentCount =0;
    static boolean acceptable =true;
    static int month =0;
    static int programmerDay = 256;
    
    static void month(int add){
        currentCount = currentCount + add;
    }
    static void notPossible(boolean value){
        acceptable = value;
        //month--;
    }
    
    static void daysCalculation(boolean leapYear){
        while(acceptable){
                month++;
                switch(month){
                    case 1:
                        if(currentCount + 31 < programmerDay)
                            month(31);
                        else{
                            notPossible(false);
                        }
                        break;
                    case 2:
                        if(leapYear){
                            if(currentCount + 29 < programmerDay)
                                month(29);
                            else{
                                notPossible(false);
                            }
                        }
                        else{
                           if(currentCount + 28 < programmerDay)
                                month(28);
                            else{
                                notPossible(false);
                            }
                        }
                        break;
                    case 3:
                        if(currentCount + 31 < programmerDay)
                            month(31);
                        else{
                            notPossible(false);
                        }
                        break;
                    case 4:
                        if(currentCount + 30 < programmerDay)
                            month(30);
                        else{
                            notPossible(false);
                        }
                        break;
                    case 5:
                        if(currentCount + 31 < programmerDay)
                            month(31);
                        else{
                            notPossible(false);
                        }
                        break;
                    case 6:
                        if(currentCount + 30 < programmerDay)
                            month(30);
                        else{
                            notPossible(false);
                        }
                        break;
                    case 7:
                        if(currentCount + 31 < programmerDay)
                           month(31);
                        else{
                            notPossible(false);
                        }
                        break;
                    case 8:
                        if(currentCount + 31 < programmerDay)
                            month(31);
                        else{
                            notPossible(false);
                        }
                        break;
                    case 9:
                        if(currentCount + 30 < programmerDay)
                            month(30);
                        else{
                            notPossible(false);
                        }
                        break;
                    case 10:
                        if(currentCount + 31 < programmerDay)
                            month(31);
                        else{
                            notPossible(false);
                        }
                        break;
                    case 11:
                        if(currentCount + 30 < programmerDay)
                            month(30);
                        else{
                            notPossible(false);
                        }
                        break;
                    case 12:
                        if(currentCount + 31 < programmerDay)
                            month(31);
                        else{
                            notPossible(false);
                        }
                        break;
                }
            }
    }
    
    static String solve(int year){
        // Complete this function
        if(year>= 1700 && year <=2700){
        
            
            
            boolean leapYear=false; //indicating not a leap year.
            
        if(year <= 1917 ){
            //julian calender
            
            if(year % 4 == 0 ){
                //leap year
                leapYear=true;
            }
            daysCalculation(leapYear);
            
            
        }else if (year == 1918){
           //transition year 
            
            while(acceptable){
                month++;
                switch(month){
                    case 1:
                        if(currentCount + 31 < programmerDay)
                            month(31);
                        else{
                            notPossible(false);
                        }
                        break;
                    case 2:
                           if(currentCount + 15 < programmerDay)
                                month(15);
                            else{
                                notPossible(false);
                            }
                        break;
                    case 3:
                        if(currentCount + 31 < programmerDay)
                            month(31);
                        else{
                            notPossible(false);
                        }
                        break;
                    case 4:
                        if(currentCount + 30 < programmerDay)
                            month(30);
                        else{
                            notPossible(false); 
                        }
                        break;
                    case 5:
                        if(currentCount + 31 < programmerDay)
                            month(31);
                        else{
                            notPossible(false);
                        }
                        break;
                    case 6:
                        if(currentCount + 30 < programmerDay)
                            month(30);
                        else{
                            notPossible(false);
                        }
                        break;
                    case 7:
                        if(currentCount + 31 < programmerDay)
                           month(31);
                        else{
                            notPossible(false);
                        }
                        break;
                    case 8:
                        if(currentCount + 31 < programmerDay)
                            month(31);
                        else{
                            notPossible(false);
                        }
                        break;
                    case 9:
                        if(currentCount + 30 < programmerDay)
                            month(30);
                        else{
                            notPossible(false);
                        }
                        break;
                    case 10:
                        if(currentCount + 31 < programmerDay)
                            month(31);
                        else{
                            notPossible(false);
                        }
                        break;
                    case 11:
                        if(currentCount + 30 < programmerDay)
                            month(30);
                        else{
                            notPossible(false);
                        }
                        break;
                    case 12:
                        if(currentCount + 31 < programmerDay)
                            month(31);
                        else{
                            notPossible(false);
                        }
                        break;
                }
            }
            
        }else{
            //Gregorian year
            
            if(year % 400 == 0){
                //leap year
                leapYear=true;
            }else if(year % 4 ==0 && year %100 != 0){
                //leap year.
                leapYear=true;
            }
            daysCalculation(leapYear);
        }
        
    }//boundary check closed
    else{
        System.out.println("Year is not proper");
        System.exit(0);
    }
        int difference = programmerDay - currentCount;
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%02d",difference));
        sb.append(".");
        sb.append(String.format("%02d",month));
        sb.append(".");
        sb.append(year);
        
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
