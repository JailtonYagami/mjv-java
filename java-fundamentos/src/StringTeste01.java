public class StringTeste01 {

    public static void main(String[] args) {

        //É uma classe que vai trabalhar

        String nome = "Joao";// String constant poll
        String nome2 = "Joao";
        nome = nome.concat(" Pedro"); // nome += " Pedro";
        System.out.println(nome);
        System.out.println((nome == nome2));

        String nome3 = new String("Joao");//1 variavel de referencia, 2 um objeto do tipo string , 3 umas string no pool de string

        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());

        //--------------------------------------------------

    }
}
