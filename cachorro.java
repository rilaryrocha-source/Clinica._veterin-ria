public class cachorro extends animal {

    private String Pelagem;
    private int Patas;

    public cachorro(String Nome, String Especie, int Idade, String Pelagem, int Patas) {
        super(Nome, Especie, Idade);
        this.Pelagem = Pelagem;
        this.Patas = Patas;
    }

    @Override
    public void exibirInformações() {
        System.out.println("====CACHORRO====");
        System.out.println("Nome:" + Nome);
        System.out.println("Especie:" + Especie);
        System.out.println("Idade:" + Idade);
        System.out.println("Tipo de Pelagem" + Pelagem);
        System.out.println("Quantidade de Patas:" + Patas);
    }
}
