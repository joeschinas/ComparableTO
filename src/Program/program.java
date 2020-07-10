
package Program;

import entidades.Product;
import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


import service.CalculationService;


public class program {
    public static void main(String[] args){
    
        Scanner read = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();
        String arq = "C:\\arquivos\\arqs.txt";
        File path = new File(arq);
        
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
        
            String line;
            while((line=br.readLine()) != null){
            String[] camp = line.split(",");
            list.add(new Product(camp[0], Double.parseDouble(camp[1])));
            
        }
        Product x = CalculationService.max(list);
            System.out.println("Preço maximo : ");
            System.out.println(x.ToString());
        
        
        
        } catch (IOException erro) {
            System.out.println("erro : "+erro.getMessage());
        }
    }
}
