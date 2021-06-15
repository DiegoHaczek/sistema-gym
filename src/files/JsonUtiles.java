package files;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonUtiles {

    public JsonUtiles() {
    }

    /**
     * 
     * @param array
     * @param nombreDirectorio
     */

    public void grabar(JSONArray array) {
        try {
            FileWriter file = new FileWriter("registro.json");
            file.write(array.toString());
            file.flush();
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 
     * @param nombreDirectorio
     * @return
     */
    public String leer(String nombreDirectorio) {
        try {
            String contenido = new String(Files.readAllBytes(Paths.get(nombreDirectorio)));
            System.out.println(contenido);
            return contenido;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }

    }
}
