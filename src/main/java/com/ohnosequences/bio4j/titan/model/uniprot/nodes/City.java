package com.bio4j.model.uniprot.nodes;

import com.bio4j.model.Node;
import com.bio4j.model.properties.Name;
import com.bio4j.model.uniprot.nodes.Book;
import com.bio4j.model.uniprot.relationships.BookCity;

import java.util.List;

import com.bio4j.model.NodeType;

/**
 *
 * @author <a href="mailto:ppareja@era7.com">Pablo Pareja Tobes</a>
 */
public interface City extends Node<City, City.Type>,
	
	// properties
	Name<City, City.Type>
{
  
	  public static Type TYPE = Type.city;
	  
	  public static enum Type implements NodeType<City, City.Type> {
	    city;
	    public Type value() { return city; }
	  }

	// bookCity
	// incoming
	public List<BookCity> bookCity_in(); 
	public List<Book> bookCity_inNodes();

}