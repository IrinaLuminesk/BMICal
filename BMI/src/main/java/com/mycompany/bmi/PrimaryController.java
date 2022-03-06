package com.mycompany.bmi;

import java.text.DecimalFormat;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class PrimaryController
{
    @FXML private TextField Weight;
    @FXML private TextField Height;
    @FXML private Label KQ;
    public void Handler(ActionEvent event)
    {
        //Hello
        // hrll
        Double BMI = Double.parseDouble(this.Weight.getText()) / Math.pow(Double.parseDouble(this.Height.getText()) / 100, 2);
        DecimalFormat f = new DecimalFormat("#.##");
        String kq = f.format(BMI);
        if(BMI < 18.5)
            kq += " - Cân nặng thấp (Gầy)"; 
        if(BMI >= 18.5 && BMI <= 24.5)
            kq += " - Bình thường";
        if(BMI > 24.5)
            kq += " - Béo phì";
        KQ.setText(kq);
    }
}
