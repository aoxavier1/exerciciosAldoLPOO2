class Main {
  public static void main(String[] args) {
          
        //COMANDOS CLASSE PEDIDO
      
        Pedido p1 = new Pedido("Marco", "Cancelado");
        p1.status();
        
        System.out.println("----------------");
        
        Pedido p2 = new Pedido("Arthur", "Em andamento");
        p2.status(); 
        
        
        //COMANDOS DA CLASSE CLIENTE
        System.out.println("-----------------");
        
        Cliente c1 = new Cliente(2);
            c1.setNomeCompleto("Marco Antonio");
            c1.status();
        
        System.out.println("-----------------");
        
        Cliente c2 = new Cliente(3);
            c2.setNomeCompleto("Geovanna Ferreira Dos Santos");
            System.out.println(c2.getNomeCompleto());
            System.out.println(c2.getCodigo());
        
        Cliente c3 = new Cliente(4);
            c3.setNomeCompleto("Arthur Olvieira Xavier");
            System.out.println(c3.getNomeCompleto());
            System.out.println(c3.getCodigo());
        
             
        
              
    }
}