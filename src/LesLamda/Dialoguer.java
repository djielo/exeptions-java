package LesLamda;
@FunctionalInterface
public interface Dialoguer {
	public void parler(String question);
}
	// autrement
	/*Dialogue d = new Dialogue () {
		public void parler(String question){
			System.out.println("voila la "+question);
		}
	}

};
d.parler("bonjour");*/
// expression lamda
//Dialogue d =(s) ->System.out.println("voila la "+question);d.parler(Bonjour);