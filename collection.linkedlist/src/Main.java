import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> numbers=new LinkedList<>();
        numbers.add("abebe");
        numbers.add("henok");
        numbers.add("abel");
        System.out.println(numbers);
        String numb= String.valueOf(numbers.remove("abebe"));
        System.out.println("the removed elemnet is:" + numb);
        System.out.println("list:" + numbers);
        String no= numbers.remove(0);
        System.out.println("List:" +  numbers);
        numbers.add(1,"Belete");
        System.out.println("the updated names are:"+  numbers);
        String str=numbers.get(1);
        System.out.println(str);
    }
}