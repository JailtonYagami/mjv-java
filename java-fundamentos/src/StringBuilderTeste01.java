public class StringBuilderTeste01 {

    public static void main(String[] args) {

        String nome = "Jailton gilberto";
        nome.concat(" MJV");
        System.out.println(nome);
        //StringBuilder sb = new StringBuilder(16);
        StringBuilder sb2 = new StringBuilder("Jailton gilberto | ");
        sb2.append("MJV").append(" Scholls");
        sb2.reverse();
        sb2.reverse();
        sb2.delete(0, 3);// começa na posicao 0 e a final é exclusiva : é o final - 1;
        System.out.println(sb2);

        StringBuilder nomes = new StringBuilder();
        nomes.append("Carlos>").append("Maria>").append("José>").append("Renata");

        System.out.println(nomes.toString());

    }

}
