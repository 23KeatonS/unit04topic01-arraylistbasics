import java.util.ArrayList;

public class ArrayListUtilities {
    
    
    
    
    public static int getListMax(ArrayList<Integer> items) {
        int maxNum = items.get(0);
        for(int value: items){
            if (value>=maxNum){
                maxNum = value;
            }
        }

        return maxNum;
    }

    public static ArrayList<String> withoutLongWords(ArrayList<String> items){
        ArrayList<String> newList = new ArrayList<>();
        for(String word:items){
            if(word.length()<=5){
                newList.add(word);
            }
        }
        return newList;
    }

    public static void removeLongWords(ArrayList<String> items){
        /* 
        for(String word:items){
            if(word.length()>5){
                items.remove(word);
            }
        }
        */
        for(int i = 0;i<items.size();i++){
            if(items.get(i).length()>5){
                items.remove(i);
                i--;
            }
        }



    }


}