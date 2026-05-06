package nascimentolucas.dev.maratonajava.javacore.Pwapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        //tipos primitivos
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

        //wrappers
        Byte byteW = 127;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatw = 10F;
        Double  dooubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; // unboxing
        Integer  intw2 = Integer.parseInt("1"); // converte string para numero

    }
}
