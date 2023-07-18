/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author seb_3
 */
public class VolumenConverter {
    
    public static String[] Unidades = {
        "Kilometro cubico",
        "Metro cubico",
        "Galon Estadounidense",
        "Litro",
        "Mililitro",
        "Centimetro cubico",
    };
    
    private static int indexOrigen;
    private static int indexFinal;
    public static String unidadOrigen;
    public static double valorOrigen;
    public static String unidadFinal;
    public static double valorFinal;

    public VolumenConverter(String unidadOrigen, String unidadFinal) {
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
                                aux_valor = kmToM(aux_valor);
                                break;
                            case 1:
                                aux_valor = mToG(aux_valor);
                                break;
                            case 2:
                                aux_valor = gToL(aux_valor);
                                break;
                            case 3:
                                aux_valor = lToMi(aux_valor);
                                break;
                            case 4:
                                aux_valor = miToCm(aux_valor);
                                break;
                        }
                        i++;
                        break;
                    case "UP":
                        switch (i-1) {
                            case 0:
                                aux_valor = mToKm(aux_valor);
                                break;
                            case 1:
                                aux_valor = gToM(aux_valor);
                                break;
                            case 2:
                                aux_valor = lToG(aux_valor);
                                break;
                            case 3:
                                aux_valor = miToL(aux_valor);
                                break;
                            case 4:
                                aux_valor = cmToMi(aux_valor);
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
    
    public static double cmToMi (double valor){
        return valor;
    }
    
    public static double miToL (double valor){
        return valor / 1000;
    }
    
    public static double lToG (double valor){
        return valor / 3.78541178;
    }
    
    public static double gToM (double valor){
        return valor / 264.172053;
    }
    
    public static double mToKm (double valor){
        return valor / 1000000000;
    }
    
    public static double miToCm (double valor){
        return valor;
    }
    
    public static double lToMi (double valor){
        return valor * 1000;
    }
    
    public static double gToL (double valor){
        return valor * 3.78541178;
    }
    
    public static double mToG (double valor){
        return valor * 264.172053;
    }
    
    public static double kmToM (double valor){
        return valor * 1000000000;
    }
    
    public static void main(String[] args){
        VolumenConverter obj = new VolumenConverter(Unidades[1], Unidades[4]);
        obj.convertirUnidades(30);
        System.out.println(obj.unidadOrigen + " en " + obj.indexOrigen + " = " + valorOrigen);
        System.out.println(obj.unidadFinal + " en " + obj.indexFinal + " = " + valorFinal);
    }
}