public static class ImpostoCompleto{ 
    
    private static CalculaImpostoCompleto  instance;
 
    private CalculaImpostoCompleto() {
        
    }
 
    public static synchronized CalculaImpostoCompleto getInstance() {
        if (instance == null)
            instance = new CalculaImpostoCompleto();
        return instance;
    }

    public void float calculaImpostoCompleto(BigDecimal totalRendimentos ,int nDependentes, Integer idade){
        if (idade < 65){
            if (nDependetes <= 2) return  1.02;
            else if (nDependentes <= 3 && nDependentes >= 5) return totalRendimentos * 1.035
            else return 1.05;
        }
        else{
            if (nDependetes <= 2) return  totalRendimentos * 1.03;
            else if (nDependentes <= 3 && nDependentes >= 5) return totalRendimentos * 1.045;
            else return totalRendimentos * 1.06;
        }
    }

    

}