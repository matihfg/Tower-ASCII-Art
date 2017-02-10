/*
 *  CS312 Assignment 2.
 *  On my honor, <NAME>, this programming assignment is my own work.
 *
 *  A program to print out the UT Tower in ASCII art form.
 *
 *  Name: Matias Fragoso
 *  email address: mfragoso@utexas.edu
 *  UTEID: mhf465
 *  Section 5 digit ID: 51290
 *  Grader name:
 *  Number of slip days used on this assignment:
 */

public class Tower {
    
    // CS312 students, DO NOT ALTER THE FOLLOWING LINE except for the literal int.
    // You may change the literal int assigned to SIZE to any value from 2 to 100.
    // In the final version of the program you submit set the SIZE to 3.
    public static final int SIZE = 4;

    public static void main(String[] args) {
        drawBell();
        drawBody();
        drawBase();
    }
    
        // draw the top of the tower/bell
        public static void drawBell() {
           drawPoundSeperator();
           drawInsideBell();
           drawPoundSeperator();
        }
        
        //draw the body of the tower
        public static void drawBody() {
            drawInsideBody();
            drawAccentSeperator();
        }
        
        //draw the base of the tower
        public static void drawBase() {
            drawTopHalfStairs();
            drawBottomHalfStairs();
        }
        
        
        //draws the inside of the top section
        public static void drawInsideBell() {
            
            //determines how many lines are needed for the inside of the bell
            int numRows = 2 * SIZE - 2;
            for (int lineNum = 1; lineNum <= numRows; lineNum++) {
                
                //number of spaces before characters begin to print
                int numSpaces = 4 * SIZE + 2;
                for (int i = 0; i < numSpaces; i++) {
                    System.out.print(" ");
                }
                
                //number of pipes in each row
                for (int i = 0; i < 2 * SIZE - 1; i++) {
                    System.out.print("|");
                }
                System.out.println();
            }
        }
        
        //draws the lines of pound's
        public static void drawPoundSeperator(){
            
            //number of spaces before characters begin to print
            int numSpaces = 4 * SIZE + 2;
            for (int i = 0; i < numSpaces; i++) {
                System.out.print(" ");
            }
            
            //number of pound's in each row
            int numPound = 2 * SIZE - 1;
            for (int i =0; i < numPound; i++) {
                System.out.print("#");
            }
            System.out.println();
        }
        
        //draws the middle (body) of the tower
        public static void drawInsideBody() {
            
            //configures how many times the O & accent lines repeat
            int numRows = SIZE * SIZE;
            for (int lineNum = 1; lineNum <= numRows; lineNum++) {
                drawAccentSeperator();
                
            //number of spaces before characters begin to print
            int numSpaces = 4 * SIZE;
            for (int i = 0; i < numSpaces; i++) {
                System.out.print (" ");
            }
            
            //characters start printing
            System.out.print("|");
            
            //determines how many times -O-O.. repeats in each row
            for (int i = 0; i < SIZE; i++) {
                System.out.print ("-");
                System.out.print("O");
            }
            
            //finishes each row and begins a new one
            System.out.print("-");
            System.out.print("|");
            System.out.println();
           }
        }
        
        //draws the line of ~s between the lines in the body
        public static void drawAccentSeperator() {
            
            //number of body rows in each size
            int numRow = 4 * SIZE;
            
            //number of spaces before the start of the line
            for (int i = 0; i < numRow; i++) {
                System.out.print (" ");
            }
            
            //number of ~s in each line
            int numAccents = 2 * SIZE + 3;
            for (int i = 0; i < numAccents; i++) {
                System.out.print("~");
            }
            System.out.println();
        }
        
        //draws the top half of the stairs with 's and "s
        public static void drawTopHalfStairs() {
            //number of rows in the top half of the stairs
            int numRow = SIZE / 2 + 1;
            
            //number of rows in the top half if the stairs
            for (int lineNum = 1; lineNum <= numRow; lineNum++) { 
                int numSpaces =  SIZE / 2 * 3 - (lineNum - 1) * 3;
                int numCharacters = 5 * SIZE - numSpaces;
                
                //number of spaces before the start of the line 
                    for (int spaces = 0; spaces < numSpaces; spaces++) {
                        System.out.print(" ");
                    }
                    
                //starts the line of characters
                System.out.print("/");
                
                //repeats the number of "' characters
                    for (int i = 0; i < numCharacters; i++) {
                        System.out.print("\"");
                        System.out.print("'");
                    }
                
                //finishes each row and begins a new one
                System.out.print("\"");
                System.out.print("\\");
                System.out.println();
            }   
        }
        
        //draws the bottom half of the stairs with O's and "s
        public static void drawBottomHalfStairs() {
            for (int lineNum = 1; lineNum <= SIZE; lineNum++) {
                
                //starts line of characters
                System.out.print("/");
                
                    //determines how many times "O"O.. repeats in each row
                    int numCharacters = 5 * SIZE;
                    for (int i = 0; i < numCharacters; i++) {
                        System.out.print("\"");
                        System.out.print("O");
                    }
                    
                //finishes each row and begins a new one
                System.out.print("\"");
                System.out.print("\\");
                System.out.println();
            }
       }
    }
