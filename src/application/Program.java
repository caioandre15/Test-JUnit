package application;

import entities.Identifier;

public class Program {

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("Uso: IdentifierMain <strings>");
		} 
		else {
			Identifier id = new Identifier();
			if (id.validateIdentifier(args[0])) {
				System.out.print("Valido");
			} 
			else {
				System.out.print("Invalido");
			}
		}
	}
}
