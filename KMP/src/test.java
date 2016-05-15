import java.util.*; 
public class test { 
    public String shortestCommon(String s1, String s2) { 
        String res = "impossible"; 
        StringBuffer sb1 = new StringBuffer(s1); 
        StringBuffer sb2 = new StringBuffer(s2); 
        String start = ""; 
        String finish = ""; 
        while (sb1.length() > 0 && sb2.length() > 0 && sb1.charAt(0) == sb2.charAt(0) 
                && sb1.charAt(0) != '*' && sb2.charAt(0) != '*') { 
            start += sb1.charAt(0); 
            sb1.deleteCharAt(0); 
            sb2.deleteCharAt(0); 

        } 
        if (sb1.charAt(0) != '*' && sb2.charAt(0) != '*') 
            return "impossible"; 
        while (sb1.length() > 0 && sb2.length() > 0 && sb1.charAt(sb1.length() - 1) == sb2.charAt(sb2.length() - 1) 
                && sb1.charAt(sb1.length() - 1) != '*' && sb2.charAt(sb2.length() - 1) != '*') { 
            finish = sb1.charAt(sb1.length() - 1) + finish; 
            sb1.deleteCharAt(sb1.length() - 1); 
            sb2.deleteCharAt(sb2.length() - 1); 
        } 
        if (sb1.charAt(sb1.length() - 1) != '*' && 
            sb2.charAt(sb2.length() - 1) != '*') 
            return "impossible"; 
        if (sb2.length() == 1) { 
            return s1.replaceAll("\\*", ""); 
        } 
        if (sb1.length() == 1) { 
            return s2.replaceAll("\\*", ""); 
        } 
        String st1, st2; 
        if (sb1.charAt(0) == '*') { 
            st1 = sb2.toString().replaceAll("\\*", ""); 
            st2 = sb1.toString().replaceAll("\\*", ""); 
        } else { 
            st1 = sb1.toString().replaceAll("\\*", ""); 
            st2 = sb2.toString().replaceAll("\\*", ""); 
        } 
        int i; 
        for (i = 0; i < st1.length(); i++) { 
            String st = st1.substring(i); 
            if (st2.startsWith(st)) { 
                res = start; 
                res += st1.substring(0, i); 
                res += st2; 
                res += finish; 
                return res; 
            } 
        } 
        res = start; 
        res += st1; 
        res += st2; 
        res += finish; 
        return res; 
    } 

} 