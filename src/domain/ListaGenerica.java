package domain;

import java.util.ArrayList;

public class ListaGenerica<T> extends Persona{

		ArrayList<T>lista;
		
		public ListaGenerica() {
			T t;
			lista = new ArrayList<>();
		}
		
		public void Agregar_A_Lista_Limitada(T t, Integer tope)/* throws LimiteExcepcion*/
		{
			if(lista.size()<tope)
			{
				lista.add(t);
			}/* else{
				throw new LimiteExcepcion("Esta lleno pajero!");
				}*/
			}
		
		public void agregar_A_lista(T t) {
			lista.add(t);
		}
		
		public void Listar() {
			for (T e : lista) {
				System.out.println("");
				System.out.println(e.toString());
				System.out.println("");
			}
		}

		public void Eliminar_De_Lista(int ID)
		{
			for (T e : lista) {
				/*if( e.ID()== a)
				{
					lista.remove(e);
				}*/
		}
		}
		
		public T Buscar_en_Lista(int ID)
		{
			for (T e : lista) {
				/*if( e.ID()== a)
				{
					lista.remove(e);
					return e;
				}*/
		}
			return null;
		}
		
			
		/*public JSONArray levantarJson() throws JSONException {
		    JSONArray listArray = new JSONArray();
		    JsonUtil utiles = new JsonUtil();
		    JSONObject jsonObject = new JSONObject();

		    for (T e : lista) {
		        listArray.put(e.getFormatoJSON());
		    }

		    String respuesta = listArray.toString();
		    JSONArray arregloJson = new JSONArray(respuesta);
		    utiles.grabarJson(arregloJson);
		    return arregloJson;
		}*/
}
