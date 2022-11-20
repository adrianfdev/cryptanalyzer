package cc.codegym.java;



public class ModeTwoNonGivenKey {




    private final String ALPHABET = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz.,\"\":-!? ";
    private int cypherKey = 0;


    public ModeTwoNonGivenKey(){
//            this.cypherKey = cypherKey;

    }


    public String bruteForce(String text){


        StringBuilder builder = new StringBuilder();
//        for(int i = 0; i < ALPHABET.length(); i++){
        //loop through each character in passed in string
                int cypherKey = ALPHABET.indexOf("A");
            for(int i=0; i < text.length(); i++) {
//                int a =  (ALPHABET.charAt(i));
                //add the int key to the char index and return value


                char a = (char) (text.charAt(i) + (1));
                char c = (char) (text.charAt(i) + cypherKey);
                builder.append(c);
                System.out.println(a);
            }return builder.toString();

        }


//    }

    public String statisticalAnalysis(String text){

        //

        return text;
    }



}
