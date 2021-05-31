package Singletone;

public class DocBuro {
    public static void main(String[] args) {
        String doc = "bla-bla-bla";
        MySignature.getMySignature().sign(doc);
    }
}
