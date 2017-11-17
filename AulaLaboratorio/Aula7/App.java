import java.io.*;
import java.util.*;

class App{
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufRead = new BufferedReader(isr);
        String text = null;
        Map<String, Integer> mp = new HashMap<String, Integer>();
        mp.clear();
        boolean flag = true;
        try{
            while(flag && (text = bufRead.readLine()) != null){
                String[] str = text.split(" "); 
                for(int i=0;i<str.length;i++){
                    str[i] = str[i].toLowerCase();
                }
                for(int i=0;i<str.length;i++){
                    if(Objects.equals(str[i] ,"end")){
                        flag = false;
                        break;
                    }
                        
                    int count = mp.containsKey(str[i]) ? mp.get(str[i]) : 0;
mp.put(str[i], count + 1);
                    mp.put(str[i], count+1);
                }
            }
        }catch (Exception e){
            System.out.println("Deu ruim");
            e.printStackTrace();
        }
        mp = MapUtil.sortByValue(mp);
        System.out.println("");
        System.out.println("TOP 10");
        int cnttmp = 0;
        for (Map.Entry<String, Integer> entry : mp.entrySet()){
            if(++cnttmp > 10)
                break;
            if(entry.getKey() == "\n")
                continue;
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        
        System.out.println();
        MapUtil.printRandomText(mp);
        System.out.println();
    }
}