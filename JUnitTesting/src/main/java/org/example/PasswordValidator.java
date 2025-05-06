package org.example;

import java.util.regex.*;

public class PasswordValidator {
    boolean validate(String inp){
        String regex = "(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}";//(?=.*[A-Z])(?=.*[0-9])
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inp);
        return matcher.matches();
    }
}
