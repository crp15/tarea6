/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimento;


import java.util.HashMap;
import java.util.Map;
import javax.security.auth.login.Configuration;


/**
 *
 * @author Clariza
 */
class ManejoTemplates {

     public void ejemplosTemplates(){

        //Indicando la carpeta por defecto.
        Configuration configuration=new Configuration();
        configuration.setClassForTemplateLoading(ManejoTemplates.class, "/templates");
        FreeMarkerEngine freeMarkerEngine = new FreeMarkerEngine(configuration);


        /**
         * http://localhost:4567/formulario
         */
        get("/formulario/", (request, response) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("titulo", "Formulario en FreeMarker");
            return new ModelAndView(attributes, "formulario.ftl");
        }, freeMarkerEngine);

        /**
         * http://localhost:4567/datosEstudiante
         */
        get("/datosEstudiante/:matricula", (request, response) -> {
            //obteniendo la matricula.
            Estudiante estudiante= new Estudiante(Integer.parseInt(request.params("matricula")), "Nombre", "Apellido", "Telefono");//FakeServices.getInstancia().getEstudianteMatricula(Integer.parseInt(request.params("matricula")));

            Map<String, Object> attributes = new HashMap<>();
            attributes.put("estudiante", estudiante);

            //enviando los parametros a la vista.
            return new ModelAndView(attributes, "datosEstudiante.ftl");
        }, freeMarkerEngine); //


        post("/procesarFormulario/", (request, response) -> {
            //obteniendo la matricula.

            String variableOculta = request.queryParams("variable_oculta");
            int matricula = Integer.parseInt(request.queryParams("matricula"));
            String nombre =request.queryParams("nombre");
            String apellido =request.queryParams("apellido");
            String telefono =request.queryParams("telefono");
            System.out.println("La variable Oculta: "+variableOculta);

            Estudiante estudiante= new Estudiante(matricula, nombre, apellido, telefono);

            Map<String, Object> attributes = new HashMap<>();
            attributes.put("titulo", "Procesando Estudiante");
            attributes.put("estudiante", estudiante);

            //enviando los parametros a la vista.
            return new ModelAndView(attributes, "formularioProcesado.ftl");
        }, freeMarkerEngine); //

    }


    
}
