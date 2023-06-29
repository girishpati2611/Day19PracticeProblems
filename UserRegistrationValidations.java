package Regex.java;

import java.util.regex.Pattern;

public class UserRegistrationValidations {
    public static void main(String[] args) {
        System.out.println("First name of user must be started with Capital letter and after that minimum 3 chacarters should be there.");
        System.out.println(Pattern.matches("[A-Z]{1}[a-z]{3,}","Girish"));

        System.out.println("Last name of user must be started with Capital letter and after that minimum 3 chacarters should be there.");
        System.out.println(Pattern.matches("[A-Z]{1}[a-z]{3,}","Patil"));

        //E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl
        //& co) and 2 optional (xyz & in) with
        //precise @ and . positions
        System.out.println(Pattern.matches("[abc]{3}[.]{1}[a-z]{3,}[@]{1}[bl]{2}[.]{1}[co]{2}[.]{1}[a-z]{2,}","abc.girish@bl.co.com"));
        //As a User need to
        //follow pre-defined
        //Mobile Format - E.g. 91 9919819801 - Country code follow by space and 10 digit number
        System.out.println(Pattern.matches("[91]{2}[ ]{1}[0-9]{10}","91 7057375120"));
        //As a User need to
        //follow pre-defined Password rules.
        //Rule1
        //– minimum 8 Characters
        //Rule2
        //– Should have at least 1 Upper Case
        //Rule3
        //– Should have at least 1 numeric number in the password
        //Rule4 –
        // Has exactly 1 Special Character
        System.out.println(Pattern.matches("[[A-Z]{1,}[0-9]{1,}[!@#$%*]{1}[a-z]{4,}]{8,}","Girish@12"));
    }
}
