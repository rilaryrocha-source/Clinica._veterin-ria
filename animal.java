public class animal {
    protected String Nome;
    protected int Idade;

    public animal(String Nome,int Idade){
        this.Nome= Nome;
        this.Idade = Idade;
    }

    public void exibirInformacoes(){
        System.out.println("Nome:"+ Nome);
        System.out.println("Idade:"+ Idade);
    }

}