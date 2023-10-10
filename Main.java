import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) {  
    World home = new World(300,300);
    // ClassName variableName = new ClassName(arguments);
   
    Turtle Bob = new Turtle(home);
    // ClassName variableName = new ClassName(arguments);
    Bob.penUp();
    Bob.moveTo(100, 100);
    Bob.penDown();
    Bob.Sq();
    Bob.penUp();
    Bob.forward();
    Bob.penDown();
    Bob.Tri();

  
    home.setVisible(true);
  }
  public static void Sq(String[] args){
    Bob.forward();
    Bob.turnRight();
    Bob.forward();
    Bob.turnRight();
    Bob.forward();
    Bob.turnRight();
    Bob.forward();
    Bob.turnRight();
    
  }
  public static void Tri(String[] args){
    Bob.turn(45);
    Bob.forward(50*Math.sqrt(2));
    Bob.turnRight();
    Bob.forward(50*Math.sqrt(2));
    
  }

}
//sealed