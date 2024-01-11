package com.liceotrujillo.apiclt.news.infrastructure.exceptionhandler;

public enum ExceptionResponse {
    CATEGORYNEWS_NOT_FOUND("No existe la categoría"),
    NEWS_NOT_FOUND("No existe la noticia"),
    NO_DATA_FOUND("No hay data"),
    TAGNEWS_NOT_FOUND("No existe la etiqueta");

    private String message;

    ExceptionResponse(String message){
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }
}
