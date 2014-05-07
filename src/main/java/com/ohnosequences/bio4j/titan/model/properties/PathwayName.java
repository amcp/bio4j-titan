package com.bio4j.model.properties;

import com.bio4j.model.Property;
import com.bio4j.model.PropertyType;

import com.bio4j.model.Element;
import com.bio4j.model.ElementType;

public interface PathwayName <N extends Element<N,NT>, NT extends Enum<NT> & ElementType<N,NT>> 
  extends Property<N, NT> {

  // the property method
  public String pathwayName();

  // static type method
  public static <
    N extends Element<N,NT> & PathwayName<N,NT>, 
    NT extends Enum<NT> & ElementType<N,NT>
  > Type<N,NT> TYPE(NT elementType) { return new Type<N,NT>(elementType); }

  // convenience type
  public class Type <N extends Element<N,NT> & PathwayName<N,NT>, NT extends Enum<NT> & ElementType<N,NT>> 
    extends PropertyType<N, NT, PathwayName<N,NT>, Type<N,NT>, String> {

    public Type(NT elementType) {
      super(elementType, "pathwayName");
    }

    public Class<String> valueClass() { return String.class; }
  }
}