package uri;

import java.util.Scanner;

public class ConversaodeTempo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tempo = in.nextInt();

        System.out.println(convertTempo(tempo));
    }

    private static String  convertTempo(int tempo) {
        if (tempo >0 && tempo < 60 ){
            return  "0:0:"+tempo;
        }else {
            int tempoSegundos = tempo % 60;
            int tempoMin = tempo / 60;
            if (tempoMin > 59 ){
                int tempoHor = tempoMin / 60;
                tempoMin = tempoMin % 60;
                return tempoHor+":"+tempoMin+":"+tempoSegundos;
            }
            return "0:"+tempoMin+":"+tempoSegundos;
        }
    }

}
