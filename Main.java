
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(isValid("[({})]"));
    }
    public static boolean isValid(String kurung){
        Stack<String> stackKurung = new Stack<>();
        for (int i = 0; i < kurung.length(); i++) {
            String character = String.valueOf(kurung.charAt(i));
            if (cekKurung(character)){
                stackKurung.push(character);
            }
            else{
                if (!cekCocok(stackKurung.pop(), character)){
                    return false;
                }
            }
        }
        if (!stackKurung.isEmpty()){
            return  false;
        }
    return true;
    }
    public static boolean cekKurung(String kurung) {
        if (kurung.equals("{")||kurung.equals("(")||kurung.equals("[")) {
            return true;
        }
            return false;
        
    }
    public static boolean cekCocok(String kurung, String kurung2){
        if (kurung.equals("{") && kurung2.equals ("}")) {
            return true;

        } else if(kurung.equals("(") && kurung2.equals (")")){
            return true;

        } else if(kurung.equals("[") && kurung2.equals ("]")){
            return true;

        }
            return false;

    }
}
