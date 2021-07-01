package org.example;

public class StringManipulation {
    public int vowelCount(String name) {
        int count1 = 0;

        for (int i = 0; i < name.length(); i++) {
            char temp = name.charAt(i);
            if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u'||temp=='A'||temp=='E'||temp=='I'||temp=='O'||temp=='U') {
                count1++;
            }
        }
        return count1;
    }

    public int characterCount(String s) {
        return s.length();
    }
}

