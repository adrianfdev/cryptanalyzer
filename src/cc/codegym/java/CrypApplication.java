package cc.codegym.java;

public class CrypApplication {

    public static void main(String[] args) {




//        Button 1 Encrypt
        ModeOneGivenKey givenKey = new ModeOneGivenKey(3);
        givenKey.cypher("encrypt this");


//        Button 2 Decrypt
        givenKey.deCypher("decipher this");


//        Button 3 Brute Force
        ModeTwoNonGivenKey ngk = new ModeTwoNonGivenKey();
        String force = ngk.bruteForce("Hello");
        System.out.println(force);

//        Button 4 Statistical Analysis
        String analysis = ngk.statisticalAnalysis("Hello");
        System.out.println(analysis);

    }
}
