package Com.examen.fs.model;

public class ArtistDTO {
	int id;
	String name;
	public ArtistDTO(int id, String name) {
		this.id=id;
		this.name=name;
	}
	public int getid (){
		return id;
	}
	public void setid(int id) {
		this.id=id;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getname (){
		return name;
	}
}
