import java.util.*;

/**
 * Penulis : Victorio Cristiansa Putra  02/06/2023
 * File    :  LambdaHashmap.java
 * Deskripsi: Program yang menggunakan Generic untuk pasangan Key-Value
*/

public class LambdaHashmap {
    public static void main(String[] args){
        Map<Long, String> map = new HashMap<Long, String>();
        map.put(24060121130084L, "Victorio Cristiansa Putra");
        map.put(24060123120076L, "Dimitri Gorgon");
        map.put(24060123130091L, "Marcel Sabitzer");

        //Implementasi Ekspresi Lambda
        map.forEach((i, j) -> {
            System.out.print(i + " " + map.get(i));
            System.out.println(" ");}
        );
    }
}