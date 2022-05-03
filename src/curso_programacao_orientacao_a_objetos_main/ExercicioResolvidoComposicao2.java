package curso_programacao_orientacao_a_objetos_main;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import curso_programacao_orientacao_a_objetos_entidades.Comentario;
import curso_programacao_orientacao_a_objetos_entidades.Post;

public class ExercicioResolvidoComposicao2 {
	/*
	 * � um tipo de associa��o que permite que um objeto contenha outro
	 * 
	 * Rela��o "tem-um" ou "tem-v�rios"
	 * 
	 * Vantagens
	 *	� Organiza��o: divis�o de responsabilidades
	 *	� Coes�o
	 *	� Flexibilidade
	 *	� Reuso
	 *	
	 * Nota: embora o s�mbolo UML para composi��o (todo-parte) seja o diamante
	 * preto, neste contexto estamos chamando de composi��o qualquer associa��o
	 * tipo "tem-um" e "tem-v�rios".
	 * 
	 * Instancie manualmente (hard code) os objetos mostrados abaixo e mostre-os
	 * na tela do terminal, conforme exemplo.
	 */
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario c1 = new Comentario("Tenha uma boa viagem");
		Comentario c2 = new Comentario("Uau! Que incr�vel!");
		Post p1       = new Post(sdf.parse("27/08/2021 13:05:44"), "Viajando para Nova Zelandia", "Vou visitar um pa�s maravilhoso", 12);
		
		p1.adicionarComentario(c1);
		p1.adicionarComentario(c2);
		
		
		
		Comentario c3 = new Comentario("Boa noite!");
		Comentario c4 = new Comentario("Oi! Tenha um excelente final de semana");
		Post p2       = new Post(sdf.parse("03/12/2021 20:05:44"), "Boa noite a todos!", "Vejo voc�s amanh�", 5);
		
		p2.adicionarComentario(c3);
		p2.adicionarComentario(c4);
		
		
		System.out.println(p1);
		System.out.println(p2);
		
	}

}
