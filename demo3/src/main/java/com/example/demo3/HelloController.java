package com.example.demo3;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private Circle myCircle;
    private double x;
    private double y;
    public void up(ActionEvent e){
        //System.out.println("UP");
        myCircle.setCenterY(y-=1);
    }
    public void down(ActionEvent e){
        System.out.println("DOWN");
        myCircle.setCenterY(y+=1);
    }
    public void left(ActionEvent e){
        System.out.println("LEFT");
        myCircle.setCenterX(x-=1);
    }
    public void right(ActionEvent e){
        //System.out.println("RIGHT");
        myCircle.setCenterX(x+=1);
    }
}