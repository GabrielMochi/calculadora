package calculadora.controller;

import calculadora.domain.Calculo;

public class CacheController {
    
    private Calculo[] calculos;
    private int lastIndexSelected;
    private boolean lastCalculoHasBeenCalled;

    public CacheController() {
        calculos = new Calculo[0];
        this.lastCalculoHasBeenCalled = false;
    }

    public CacheController(Calculo[] calculos) {
        this.calculos = calculos;
        this.lastCalculoHasBeenCalled = false;
    }
    
    public void addCalculo(Calculo calculo) {
        Calculo[] calculosTemp = this.calculos;
        this.calculos = new Calculo[calculosTemp.length + 1];
        
        System.arraycopy(calculosTemp, 0, this.calculos, 0, calculosTemp.length);
        
        this.calculos[this.calculos.length - 1] = calculo;
    }
    
    public Calculo getCalculo(int i) throws Exception {
        try {
            Calculo calculo = this.calculos[i];
            setLastIndexSelected(i);
            return calculo;
        } catch (Exception e) {
            throw new Exception("Index fora de alcance. Index existente entre 0 e " + String.valueOf(this.calculos.length - 1)
                                + " : " + e);
        }
    }
    
    public Calculo getPreviousCalculo() {
        try {
            Calculo calculo;
            
            if (lastCalculoHasBeenCalled) {
                calculo = this.calculos[this.lastIndexSelected - 1];
                setLastIndexSelected(this.lastIndexSelected - 1);
                return calculo;
            }
            
            calculo = getLastCalculo();
            return calculo;
        } catch (Exception e) {
            return null;
        }
    }
    
    public Calculo getNextCalculo() {
        try {
            Calculo calculo;
            
            if (lastCalculoHasBeenCalled) {
                calculo = this.calculos[this.lastIndexSelected + 1];
                setLastIndexSelected(this.lastIndexSelected + 1);
                return calculo;
            }
            
            return null;
        } catch (Exception e) {
            return null;
        }
    }
    
    public Calculo getLastCalculo() {
        setLastCalculoHasBeenCalled(true);
        setLastIndexSelected(this.calculos.length - 1);
        return this.calculos[this.calculos.length - 1];
    }
    
    public void removeLastCalculo() {
        Calculo[] calculosTemp = this.calculos;
        this.calculos = new Calculo[calculosTemp.length - 1];
        
        System.arraycopy(calculosTemp, 0, this.calculos, 0, this.calculos.length);
    }
    
    public void printCalculos() {
        for (Calculo calculo : calculos) {
            System.out.println(calculo);
        }
    }

    public Calculo[] getCalculos() {
        return calculos;
    }

    public void setCalculos(Calculo[] calculos) {
        this.calculos = calculos;
    }

    public int getLastIndexSelected() {
        this.lastCalculoHasBeenCalled = true;
        return lastIndexSelected;
    }

    public void setLastIndexSelected(int lastSelected) {
        this.lastIndexSelected = lastSelected;
    }

    public boolean isLastCalculoHasBeenCalled() {
        return lastCalculoHasBeenCalled;
    }

    public void setLastCalculoHasBeenCalled(boolean lastCalculoHasBeenCalled) {
        this.lastCalculoHasBeenCalled = lastCalculoHasBeenCalled;
    }
    
}
