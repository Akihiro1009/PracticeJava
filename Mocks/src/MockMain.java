import java.util.List;

public class MockMain {
    public static void main(String[] args) {
        List<String> list1 = List.of("Iwasaki ", "Akihiro", "Zama", "Miro", "Yamada", "Takeshi", "Yamada", "Taro", "Satou", "Jyunichi", "Tanaka", "Toshizou", "Donald", "Trump"); //7 people.


        Collection listName = new Collection();
        for(int j = 0; j < 14; j++) {
            listName.addItem(list1.get(j));
            System.out.println(listName);
        }
        System.out.println(listName);


        /*while (true){
            int n = 0;
            list.addItem(list1.get(n));
            System.out.println(list);
            n++;
            }
        */

        //how to change collection to Array


        for(int n = 0; n < 14; n++){
            //String[] CollectionName = new String[14];
            listName.resetNext();
            if (listName.isEmpty()){

            }
            //CollectionName[n] = listName.getNext();
            System.out.println(listName.current);
            //System.out.println(CollectionName);
        }


        String[] surName = new String[7];
        String[] firstName = new String[7];
        boolean name = true;

        for (int i = 0; i < 5; i++) {
            if (name) {
                System.out.println(i + ": this is true");
                name = false;
            } else {
                System.out.println(i + ": this is false");
                name = true;
            }
        }

    }
}
