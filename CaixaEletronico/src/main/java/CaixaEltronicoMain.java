
import caixaEletronico.business.CaixaEletronico;
import caixaEletronico.model.Cliente;
import caixaEletronico.model.Notas;

public class CaixaEltronicoMain {
    
     public static void main (String[] a)  {   
        
       Cliente cliente = new Cliente();
       CaixaEletronico caixaEletronico = new CaixaEletronico();
       
       cliente.setValor(550);
       
       Notas retornoCaixa = caixaEletronico.fazerSeparacaoDeNotas(cliente.getValorSolicitado());
       
       if(retornoCaixa == null){
           System.out.println("O Caixa Encotrou um erro ao Separar seu dinheiro");
       }else{
           System.out.println("Notas entregues:\n Nota de 100:"+retornoCaixa.getNota100()+"\n Nota de 50:"+retornoCaixa.getNota50()+"\n  Nota de 20:"+retornoCaixa.getNota20()+"\n Nota de 10:"+retornoCaixa.getNota10()+"\n Nota de 5:"+retornoCaixa.getNota5()+"\n Nota de 2:"+retornoCaixa.getNota2());
       }
       
     }
}
