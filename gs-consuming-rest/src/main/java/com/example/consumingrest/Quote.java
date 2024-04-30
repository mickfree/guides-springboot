package com.example.consumingrest;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


// @JsonIgnoreProperties la biblioteca de procesamiento Jackson JSON
// para indicar que cualquier propiedad que no esté vinculada a este tipo debe ignorarse.
@JsonIgnoreProperties(ignoreUnknown = true)
public record Quote(String type, Value value) {


}
