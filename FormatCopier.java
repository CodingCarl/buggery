/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formatcopier;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Emulous
 */
public class FormatCopier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int x = 0,
        y = 0,
        z = 0,
        q = 0,
        list_size = 0;
    File file = new File("readin.txt");
    String[] lines = new String[3000];
    String[] description = new String[1000];
    String wiper = "FUCK";
    try {
        FileReader reader = new FileReader(file);
        BufferedReader buffReader = new BufferedReader(reader);
        PrintWriter writer = new PrintWriter("the-file-name.xml", "UTF-8");
        //writer.println("The first line");
        //writer.println("The second line");
        
        // tries to open files and write the resources list.
        String s;
        while((s = buffReader.readLine()) != null){
        //while(x<10){s = buffReader.readLine();
            lines[x] = s;
            x++;
        }
        //This loop prints out the resources, String array part.
        writer.println("<resources>");
        writer.println("\t<string-array name=\"" + lines[0] + "\">");
        for(x=1;!lines[x].equals("EOL");x++){
            writer.println("\t\t<item>"+lines[x]+"</item>");
        }
        writer.println("\t</string-array>\n");
        y = x;
        
        //Time to sanitize the input descriptions.
        list_size = y;
        
        //Prints out the description for each entry.
        z = y + 1;
        for(x=1; x < list_size; x++)
        {
            description[x] = "";
            while(!lines[z].equals("EOS")) 
                {
                description[x] = description[x] 
                    + lines[z].replaceAll("'","\'")
                    + "\n";
                z++;
                }
            z++;
        writer.println("\t<string name=\"" + lines[0] + lines[x].replaceAll(" ", "_") + "\"");
        writer.println("\t\t>" + description[x] + "</string>");
        }
        //messy code, commenting it out.
        /*
        for(x=1;x<y;x++)
        {
            z = x + y;
            wiper = "";
            while(lines[z].indexOf('\'')>=0 )
            {
                q = lines[z].indexOf('\'');
                wiper = lines[z].substring(0, q) +"\\\'";
                lines[z] = lines[z].substring((q+1));
                //lines[z] = lines[z].substring(0, q) +"\\\'" + 
                //        lines[z].substring((q+1));
            }
            wiper = wiper + lines[z];
            lines[z] = wiper;
            
            writer.println("\t<string name=\"" + lines[0] + lines[x].replaceAll(" ", "_") + "\"");
            writer.println("\t\t>" + lines[z] + "</string>");
        }
        */
        
        writer.println();
        writer.println("</resources>");
        //TODO Change whitespace in setText to Underscore.
        for(x=1;x<y;x++)
        {         
            writer.println("\t\t\tcase \"" + lines[0] + lines[x] + "\":");
            lines[x] = lines[x].replaceAll(" ", "_");
            
            writer.println("\t\t\t\tmyjavatextview.setText(R.string." + lines[0] + lines[x] + ");");
            writer.println("\t\t\t\tbreak;");
        }
        
        writer.println(x);
        writer.close();
    }
    catch(FileNotFoundException e){
        e.printStackTrace();
    }
    catch(IOException e){
        e.printStackTrace();
        //handle exception
    }
    // And just to prove we have the lines right where we want them..
    //for(String st: lines)
    //System.out.println(st);
    x=0;
    while(lines[x] != null)
    {System.out.println(lines[x]);
    x++;}
    }
    
}
