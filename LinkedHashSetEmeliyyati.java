package arraylist;

import java.util.LinkedHashSet;

public class LinkedHashSetEmeliyyati {

    public static void main(String[] args) {


        LinkedHashSet<String> hefteGunleri = new LinkedHashSet<>();
        hefteGunleri.add("Bazar ertəsi");
        hefteGunleri.add("Çərşənbə");
        hefteGunleri.add("Cümə");
        hefteGunleri.add("Çərşənbə");
        System.out.println(hefteGunleri);
        System.out.println("LinkedHashSet unik oldugu ucun tekrar element elave olunmadi Lakin Ardicilliq qorundugu");


    }


}
