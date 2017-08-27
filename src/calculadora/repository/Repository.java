package calculadora.repository;

import calculadora.domain.Calculo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class Repository {
    
    private String filePath;
    private final Gson gson;

    public Repository(String filePath) {
        this.filePath = filePath;
        this.gson = new GsonBuilder().setPrettyPrinting().create();
    }
    
    public abstract void salvar(Calculo[] calculos) throws IOException;
    
    public abstract Calculo[] carregar() throws FileNotFoundException, IOException;

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Gson getGson() {
        return gson;
    }
    
}
