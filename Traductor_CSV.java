/*
 * Copyright (C) 2017 ADMINISTRACION2
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package traductor_bigb;
import com.opencsv.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author JORGE (@IndieAiden)
 */



public class Traductor_CSV {
    
    //Creación de variables
    private final char SEPARADOR = ';';
    private final char COMILLAS = '"';
    private final String path1 = "";
    private final String path2 = "";
    private String[] nombres;
    File CSVCat;
    File CSVProd;
    
    
    //Constructor
    Traductor_CSV(String Path1, String Path2) {
        
        String[] nombre = null;
        CSVCat = new File(Path1);
        CSVProd = new File(Path2);      
    }
    
    
    //Método run
    
    public void run () {
        //Do Stuff  º
        LeerCSV(CSVCat, CSVProd);
    }
 
    //Métodos a implementar
    
    void CompararColumnas(String columnaProd, String columnaCat) throws FileNotFoundException, IOException{
        //Le digo el separador que hay y hago un split de las columnas. Eso se mete en un array de strings
        String [] subCategorias = columnaProd.split(",");
        //Ahora uno por uno voy comparando la columna de las categorías que tengo con cada separación. 
        for(int i=0; i< subCategorias.length ;i++){
            if(subCategorias[i].matches(columnaCat)){
            nombres[i]=subCategorias[i];}
        }
        CrearCSV(nombres);
    }
    
    
    //// Todo este lo he hecho a última hora y no sé si va a explotar. Revisar mañana 16/08/2017
    
    void CrearCSV (String[] nombres) throws FileNotFoundException, IOException{
        File CSVProdCopia = new File("CSVProdCopia.csv");
        CSVWriter in = new CSVWriter (new FileWriter(CSVProdCopia),';');
        CSVReader out = new CSVReader(new FileReader(CSVProd), SEPARADOR, COMILLAS);
        
        String[] linealeida = null;
        
        int inicio=0; 
       while ( (linealeida = out.readNext())!= null){
           
           for (int i=0; i<nombres.length; i++){
           if (inicio==0){
               linealeida[linealeida.length+1].concat("NOMBRES");
               inicio++;
           }
           linealeida[linealeida.length+1].concat(nombres[i]);
           linealeida[linealeida.length+1].concat(",");
           }
           in.writeNext(linealeida);
       }
    }
    
    
        //Una vez tengo los archivos listos 
          // Abrir los csv.

    /**
     *  Este método lee los CSV que se le pasan por parámetro. Además, guarda dentro del array de Strings 
     *  "nombres" los nombres de las categorías que van llegando.
     * @param CSVCat
     * @param CSVProd
     */
    public void LeerCSV(File CSVCat, File CSVProd){  
            //Creo un objeto de la clase FileReader que me hace falta para los CSVReader
        CSVReader lectorCat = null;
        CSVReader lectorProd = null;
        //Vamos a intentar abrirlos y operar con ellos 
   
        try {
            
        lectorCat = new CSVReader(new FileReader(CSVCat), SEPARADOR, COMILLAS);
        lectorProd = new CSVReader(new FileReader(CSVProd), SEPARADOR, COMILLAS);
       
        //Definimos el String de la línea leída
        String [] lineaCat = null;
        String [] lineaProd = null;
        
            try{
                    //Lee las líneas del CSV de PRODUCTOS primero y las pone en lineaProd []
                    
                 int MaxProd = 0; 
                 int MaxCat = 0;
                
                 
                    while ((lineaProd = lectorProd.readNext())!= null){  
                    System.out.println(lineaProd[3].toString()+ " ARCHIVO2");
                    System.out.println(MaxProd);
                    MaxProd++;
                    
                    //Lee las líneas del CSV de CATEGORIAS cada vez que se lee una nueva de PRODUCTOS y lo pone en lineaCat[]
                    while ((lineaCat = lectorCat.readNext())!= null) { 
                     System.out.println(lineaCat[0].toString() + " ARCHIVO1");
                         System.out.println(MaxCat);
                         MaxCat++;
                         //Comparo cada columna con su correspondiente
                         CompararColumnas (lineaProd[3], lineaCat[0]);
                        
                    }
                    //Cierro el lector y creo otro para que me vuelva a entrar en el bucle en cada iteración.
                  lectorCat.close();
                  lectorCat = new CSVReader(new FileReader(CSVCat), SEPARADOR, COMILLAS);
                  
                 }
                 
                    // Operaciones con los CSV
                    /*
                    *   Cada LineaCat[i] es una de las columnas. Empiezan en la 0. Se puede operar con ellas. Son strings, pero JIC
                    *   se pone el "toString".
                    */
                    /*
                     for (int i=0; i<MaxProd; i++) {
                         lineaProd = lectorProd.readNext();
                      
                         System.out.println(lineaProd[1].toString() + "PRUEBA1");
                              for (int j=0; j<MaxCat; j++) { 
                              lineaCat = lectorCat.readNext(); 
                              System.out.println(lineaCat[1].toString() + "PRUEBA2");
                    }
            }
                        */
                
                } catch (IOException ex) {
                Logger.getLogger(Traductor_CSV.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Traductor_CSV.class.getName()).log(Level.SEVERE, null, ex);
        
        } finally {
        }
            try {
            //En cualquier caso, lo cerramos al final.
                lectorCat.close();
                lectorProd.close();
            } catch (IOException ex) {
                Logger.getLogger(Traductor_CSV.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }


