package com.mycompany.tarea2;

public class Tarea2 {
    
    static String obtenerAccion(String esObligatorio,Boolean esDocente, Boolean esExterno, String tipoPersonaDestino, String estadoRegistro){
         if("si".equals(esObligatorio) && esDocente){
             return "actualizar";
         }else if("no".equals(esObligatorio) && esDocente){
             return "matricular";
         }else if(esExterno && "porConfirmar".equals(estadoRegistro)){
             return "actualizar";
         }else if(esExterno && "externo".equals(tipoPersonaDestino)){
             return "registrar";
         }else if(esExterno && "vigente".equals(estadoRegistro)){
             return "matricular";
         }
        return "nel";
    } 
    
    public static void main(String[] args) {
        //obtenerAccion();
    }
}
