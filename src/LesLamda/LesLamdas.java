package LesLamda;
@FunctionalInterface
public interface LesLamdas {
	public void soigner();
	public  default String manger(String nom){
		return "voila";
	};

}
