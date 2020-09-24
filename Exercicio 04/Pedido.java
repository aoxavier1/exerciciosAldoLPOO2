public class Pedido {
    public String nome_cliente;
    public String descricao_pedido;
    public int codigo_pedido;
    public String cor;
    public boolean tampada;
    

 public Pedido (String n , String d){
        this.setModNomeCliente(n);
        this.setModDescricao(d);

    }
  
    public String getModNomeCliente (){
        return this.nome_cliente;
}
    public void setModNomeCliente(String nome){
        this.nome_cliente = nome;
}
    public String getModDescricao(){
        return this.descricao_pedido;
    }
    

    public void setModDescricao(String descricao) {
        this.descricao_pedido = descricao;

    }
    public void status (){
        System.out.println("DETALHES DO PEDIDO");
        System.out.println("Nome: " + this.nome_cliente);
        System.out.println("Descrição: " + this.descricao_pedido);
}
    public void inserirNome (String n){
        this.setModNomeCliente(n);
            
    }

    public void tampar(){
        this.tampada = true;
    }
    public void cor(){
        this.cor = "AZUL";
    } 

}
