package com.richis_l1;

import com.richis_l1.exception.BadInputLineException;
import com.richis_l1.exception.ThereIsNoSuchFileInInputDirectoryException;
import com.richis_l1.other.ArrayFromFileCreator;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ProgramStart {

    private static final Logger logger = LogManager.getLogger(ProgramStart.class);
    public static void main( String[] args ){
        logger.info("Program has started"); //&

        try (ArrayFromFileCreator arrayCreator = new ArrayFromFileCreator("input1.txt")) {
            while (arrayCreator.ready()) {
                try {
                    System.out.println(arrayCreator.nextArray());
                } catch (BadInputLineException e) {
                    System.out.println("Invalid input: " + e.getMessage());
                    continue;
                }
            }
        } catch (ThereIsNoSuchFileInInputDirectoryException e){
            logger.error("Failed to read input file: " + e.getMessage()); //&
            System.out.println("Failed to read input file: " + e.getMessage());
        } catch (IOException e){
            logger.error("There is problems with IO"); //&
            e.printStackTrace();
        }
        
        logger.info("Program has ended"); //&
    }
}
