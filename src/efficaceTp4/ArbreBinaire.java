package efficaceTp4;

public class ArbreBinaire<T> {

	private Node<T> racine;
//	private int size;
	
	
	public ArbreBinaire(T data) {
		racine = new Node(data);
	}
	
	//we will add to left but here we will ecraser si il y avait un arbre dans cette position, apres on gere differement...
	public void addLeft(T data) {
		racine.addLeft(data);
	}
	
	public void addRight(T data) {
		racine.addRight(data);
	}
	
	
	
	
	private static class Node<T> { 
		T data;
		Node<T> nG, nD;
		
		public String prefix() {
			StringBuilder sb = new StringBuilder();
			if(data != null) {
				sb.append(data.toString());
			}
			if (nG != null) {
				sb.append(nG.prefix());
			}
			if (nD != null) {
				sb.append(nD.prefix());
			}
			return sb.toString();
		}
		
		public Node (T data) {
			this.data = data;
		}
		
		//we will add to left but here we will ecraser, apres on gere differement...
		public void addLeft(T data) {
			nG = new Node(data);
		}

		public void addRight(T data) {
			nD = new Node(data);
		}
	
		public String toString() {
			return data.toString();
		}
	
	}
}
	
	
//1. La structure d’arbre permet de mod´eliser toutes sortes de situations, tant strictement tech-
//niques que fonctionnelles. Lister plusieurs exemples de telles situations, tant techniques que
//fonctionnelles, o`u un arbre est utile ou n´ecessaire.
//Nous allons repr´esenter une expression arithm´etique en utilisant une structure d’arbre binaire.

//c'est outile pour modeliser l'organisation/systemes des fichier 
//dans un ordinateur, d'autres hierarchies (par exempla dans une entreprise), pour la hierarchie des classes dans un project 
//de development, pour l'ordre des operations arithmetiques, la structure d'un langage de balise comme html...

//3. Avant de pouvoir afficher les donn´ees contenues dans un arbre, il est n´ecessaire de pouvoir
//le parcourir. Combien de fa¸cons diff´erentes de pourcourir un arbre connaissez-vous ? Toutes
//sont-elles applicables `a un arbre n-aire ?

//je connais le parcours on profondeur et en largeur vu dans cours

//4. Quelle est le nom de la m´ethode de parcours qui commence par la racine ?

//ca pourrait etre parcours en profondeur prefixé
	
	
//	
//	
//	
//	
//	
//	public arbreBinaire(Node racine) { 
//		this.racine = racine;
//		size = 0;
//	}
//	
//	public arbreBinaire() { 
//		this.racine = null;
//		size = 0;
//	}
//	
//	
//	//CORRECTION
//	public void prefix() {
//		System.out.println();
//		
//	}
//	
//	
//	
//
//	public boolean isArbreEmpty() {
//		if (size == 0) {
//			return true;
//		} else return false;
//	}
//
//	
//	
////	public void addADroite (T element) {
////		Node newNode = new Node(element);
////		if (racine == null) {
////			racine = newNode;
////			size ++;
////			return;
////		}
////		Node tmpRacine = racine
////				racine = newNode;
////		racine.setNext(tmpRacine);
////		size++;
////	}
//	
////	public void addAGauche (T element) {
////		nextGauche = new Node(element);
////	}
//	
////	public Node getRightChild() {
////	return 
////}
////	
//////public node getLeftChild() {
//////	
//////}
////	public Integer getRacine( ) {
////	
////}
//	
//
//	
////	public Integer getfeuille() {
////		if(header == null) { //header.getElement() == null?
////			return null;
////		}
////		return header.getElement();
////	}
////
////	public Integer last() {
////		Node tmpHeader = header;
////		if (header == null) {
////		return null;
////	}
////		while (tmpHeader.getNext() != null) { //on s'arrete sur l'avant dernier pas le dernier (null)
////			tmpHeader = tmpHeader.getNext();
////		}
////		return tmpHeader.element; //tmpHeader.getElement();
////	}
//	
//	
//	
//	//NODE
//	private static class Node<T> { 
//
//		private T element; 
//		private Node nextDroite;
//		private Node nextGauche;
//		
//		public Node() {
//			nextDroite = null;
//			nextGauche = null;
//		}
//		
//		public Node(T element) {
//			this.element = element;
//			nextDroite = null;
//			nextGauche = null;
//		}
//		
//		public void addNextDroite (T element) {
//			nextDroite = new Node(element);
//		}
//		
//		public void addNextGauche (T element) {
//			nextGauche = new Node(element);
//		}
//		
//		public Node getNextDroite( ) {
//			return nextDroite;
//		}
//		
//		public Node getNextGauche( ) {
//			return nextGauche;
//		}
//
////		public void setNextDroite(Node newNext) {
////			next = newNext;
////		}
////		
////		public void setNextGauche(Node newNext) {
////			next = newNext;
////		}
//
////		public Integer getElement() {
////			return element;
////		}
////
////		public void setElement(Integer newElement) {
////			element = newElement;
////		}
////		
////		public String toString() {
//////			return element.toString();
////			return "[element=" + element + "]";
////		}
//
//	}
//}
//