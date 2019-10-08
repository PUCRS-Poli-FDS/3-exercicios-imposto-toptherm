public static class CalculaImpostoCompleto{ //completo
    
    private static CalculaImpostoCompleto  instance;
 
    private CalculaImpostoSimplificado() {
        
    }
 
    public static synchronized CalculaImpostoCompleto getInstance() {
        if (instance == null)
            instance = new CalculaImpostoCompleto();
        return instance;
    }

    public void float CalculaImpostoCompleto(float baseCalculo){
        if baseCalculo < 0 throw Exception();
        else if baseCalculo <= 12000 return baseCalculo;
        else if baseCalculo > 12000 && baseCalculo < 24000 return baseCalculo * 1.15
        else return baseCalculo * 1.27; 
    }

}