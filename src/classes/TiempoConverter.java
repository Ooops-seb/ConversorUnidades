/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author seb_3
 */
public class TiempoConverter {
    public static String[] Unidades = {
        "Milenio",
        "Siglo",
        "Decada",
        "Año",
        "Mes",
        "Dia",
        "Hora",
        "Minuto",
        "Segundo"
    };
    
    private static int indexOrigen;
    private static int indexFinal;
    public static String unidadOrigen;
    public static double valorOrigen;
    public static String unidadFinal;
    public static double valorFinal;
    
    public TiempoConverter(String unidadOrigen, String unidadFinal){
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
                                aux_valor = miToSi(aux_valor);
                                break;
                            case 1:
                                aux_valor = siToDe(aux_valor);
                                break;
                            case 2:
                                aux_valor = deToA(aux_valor);
                                break;
                            case 3:
                                aux_valor = aToMe(aux_valor);
                                break;
                            case 4:
                                aux_valor = meToD(aux_valor);
                                break;
                            case 5:
                                aux_valor = dToH(aux_valor);
                                break;
                            case 6:
                                aux_valor = hToM(aux_valor);
                                break;
                            case 7:
                                aux_valor = mToS(aux_valor);
                                break;
                            
                        }
                        i++;
                        break;
                    case "UP":
                        switch (i-1) {
                            case 0:
                                aux_valor = siToMi(aux_valor);
                                break;
                            case 1:
                                aux_valor = deToSi(aux_valor);
                                break;
                            case 2:
                                aux_valor = aToDe(aux_valor);
                                break;
                            case 3:
                                aux_valor = meToA(aux_valor);
                                break;
                            case 4:
                                aux_valor = dToMe(aux_valor);
                                break;
                            case 5:
                                aux_valor = hToD(aux_valor);
                                break;
                            case 6:
                                aux_valor = mToH(aux_valor);
                                break;
                            case 7:
                                aux_valor = sToM(aux_valor);
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
    
    public static double sToM (double valor){
        return valor / 60;
    }
    
    public static double mToH (double valor){
        return valor / 60;
    }
    
    public static double hToD (double valor){
        return valor / 24;
    }
    
    public static double dToMe (double valor){
        return valor / 30.4166667;  //Para calcular valores aproximados
    }
    
    public static double meToA (double valor){
        return valor / 12;
    }
    
    public static double aToDe (double valor){
        return valor / 10;
    }
    
    public static double deToSi (double valor){
        return valor / 10;
    }
    
    public static double siToMi (double valor){
        return valor / 10;
    }
    
    public static double mToS (double valor){
        return valor * 60;
    }
    
    public static double hToM (double valor){
        return valor * 60;
    }
    
    public static double dToH (double valor){
        return valor * 24;
    }
    
    public static double meToD (double valor){
        return valor * 30.4166667;  //Para calcular valores aproximados
    }
    
    public static double aToMe (double valor){
        return valor * 12;
    }
    
    public static double deToA (double valor){
        return valor * 10;
    }
    
    public static double siToDe (double valor){
        return valor * 10;
    }
    
    public static double miToSi (double valor){
        return valor * 10;
    }
    
    public static void main(String[] args){
        TiempoConverter obj = new TiempoConverter(TiempoConverter.Unidades[0], TiempoConverter.Unidades[4]);
        obj.convertirUnidades(30);
        System.out.println(obj.unidadOrigen + " en " + obj.indexOrigen + " = " + valorOrigen);
        System.out.println(obj.unidadFinal + " en " + obj.indexFinal + " = " + valorFinal);
    }
}
