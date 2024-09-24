package com.richis_l1;

import com.richis_l1.entity.array.MyArray;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.richis_l1.entity.array.ArrayImpl;

public class ProgramStart {

    private static final String NUMBER_REGEX = "[0-9\\s\\-]+";
    private static final String DELIMETER = "\\s";
    public static void main( String[] args )
    {
        try (BufferedReader fileReader = new BufferedReader(new FileReader("src\\main\\resources\\inputFiles\\input1.txt"));) {
            while(fileReader.ready()){
                String line = fileReader.readLine();
                if(line.matches(NUMBER_REGEX)){
                    MyArray newArray = new ArrayImpl();
                    String[] parts = line.split(DELIMETER);
                    for(String str : parts){
                        newArray.add(Integer.parseInt(str));
                       // System.out.print(str + " ");
                    }
                    System.out.println(newArray);
                }else{
                    System.out.println("Bad input line");
                }
                // System.out.println(((line.matches(NUMBER_REGEX)) ? "Ok: ": "BAD: ") + line);
                
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        
    }
}
