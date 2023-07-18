/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author seb_3
 */
public class MasaConverter {
    public static String[] Unidades = {
        "Tonelada (Ton)",
        "Kilogramo (Kg)",
        "Libra (Lb)",
        "Onza (Oz)",
        "Gramo (g)"
    };
    
    private static int indexOrigen;
    private static int indexFinal;
    public static String unidadOrigen;
    public static double valorOrigen;
    public static String unidadFinal;
    public static double valorFinal;
    
    public MasaConverter(String unidadOrigen, String unidadFinal){
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
                                aux_valor = toneladaToKg(aux_valor);
                                break;
                            case 1:
                                aux_valor = kgToLibra(aux_valor);
                                break;
                            case 2:
                                aux_valor = libraToOnza(aux_valor);
                                break;
                            case 3:
                                aux_valor = onzaToGramo(aux_valor);
                                break;
                        }
                        i++;
                        break;
                    case "UP":
                        switch (i-1) {
                            case 3:
                                aux_valor = gramoToOnza(aux_valor);
                                break;
                            case 2:
                                aux_valor = onzaToLibra(aux_valor);
                                break;
                            case 1:
                                aux_valor = libraToKg(aux_valor);
                                break;
                            case 0: 
                                aux_valor = kgToTonelada(aux_valor);
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
    
    private static double gramoToOnza(double valor) {
        return valor / 28.3495231;
    }
    private static double onzaToLibra(double valor) {
        return valor / 16;
    }
    private static double libraToKg(double valor) {
        return valor / 2.20462262;
    }
    private static double kgToTonelada(double valor){
        return valor / 1000;
    }
    private static double toneladaToKg(double valor){
        return valor * 1000;
    }
    private static double kgToLibra(double valor) {
        return valor * 2.20462262;
    }
    private static double libraToOnza(double valor) {
        return valor * 16;
    }
    private static double onzaToGramo(double valor) {
        return valor * 28.3495231;
    }
    
//    public static String[] UnidadesMasa = {
//        "Tonelada (Ton)",
//        "Kilogramo (Kg)",
//        "Libra (Lb)",
//        "Onza (Oz)",
//        "Gramo (g)"
//    };
    
    public static void main(String[] args){
        MasaConverter obj = new MasaConverter(MasaConverter.Unidades[1],MasaConverter.Unidades[3]);
        obj.convertirUnidades(30);
        System.out.println(obj.unidadOrigen + " en " + obj.indexOrigen + " = " + valorOrigen);
        System.out.println(obj.unidadFinal + " en " + obj.indexFinal + " = " + valorFinal);
    }
}