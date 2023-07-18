/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author seb_3
 */
public class LongitudConverter {
    public static String[] Unidades = {
        "Milla (mi)",
        "Kilometro (Km)",
        "Metro (m)",
        "Pie (ft)",
        "Pulgada (in)",
        "Centimetro (cm)"
    };
    
    private static int indexOrigen;
    private static int indexFinal;
    public static String unidadOrigen;
    public static double valorOrigen;
    public static String unidadFinal;
    public static double valorFinal;

    public static String[] getUnidades() {
        return Unidades;
    }

    public static String getUnidadOrigen() {
        return unidadOrigen;
    }

    public static double getValorOrigen() {
        return valorOrigen;
    }

    public static String getUnidadFinal() {
        return unidadFinal;
    }

    public static double getValorFinal() {
        return valorFinal;
    }
    
    public LongitudConverter(String unidadOrigen, String unidadFinal){
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
                                aux_valor = miToKm(aux_valor);
                                break;
                            case 1:
                                aux_valor = kmToM(aux_valor);
                                break;
                            case 2:
                                aux_valor = mToFt(aux_valor);
                                break;
                            case 3:
                                aux_valor = ftToIn(aux_valor);
                                break;
                            case 4:
                                aux_valor = inToCm(aux_valor);
                                break;
                        }
                        i++;
                        break;
                    case "UP":
                        switch (i-1) {
                            case 0: 
                                aux_valor = kmToMi(aux_valor);
                                break;
                            case 1:
                                aux_valor = mToKm(aux_valor);
                                break;
                            case 2:
                                aux_valor = ftToM(aux_valor);
                                break;
                            case 3:
                                aux_valor = inToFt(aux_valor);
                                break;
                            case 4:
                                aux_valor = cmToIn(aux_valor);
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
    
    public static double cmToIn (double valor){
        return valor / 2.54;
    }
    
    public static double inToFt (double valor){
        return valor / 12;
    }
    
    public static double ftToM (double valor){
        return valor / 3.2808399;
    }
    
    public static double mToKm (double valor){
        return valor / 1000;
    }
    
    public static double kmToMi (double valor){
        return valor / 1.609344;
    }
    
    public static double miToKm (double valor){
        return valor * 1.609344;
    }
    
    public static double kmToM (double valor){
        return valor * 1000;
    }
    
    public static double mToFt (double valor){
        return valor * 3.2808399;
    }
    
    public static double ftToIn (double valor){
        return valor * 12;
    }
    
    public static double inToCm (double valor){
        return valor * 2.54;
    }
    
    public static void main(String[] args){
        LongitudConverter obj = new LongitudConverter(LongitudConverter.Unidades[2], LongitudConverter.Unidades[0]);
        obj.convertirUnidades(30);
        System.out.println(obj.unidadOrigen + " en " + obj.indexOrigen + " = " + valorOrigen);
        System.out.println(obj.unidadFinal + " en " + obj.indexFinal + " = " + valorFinal);
    }
}
