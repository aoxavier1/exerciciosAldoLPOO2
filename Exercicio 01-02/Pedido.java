public class Pedido{
  String codigo;
  String nome;
  String descricao;
  String modificar;
  String modificar2;

public Pedido(){}

public Pedido (String codigo, String nome, String descricao){
  this.codigo = codigo;
  this.nome = nome;
  this.descricao = descricao;

}

public String getnome(){
  return nome;
}

public String getcodigo(){
  return codigo;
}

public String getdescricao(){
  return descricao;
}

public String getmodificar(){
  return modificar;
}

public String getmodificar2(){
  return modificar2;
}

public void setmodificar2(String modificar2) {
this.modificar2 = descricao;
}

public void setcodigo(String codigo) {
this.codigo = codigo;
}

public void setnome(String nome) {
this.nome = nome;
}

public void setdescricao(String descricao) {
this.descricao = descricao;
}

public void setmodificar(String modificar){
  this.modificar = nome;
}

}

