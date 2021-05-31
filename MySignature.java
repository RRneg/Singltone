package Singletone;

import javax.sound.midi.Soundbank;

public class MySignature {
    private static MySignature mySignature;
    private static String signature = "Minaiev";

    public static MySignature getMySignature(){
        if (mySignature == null){
            mySignature = new MySignature(signature);
        }
        return mySignature;
    }

    private MySignature(String sign){
        signature = sign;
    }

    public void sign (String document){
        System.out.println(document + " \n" + signature);
    }




}
