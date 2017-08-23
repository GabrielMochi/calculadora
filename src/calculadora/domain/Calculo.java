package calculadora.domain;

public class Calculo {
    
    private String formula;
    private String resultado;
    
    public Calculo(String formula, String resultado) {
        this.formula = formula;
        this.resultado = resultado;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
}
