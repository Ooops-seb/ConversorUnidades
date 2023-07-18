/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author seb_3
 */
public class TemperaturaConverter {
    public static String[] Unidades = {
        "Celsius (°C)",
        "Fahrenheit (°F)",
        "Kelvin (K)",
        "Rankine (R)",
    };
    
    public static String unidadOrigen;
    public static double valorOrigen;
    public static String unidadFinal;
    public static double valorFinal;
    
    public TemperaturaConverter(String unidadOrigen, String unidadFinal){
        this.unidadOrigen = unidadOrigen;
        this.unidadFinal = unidadFinal;
    }
    
    public static void convertirUnidades(double valor){
        valorOrigen = valor;
        
        double aux_valor = valorOrigen;
        
        switch(unidadOrigen){
            case "Celsius (°C)":
                switch(unidadFinal){
                    case "Celsius (°C)":
                        break;
                    case "Fahrenheit (°F)":
                        aux_valor = cToF(valor);
                        break;
                    case "Kelvin (K)":
                        aux_valor = cToK(valor);
                        break;
                    case "Rankine (R)":
                        aux_valor = cToR(valor);
                        break;
                }
            break;
            case "Fahrenheit (°F)":
                switch (unidadFinal) {
                    case "Celsius (°C)":
                        aux_valor = fToC(valor);
                        break;
                    case "Fahrenheit (°F)":
                        break;
                    case "Kelvin (K)":
                        aux_valor = fToK(valor);
                        break;
                    case "Rankine (R)":
                        aux_valor = fToR(valor);
                        break;
                }
            break;
            case "Kelvin (K)":
                switch(unidadFinal) {
                    case "Celsius (°C)":
                        aux_valor = kToC(valor);
                        break;
                    case "Fahrenheit (°F)":
                        aux_valor = kToF(valor);
                        break;
                    case "Kelvin (K)":
                        break;
                    case "Rankine (R)":
                        aux_valor = kToR(valor);
                        break;
                }
            break;
            case "Rankine (R)":
                switch(unidadFinal) {
                    case "Celsius (°C)":
                        aux_valor = rToC(valor);
                        break;
                    case "Fahrenheit (°F)":
                        aux_valor = rToF(valor);
                        break;
                    case "Kelvin (K)":
                        aux_valor = rToK(valor);
                        break;
                    case "Rankine (R)":
                        break;
                }
            break;
        }
        valorFinal = aux_valor;
    }
    
    public static double cToF (double valor){
        return (valor * 9 / 5) + 32;
    }
    
    public static double cToK (double valor){
        return valor + 273.15;
    }
    
    public static double cToR (double valor){
        return (valor + 273.15) * 9 / 5;
    }
    
    public static double fToC (double valor){
        return (valor - 32) / 5 / 9;
    }
    
    public static double fToK (double valor){
        return fToC(valor) + 273.15;
    }
    
    public static double fToR (double valor){
        return valor + 459.67;
    }
    
    public static double kToC (double valor){
        return valor - 273.15;
    }
    
    public static double kToF (double valor){
        return (kToC(valor) * 9 / 5) + 32;
    }
    
    public static double kToR (double valor){
        return valor * 9 / 5;
    }
    
    public static double rToC (double valor){
        return (valor - 491.67) * 5 / 9;
    }
    
    public static double rToF (double valor){
        return valor - 459.67;
    }
    
    public static double rToK (double valor){
        return valor * 5 / 9;
    }
    
    public static void main(String[] args){
        TemperaturaConverter obj = new TemperaturaConverter(TemperaturaConverter.Unidades[0], TemperaturaConverter.Unidades[3]);
        obj.convertirUnidades(30);
        System.out.println(obj.unidadOrigen + " = " + valorOrigen);
        System.out.println(obj.unidadFinal + " = " + valorFinal);
    }
}
