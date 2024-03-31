package co.edu.icesi.viajes.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import co.edu.icesi.viajes.domain.DestinationCategory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

@SpringBootTest
public class TestDestinationCategory {

    @Autowired
    private DestinationCategoryService destinationCategoryService;
 
    @Test
    void debeRetornarListaDeDestinationCategory(){
        List<DestinationCategory> lstDestinationCategory = destinationCategoryService.findAll();
        
        System.out.println("\nTEST 1 Dest Cat\n");
        System.out.println("Destination Categories:");
        
        for(DestinationCategory destinationCategory: lstDestinationCategory){
            System.out.println(destinationCategory.getCode() +" - "+destinationCategory.getName());
        }
        System.out.println("");

    }
    
    
}