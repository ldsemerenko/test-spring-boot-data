package test.spring.service;

import test.spring.Enum.Nationality;
import test.spring.domain.Users;

public class UserGenerator {
    public Users generateUser(){
        Users users = new Users();
            users.setNationality(getRandNat());
            users.setAge(getRandAge(18, 55));
            users.setSex(getRandSex());
            users.setPass(getRandPass(10));
            users.setId(getUniqueId());
        return users;
    }

    Nationality getRandNat(){
        Nationality[] nationalities = Nationality.values();
        return nationalities[(int) (Math.random() * 5)];
    }

    int getRandAge(int min, int max){
        return (int) (Math.random() * (max - min + 1) + min);
    }

    String getRandSex(){
        return Math.random() >= 0.5 ? "male" : "female";
    }

    String getRandPass(int keyLength){
        String characterSet = "`1234567890-=~!@#$%^&*()_+QWERTYUIOP{}qwertyuiop[]asdfghjkl;ASDFGHJKL:'zxcvbnm./>ZXCVBNM?*";
        StringBuilder s = new StringBuilder();
        for (int j = 0; j < keyLength; j++) {
            s.append(characterSet.charAt(Math.abs((int) (Math.random() * characterSet.length()))));
        }
        return s.toString();
    }

    Long getUniqueId(){
        return Math.abs(System.nanoTime() * System.currentTimeMillis() * (long) (Math.random() * 10_000_000_00));
    }
}
