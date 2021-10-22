package uri;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Cedulas {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            int  valor = in.nextInt();
            Map<Integer,Integer> cedulas = new LinkedHashMap<>();
            cedulas.put(100,0);
            cedulas.put(50,0);
            cedulas.put(20,0);
            cedulas.put(10,0);
            cedulas.put(5,0);
            cedulas.put(2,0);
            cedulas.put(1,0);

            if (valor / 100 != 0){
                cedulas.put(100,valor / 100);
                valor=valor % 100;
            }
            if (valor / 50 != 0){
                cedulas.put(50,valor / 50);
                valor = valor%50;
            }
            if (valor / 20 != 0){
                cedulas.put(20,valor / 20);
                valor = valor  % 20;
            }
            if (valor / 10 != 0){
                cedulas.put(10,valor / 10);
                valor = valor % 10;
            }
            if (valor / 5 != 0){
                cedulas.put(5,valor / 5);
                valor = valor % 5;
            }
            if (valor / 2 != 0){
                cedulas.put(2,valor / 2);
                valor = valor % 2;
            }
            cedulas.put(1,valor);

            for ( int i: cedulas.keySet()){
                System.out.println(cedulas.get(i) +" nota(s) de R$ "+ i + ",00");
            }
        }
    }
