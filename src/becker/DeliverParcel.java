package becker;

import becker.robots.*;

public class DeliverParcel
{
   public static void main(String[] args)
   {  
     // Set up the initial situation
      City prague = new City();
      Thing parcel = new Thing(prague, 1, 2);
      Thing parcel02 = new Thing(prague, 5, 4);
      Robot karel = new Robot(prague, 1, 0, Direction.EAST,5);
    
      // Direct the robot to the final situation
      for (int i=0;i<2;i++){
         karel.move(); 
      }
      karel.pickThing();
      for (int i=0;i<2;i++){
         karel.move(); 
      }      
      for (int i=0;i<3;i++){
         karel.turnLeft(); 
      }
        for (int i=0;i<4;i++){
         karel.move(); 
      }
           karel.pickThing();
      System.out.println(karel.countThingsInBackpack());
   }
}
