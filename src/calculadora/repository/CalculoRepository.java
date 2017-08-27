package calculadora.repository;

import calculadora.domain.Calculo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CalculoRepository extends Repository {
    
    public CalculoRepository(String filePath) {
        super(filePath);
    }
    
    @Override
    public void salvar(Calculo[] calculos) throws IOException {
        Calculo[] calculosLidos  = carregar();

        try (Writer writer = new FileWriter(getFilePath())) {
            Calculo[] calculosTotais = new Calculo[calculosLidos.length + calculos.length];
            int i = 0;
            
            for (int j = 0; j < calculosLidos.length; j++, i++) {
                calculosTotais[i] = calculosLidos[j];
            }
            
            for (int j = 0; j < calculos.length; j++, i++) {
                calculosTotais[i] = calculos[j];
            }
            
            getGson().toJson(calculosTotais, writer);
        }
    }
    
    @Override
    public Calculo[] carregar() throws FileNotFoundException, IOException {
        try (Reader reader = new FileReader(getFilePath())) {
            Calculo[] calculos = getGson().fromJson(reader, Calculo[].class);
            
            if (calculos == null) {
                throw new IOException("ponteiro nulo");
            }
            
            return calculos;
        } catch (IOException e) {
            File file = new File(getFilePath());
            Calculo[] calculos;
            
            if (file.exists()) {
                try (Writer writer = new FileWriter(getFilePath())) {
                    calculos = new Calculo[0];
                    
                    getGson().toJson(calculos, writer);
                    return calculos;
                }
            } else if (file.createNewFile()) {
                try (Writer writer = new FileWriter(getFilePath())) {
                    calculos = new Calculo[0];
                    
                    getGson().toJson(calculos, writer);
                    return calculos;
                }
            }
            
            throw e;
        }
    }
    
}
