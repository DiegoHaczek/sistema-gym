package domain;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
//import org.json.JSONArray;
//import org.json.JSONException;

//import excepciones.LimiteExcepcion;
//import Fichero.JsonUtil;

public class MapaGenerico<K,T> {

	HashMap<K, T> mapaGenerico;
	
	T t;
	
	ListaGenerica<T> listaGenerica;
	
	public MapaGenerico() 
	{
		mapaGenerico = new HashMap<>();
		listaGenerica = new ListaGenerica<>();
	}
	
	public void Agregar(K k, T t)
	{
		mapaGenerico.put(k, t);
	}
	
	public void listar() {
		Iterator it = mapaGenerico.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry me = (Map.Entry<K, T>) it.next();
			T t = (T) me.getValue();
			System.out.println(t.toString());
		}
	}
	
	public boolean eliminar(K k) /*throws LimiteExcepcion*/ {
		
		Iterator it = mapaGenerico.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry me = (Map.Entry<K, T>) it.next();
			K d = (K) me.getKey();
			T t = (T) me.getValue();
			if (k == d) {
				mapaGenerico.remove(d, t);
				System.out.println("");
				return true;
			}
		}
		System.out.println("No se encontro");
		return false;
	}
	

	/*public String ObtenerString(K k) throws LimiteExcepcion {
		int i = 0;
		Iterator it = mapaGenerico.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry me = (Map.Entry<K, T>) it.next();
			K d = (K) me.getKey();
			T t = (T) me.getValue();
			if (k == d) {
				return t.toString();
			}
		}
		if (i == 0) {
			throw new LimiteExcepcion("No se encontro ");
		}
		return "";
	}*/
	
	/*public JSONArray levantarJson() throws JSONException {
		JSONArray listArray = new JSONArray();
		JsonUtil utiles = new JsonUtil();// hago esto para poder grabarlo en un archivo JSON
		Iterator it = mapaGenerico.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry me = (Map.Entry<K, T>) it.next();
			K d = (K) me.getKey();
			T t = (T) me.getValue();
			listArray.put(t.getFormatoJSON());
		}

		String respuesta = listArray.toString();
		JSONArray arregloJson = new JSONArray(respuesta);
		utiles.grabarJson(arregloJson);// lo grabo (ya se que solo pedia el string pero es algo extra)
		// System.out.println(arregloJson);
		return arregloJson;
	}*/
}
