package calculadora.repository;

public class CalculoRepository {
    
    private String filePath;

    public CalculoRepository(String filePath) {
        this.filePath = filePath;
    }
    
    public void salvar() {
        
    }
    
    public void carregar() {
        
    }
    
    

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    
}
