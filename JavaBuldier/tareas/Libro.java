package tareas;

public class Libro {
String titulo;
boolean original;
boolean prestable;

public void getOriginal() {}
public void getTitulo() {}
public void getPrestable() {}


public Libro(String titulo ,boolean original,boolean prestable) {
	this.titulo = titulo;
	this.original = original;
	this.prestable = prestable;
	
}

public void setoriginal (boolean Original){
    this.original = Original;
}

public void prestable(boolean prestable){
    this.prestable = prestable;
}


}
