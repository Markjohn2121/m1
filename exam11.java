package exam1;
import java.util.Scanner;

public class exam11 {

  public static void main(String[] args) {
   Scanner input =new Scanner(System.in);
 System.out.println("          LETS PLAY BINGO!"); System.out.println("");
 System.out.print("INPUT A NUMBER FROM 1-75: ");
                   boolean stop = false;
                     int bingo[][]= new int[5][15],num = 1;
for(int num1 =0;num1 <5;num1++){
   for(int num2 = 0;num2 <15;num2++){
        bingo[num1][num2] = num;
          num = num +1;}}
           int locator = 0;           
            int user_input = input.nextInt();
for(int check1 = 0;check1 <5;check1++){
  for(int check2 =0;check2 <15;check2++){
    if(user_input == bingo[check1][check2]){
     stop = true; break;  }}
if(stop == true){
        break;}
else if(stop != true){
   locator = locator+1;}}
    System.out.println("");   
if(locator == 0){B(user_input);}
if(locator == 1){I(user_input);}
if(locator == 2){N(user_input);}
if(locator == 3){G(user_input);}
if(locator == 4){O(user_input);}
       System.out.println("");
}   
static void B(int user){
       System.out.println("B        I       N       G       O");
       System.out.println("-----------------------------------");
       System.out.println(user                    );
    }
static void I(int user){
       System.out.println("B        I       N       G       O");
       System.out.println("-----------------------------------");
       System.out.println( "        " +user          );
    }
static void N(int user){
       System.out.println("B        I       N       G       O");
        System.out.println("---------------------------------");
       System.out.println("                 " +user       );
    }
static void G(int user){
       System.out.println("B        I       N       G       O");
        System.out.println("----------------------------------");
       System.out.println("                          " + user );
    }
static void O(int user){
       System.out.println("B        I       N       G       O");
        System.out.println("-----------------------------------");
       System.out.println("                                    "+user);
    }
  }

