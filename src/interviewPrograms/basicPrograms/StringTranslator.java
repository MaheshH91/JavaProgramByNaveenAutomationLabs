package interviewPrograms.basicPrograms;

import java.util.HashMap;
import java.util.Map;

public class StringTranslator {

    private static final Map<String, String> dictionary = new HashMap<>();

    static {
        dictionary.put("Hello Mahesh", "Hola Mahesh");
        dictionary.put("Good morning", "Buenos días");
        dictionary.put("How are you?", "¿Cómo estás?");
        dictionary.put("I'm fine", "Estoy bien");
        dictionary.put("Hello Team I need help in Java", "Hola equipo, necesito ayuda con Java.");
    }

    public static String translate(String input) {
        return dictionary.getOrDefault(input, "[Translation not found]");
    }

    public static void main(String[] args) {
        System.out.println(translate("Hello Mahesh"));
        System.out.println(translate("Good morning"));
        System.out.println(translate("How are you?"));
        System.out.println(translate("I'm fine"));
        System.out.println(translate("Hello Team I need help in Java"));
    }
}