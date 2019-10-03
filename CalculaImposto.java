public static class CalculaImpostoSimplificado{ //simplificado
    public static float aplicaImpostoSimplificado(float baseCalculo){
        if baseCalculo < 0 throw Exception();
        else if baseCalculo <= 12000 return baseCalculo;
        else if baseCalculo > 12000 && baseCalculo < 24000 return baseCalculo * 1.15
        else return baseCalculo * 1.27; 
    }

}