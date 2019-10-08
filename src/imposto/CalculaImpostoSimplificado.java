public static class ImpostoSimplificado{ //simplificado
    
    private static ImpostoSimplificado  instance;
 
    private ImpostoSimplificado() {
        
    }
 
    public static synchronized CalculaImpostoSimplificado getInstance() {
        if (instance == null)
            instance = new CalculaImpostoSimplificado();
        return instance;
    }

    public void float calculaImpostoSimplificado(float baseCalculo){
        if baseCalculo < 0 throw Exception();
        else if baseCalculo <= 12000 return baseCalculo;
        else if baseCalculo > 12000 && baseCalculo < 24000 return 1.15 * baseCalculo;
        else return 1.27 * baseCalculo;
    }
}