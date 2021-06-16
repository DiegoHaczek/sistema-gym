package domain;

import java.util.ArrayList;

public class ListaGenerica<T>{

	ArrayList<T> lista;

	public ListaGenerica() {
		T t;
		lista = new ArrayList<>();
	}

	public void Agregar_A_Lista_Limitada(T t, Integer tope)/* throws LimiteExcepcion */
	{
		if (lista.size() < tope) {
			lista.add(t);
		} /*
			 * else{ throw new LimiteExcepcion("Turnos Llenos!"); }
			 */
	}

	public void Agregar_A_lista(T t) {
		lista.add(t);
	}

	public void Listar() {
		for (T e : lista) {
			System.out.println("");
			System.out.println(e.toString());
			System.out.println("");
		}
	}


	public void Eliminar_De_Lista(T t) {
		for (T e : lista) {
			if (e.equals(t)) {
				lista.remove(e);
			}
		}
	}


	public T Buscar_en_Lista(String apellido) {
		for (T e : lista) {
			/*
			 * if( e.apellido()== apellido) { return e; }
			 */
		}
		return null;
	}

	public ArrayList<T> Retorna_Lista(){
		return lista;
	}

	
}
