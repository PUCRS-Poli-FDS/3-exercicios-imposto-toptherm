public static class CalculaImpostoSimplificado{ //simplificado
    

    private static CalculaImpostoSimplificado  instance;
 
    private CalculaImpostoSimplificado() {
        
    }
 
    public static synchronized CalculaImpostoSimplificado getInstance() {
        if (instance == null)
            instance = new CalculaImpostoSimplificado();
        return instance;
    }

    public void float aplicaImpostoSimplificado(float baseCalculo){
        if baseCalculo < 0 throw Exception();
        else if baseCalculo <= 12000 return baseCalculo;
        else if baseCalculo > 12000 && baseCalculo < 24000 return baseCalculo * 1.15
        else return baseCalculo * 1.27; 
    }
}