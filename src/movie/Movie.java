/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movie;
import java.util.Scanner;

/**
 *
 * @author Asim
 */
public class Movie {
this line added in GitHub
	its me agian
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner input = new Scanner (System.in);
		String [] movies = new String[5];
		
		
		System.out.println("Enter Movies Name");
		for (int i = 0; i <movies.length; i++) {
			movies[i] = input.nextLine();
		}
		for (int i = 0; i < movies.length; i++) {
			System.out.println("My fav. Movies are : " + movies[i]);
	
		
		}
    }
    
}
