/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimento;

import com.google.gson.Gson;
import static java.nio.file.Paths.get;
import mantenimento.encapsulacion.Estudiante;

/**
 *
 * @author Clariza
 */
class ManejoTransformaciones {

   public void ejemploTransformaciones(){

        get("/estudianteJsonSimple/", (request, response) -> {
            return new Estudiante(19810151, "Clariza", "Rosario", "809-851-1234");
        });

        get("/estudianteJson/", (request, response) -> {
            return new Estudiante(19810151, "Clariza", "Rosario", "809-851-1234");
        }, new JsonTransformer());

        get("/estudianteJsonAceptado/", "application/json", (request, response) -> {
            return new Estudiante(19810151, "Clariza", "Rosario", "809-851-1234");
        }, new JsonTransformer());

        Gson gson = new Gson();
        get("/estudianteJsonDirecto", (request, response) -> new Estudiante(19810151, "Clariza", "Rosario", "809-851-1234"), gson::toJson);

    }
}
