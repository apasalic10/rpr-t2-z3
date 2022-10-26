package ba.unsa.etf.rpr;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.max;
import static java.util.Collections.min;

public class App {

    public static void main( String[] args ) {


        Scanner ulaz = new Scanner(System.in);
        List<Double> lista = new LinkedList<>();



        while(true){

            System.out.println("Unesite elemente liste '(stop)' za kraj: ");
            String unos = ulaz.nextLine();

            if(unos.equals("stop")){
                break;
            }
            else{
                try{
                    Double x = Double.parseDouble(unos);
                    lista.add(x);
                }
                catch(Exception e){
                    System.out.println("Pogresan unos!");
                }
            }
        }

        double min = min(lista);
        double max = max(lista);

        /**Kod koji računa srednju vrijednost elemenata liste*/
        double suma = 0;
        for(Double x : lista){
                suma += x;
        }
        double average = (double)suma/lista.size();

        /**Kod koji računa varijansu elemenata liste*/
        double varijansa = 0;
        for(int i = 0; i < lista.size(); i++){
                varijansa += Math.pow(lista.get(i) - average,2);
        }

        /**Kod koji računa standardnu devijaciju elemnata liste*/
        double sd = Math.sqrt(varijansa/ lista.size());

        System.out.println("Najmanji element u listi je: " + min);
        System.out.println("Najveci element u listi je: " + max);
        System.out.println("Srednja vrijednost elemenata liste je: " + average);
        System.out.println("Standardna devijacija elemenata liste je: " + sd);

    }
}
