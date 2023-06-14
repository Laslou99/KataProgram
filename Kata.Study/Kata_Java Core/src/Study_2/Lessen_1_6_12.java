package Study_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lessen_1_6_12 {

    public static void main(String[] args) {
        String[] roles_test = {"Городничий", "Аммос Федорович", };
        String[] textLine_test = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.\n" +
                "Аммос Федорович: Как ревизор?\n" +
                "Артемий Филиппович: Как ревизор?\n" +
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.\n" +
                "Аммос Федорович: Вот те на!\n" +
                "Артемий Филиппович: Вот не было заботы, так подай!\n" +
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        System.out.println(printTextPerRole(roles_test, textLine_test));
    }


    public static String printTextPerRole(String[] roles, String[] textLines) {
        Map<String, List<String>> roleToLines = new HashMap<>();
        for (String role : roles) {
            roleToLines.put(role, new ArrayList<>());
        }
        String currentRole = "";
        for (String textLine : textLines) {
            int colonIndex = textLine.indexOf(":");
            String role = textLine.substring(0, colonIndex);
            String text = textLine.substring(colonIndex + 2); // +2 без учета двоеточия и пробела
            if (roleToLines.containsKey(role)) {
                currentRole = role;
            } else {
                role = currentRole;
                text = textLine.trim();
            }
            roleToLines.get(role).add(text);
        }
        StringBuilder result = new StringBuilder();
        for (String role : roles) {
            result.append(role).append(":\n");
            List<String> lines = roleToLines.get(role);
            for (int i = 0; i < lines.size(); i++) {
                result.append(i + 1).append(") ").append(lines.get(i)).append("\n");
            }
            result.append("\n");
        }
        return result.toString();
    }
}
