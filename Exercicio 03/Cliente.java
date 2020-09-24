public class Cliente{
  int CodigoCliente;
  String NomeCliente;

public Cliente(){}

public Cliente (int CodigoCliente, String NomeCliente){
  this.CodigoCliente = CodigoCliente;
  this.NomeCliente = NomeCliente;
}

public int getCodigoCliente(){
  return CodigoCliente;
}

public String getNomeCliente(){
  return NomeCliente;
}

public void setCodigoCliente(int CodigoCliente){
  this.CodigoCliente = CodigoCliente;
}

public void setNomeCliente(String NomeCliente){
  this.NomeCliente = NomeCliente;

}


}