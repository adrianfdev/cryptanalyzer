package cc.codegym.java;


public class ModeOneGivenKey {


    private int cypherKey;



    public ModeOneGivenKey(int cypherKey){
        this.cypherKey = cypherKey;

    }


    public String cypher(String text) {
        StringBuilder builder = new StringBuilder();

        //loop through each character in passed in string
            for(int i=0; i < text.length(); i++){
                //add the int key to the char index and return value
                char c = (char) (text.charAt(i) + cypherKey);
                builder.append(c);

        } return builder.toString();
    }

    public String deCypher(String text){
        StringBuilder builder = new StringBuilder();
        //loop through each character in passed in string
        for(int i=0; i < text.length(); i++){
            //add the key to the character returned at specified index
            char c = (char) (text.charAt(i) + cypherKey);
            builder.append(c);

        } return builder.toString();
       }

}



