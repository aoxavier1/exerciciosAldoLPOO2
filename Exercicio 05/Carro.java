public class Carros {
    int precototal;
    
    Pneus GTR = new Pneus(2400, "Esportivo", "Yokohama");
    Pneus 350z = new Pneus(2000, "Esportivo", "Firestone");
    Pneus Posher = new Pneus(2400,"Esportivo", "Toyotires");
    
    Motor NissanM = new Motor(40000, 608, "Nissam Turbo 3.8 Otto V");
    Motor HondaM = new Motor(30000, 270, "Honda Turbo 2.5 Otto V");
    Motor SubaruM = new Motor(46000, 155, "Subaro Turbo 3.4 Box");
    
    Bancos NissanB = new Bancos(1500,"Esportivo 4 pontos", "Sparco");
    Bancos HondaB = new Bancos(1500,"Esportivo 4 pontos", "Sparco");
    Bancos SubaruB = new Bancos(1500,"Esportivo 4 pontos", "Sparco");
    

    
    public int preçototal(){
        if(Nissan.precotototal){
            precototal = NissanP.preco+NissanM.preco+NissanB.preco;
            return precototal;
            
        }
        else if(Subaru.preçototal){     
            precototal = HondaP.preco+HondaM.preco+HondaB.preco;
            return precototal;
        }
        
        else{ 
            precototal = SubaruP.preco+SubaruM.preco+SubaruB.preco;
            return precototal;
        }
    }
}
     
   