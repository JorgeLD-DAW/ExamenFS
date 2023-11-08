package Com.examen.fs.model;

import Com.examen.fs.validator.ArtWorkValidatior;

public class ArtworkDTO {
	int id;
	int artistid;
	String title;
	@ArtWorkValidatior
	String description;
	public ArtworkDTO(int id,int artistid,String title,String description) {
		this.artistid=artistid;
		this.id=id;
		this.title=title;
		this.description=description;
	}
	public int getid (){
		return id;
	}
	public void setid(int id) {
		this.id=id;
	}
	public void settitle(String title) {
		this.title=title;
	}
	public String gettitle (){
		return title;
	}
	public int getartistid (){
		return artistid;
	}
	public void setartistid(int artistid) {
		this.artistid=artistid;
	}
	public void setdescription(String description) {
		this.description=description;
	}
	public String getdescription (){
		return description;
	}
	
}
