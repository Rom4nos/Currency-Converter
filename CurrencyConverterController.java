package com.example.firstproject;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;

import java.net.URL;
import java.util.ResourceBundle;


public class CurrencyConverterController implements Initializable{
    @FXML
    private Label welcomeText;
    @FXML
    public TextField text1;
    public TextField text2;
    @FXML
    private ComboBox<String> CurrencySelector1,CurrencySelector2;
    private final String[] Currencies = {"USD","BRL","EUR","JPY","GBP"};
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        CurrencySelector1.getItems().addAll(Currencies);
        CurrencySelector2.getItems().addAll(Currencies);
    }

    @FXML
    protected void onHelloButtonClick() {
        String input = text1.getText();
        String fromCurrency = CurrencySelector1.getValue();
        String toCurrency = CurrencySelector2.getValue();
        double exchangeRate = 0.0;


        switch(fromCurrency) {
            case "USD":
                switch(toCurrency) {
                    case "USD":
                        exchangeRate = 1.0;
                        break;
                    case "BRL":
                        exchangeRate = 5.28;
                        break;
                    case "EUR":
                        exchangeRate = 0.84;
                        break;
                    case "JPY":
                        exchangeRate = 109.33;
                        break;
                    case "GBP":
                        exchangeRate = 0.72;
                        break;
                }
                break;
            case "BRL":
                switch(toCurrency) {
                    case "USD":
                        exchangeRate = 0.19;
                        break;
                    case "BRL":
                        exchangeRate = 1.0;
                        break;
                    case "EUR":
                        exchangeRate = 0.16;
                        break;
                    case "JPY":
                        exchangeRate = 20.91;
                        break;
                    case "GBP":
                        exchangeRate = 0.14;
                        break;
                }
                break;
            case "EUR":
                switch(toCurrency) {
                    case "USD":
                        exchangeRate = 1.19;
                        break;
                    case "BRL":
                        exchangeRate = 6.14;
                        break;
                    case "EUR":
                        exchangeRate = 1.0;
                        break;
                    case "JPY":
                        exchangeRate = 130.43;
                        break;
                    case "GBP":
                        exchangeRate = 0.86;
                        break;
                }
                break;
            case "JPY":
                switch(toCurrency) {
                    case "USD":
                        exchangeRate = 0.0091;
                        break;
                    case "BRL":
                        exchangeRate = 0.048;
                        break;
                    case "EUR":
                        exchangeRate = 0.0077;
                        break;
                    case "JPY":
                        exchangeRate = 1.0;
                        break;
                    case "GBP":
                        exchangeRate = 0.0065;
                        break;
                }
                break;
            case "GBP":
                switch(toCurrency) {
                    case "USD":
                        exchangeRate = 1.39;
                        break;
                    case "BRL":
                        exchangeRate = 7.33;
                        break;
                    case "EUR":
                        exchangeRate = 1.16;
                        break;
                    case "JPY":
                        exchangeRate = 154.42;
                        break;
                    case "GBP":
                        exchangeRate = 1.0;
                        break;
                }
                break;
        }


        double result = Double.parseDouble(input) * exchangeRate;
        text2.setText(String.format("%.2f", result));


    }






        }



