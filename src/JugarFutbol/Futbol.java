/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JugarFutbol;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;


/**
 *
 * @author Estudiante
 */
public class Futbol {
    private City ciudad;
    private Robot robot;
    private Thing balon;
    
    public Futbol(){
        this.ciudad= new City();
        this.robot = new Robot (ciudad, 5, 5, Direction.WEST);
        this.balon = new Thing(ciudad,5,4);
    }
    public void jugar (){
        
        this.advance();
        this.guardarbalon();
        this.advance();
        this.mostrarbalon();
        this.guardarbalon();
        this.advanceRight();
        this.advance();
        this.mostrarbalon();
        this.guardarbalon();
        this.advanceLeft();
        for (int i=0;i<2;i++){
            this.advance();
        }
        this.mostrarbalon();
        this.guardarbalon();
        this.advanceRight();
        this.mostrarbalon();
        this.guardarbalon();
        this.advance();
        this.mostrarbalon();
        this.guardarbalon();

        
    }
    public void advance(){
        this.robot.move();
    }
    private void advanceLeft(){
        this.robot.turnLeft();
    }
    private void advanceRight(){
       for (int i=0;i<3;i++){
         robot.turnLeft(); 
      }
    }
    private void guardarbalon (){
        this.robot.pickThing();
    }
    private void mostrarbalon(){
        this.robot.putThing();
    }
}
