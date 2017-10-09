
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sosthene
 */
public class Paire {
    public static void main(String[] args) {
		// TODO Auto-generated method st
		Scanner clavier=new Scanner (System.in);
		int i,nombre;
		System.out.println("Veillez saisir un nombre");
		nombre=clavier.nextInt();
		for(i=0;i<nombre;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
		

	}

}
