/*
 * FouleFactoryApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/14/2016
 */
package com.foulefactory.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class TemplateColumnWriterServiceModel 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5098168684288375125L;
    private int idTemplateColumnType;
    private int column;
    private int order;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("IdTemplateColumnType")
    public int getIdTemplateColumnType ( ) { 
        return this.idTemplateColumnType;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("IdTemplateColumnType")
    public void setIdTemplateColumnType (int value) { 
        this.idTemplateColumnType = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Column")
    public int getColumn ( ) { 
        return this.column;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Column")
    public void setColumn (int value) { 
        this.column = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Order")
    public int getOrder ( ) { 
        return this.order;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Order")
    public void setOrder (int value) { 
        this.order = value;
    }
 
}
 