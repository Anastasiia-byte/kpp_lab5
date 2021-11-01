package com.company;

public class TextManager {
    public static String replace(String text) throws Exception {
        if(text.equals(""))
            throw new Exception("Empty string");
        String result =  text.replaceAll("\\b([aA]|[ioIO]n|[Tt]he|[Oo]r|[aA]re|[Oo]ut)\\b", "").replaceAll(" +", " ");
        if(result.equals(text)){
            System.out.println("\nNo changes have been done.");
        }
        return result;
    }

}
