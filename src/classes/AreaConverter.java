/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author seb_3
 */
public class AreaConverter {
    public static String[] Unidades = {
        "Kilometro cuadrado",
        "Hectarea",
        "Acre",
        "Metro cuadrado",
        "Centimetro cuadrado",
    };
    
    private static int indexOrigen;
    private static int indexFinal;
    public static String unidadOrigen;
    public static double valorOrigen;
    public static String unidadFinal;
    public static double valorFinal;
    
    public AreaConverter(String unidadOrigen, String unidadFinal){
        this.unidadOrigen = unidadOrigen;
        this.unidadFinal = unidadFinal;
    }
    
    public static void convertirUnidades(double valor){
        valorOrigen = valor;
        
        double aux_valor = valorOrigen;
        
        String direccion = calcDireccion();
        
        int i = indexOrigen;
        while(i != indexFinal){
            if(i == indexFinal){
                aux_valor = aux_valor;
                break;
            }
            else {
                switch (direccion) {
                    case "DOWN":
                        switch (i) {
                            case 0:
                                aux_valor = kmToH(aux_valor);
                                break;
                            case 1:
                                aux_valor = hToA(aux_valor);
                                break;
                            case 2:
                                aux_valor = aToM(aux_valor);
                                break;
                            case 3:
                                aux_valor = mToCm(aux_valor);
                                break;
                        }
                        i++;
                        break;
                    case "UP":
                        switch (i-1) {
                            case 0: 
                                aux_valor = hToKm(aux_valor);
                                break;
                            case 1:
                                aux_valor = aToH(aux_valor);
                                break;
                            case 2:
                                aux_valor = mToA(aux_valor);
                                break;
                            case 3:
                                aux_valor = cmToM(aux_valor);
                                break;
                        }
                        i--;
                        break;
                }
            }
        }
        valorFinal = aux_valor; 
    }
    
    private static String calcDireccion(){

        for(int i = 1; i < Unidades.length; i++){
            if(unidadOrigen.equals(Unidades[i])){
                indexOrigen = i;
            }
        }
        for(int i = 1; i < Unidades.length; i++){
            if(unidadFinal.equals(Unidades[i])){
                indexFinal = i;
            }
        }
        
        if(indexOrigen < indexFinal){
            return "DOWN";  
        }
        else {
            return "UP";
        }
    }

    public static double cmToM (double valor){
        return valor / 10000;
    }
    
    public static double mToA (double valor){
        return valor / 4046.85642;
    }
    
    public static double aToH (double valor){
        return valor / 2.47105381;
    }
    
    public static double hToKm (double valor){
        return valor /  100;
    }
    
    public static double kmToH (double valor){
        return valor * 100;
    }
    
    public static double hToA (double valor){
        return valor * 2.47105381;
    }
    
    public static double aToM (double valor){
        return valor * 4046.85642;
    }
    
    public static double mToCm (double valor){
        return valor * 10000;
    }
}
