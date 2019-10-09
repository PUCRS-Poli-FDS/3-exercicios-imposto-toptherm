package imposto;

import java.math.BigDecimal;

public class ImpostoCompleto {
    
    private static ImpostoCompleto instance;
 
    private ImpostoCompleto() {
        
    }
 
    public static synchronized ImpostoCompleto getInstance() {
        if (instance == null)
            instance = new ImpostoCompleto();
        return instance;
    }

    public BigDecimal calculaImpostoCompleto(BigDecimal totalRendimentos , int nDependentes, Integer idade){
        if (idade < 65){
            if (nDependentes <= 2) return  BigDecimal.valueOf(1.02);
            else if (nDependentes <= 3 || nDependentes >= 5) return totalRendimentos.multiply(BigDecimal.valueOf(1.035));
            else return BigDecimal.valueOf(1.05);
        }
        else{
            if (nDependentes <= 2) return  totalRendimentos.multiply(BigDecimal.valueOf(1.03));
            else if (nDependentes <= 3 || nDependentes >= 5) return totalRendimentos.multiply(BigDecimal.valueOf(1.045));
            else return totalRendimentos.multiply(BigDecimal.valueOf(1.06));
        }
    }

}