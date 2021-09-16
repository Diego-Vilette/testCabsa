package es.cabsa.javadevelopers.utils;

import java.lang.reflect.Type;
import java.util.List;

public interface JsonParser {

    <T> T fromJson(String json, Type typeOfT);

    String toJson(Object src);

    String toJsonList(List<Object> lsrc);

}