package Com.examen.fs.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import Com.examen.fs.exception.ArtworkCreationException;
import Com.examen.fs.model.ArtistDTO;
import Com.examen.fs.model.ArtworkDTO;
import Com.examen.fs.service.ArtistServiceImpl;
public class artworkServiceImpl implements artworkService {
	
	ArrayList<ArtworkDTO> obras = new ArrayList<>();

	ArtworkDTO ar = new ArtworkDTO(1, 1, "hola soy la descripción uno", "Titulo1");

	ArtworkDTO ar2 = new ArtworkDTO(2, 2, "hola soy la descripción dos", "Titulo2");

	ArtworkDTO ar3 = new ArtworkDTO(3, 1, "hola soy la descripción tres", "Titulo3");

	ArtworkDTO ar4 = new ArtworkDTO(4,3, "hola soy la descripción cuatro","Titulo4");

	public artworkServiceImpl() {

	obras.add(ar);

	obras.add(ar2);

	obras.add(ar3);

	obras.add(ar4);

	}
	
	@Override
	public ArrayList<ArtworkDTO> getAllArtworks() {
		return obras;
	}

	

	@Override
	public void createArtwork(ArtworkDTO artwork) {
		ArtistServiceImpl ar=new ArtistServiceImpl(); 
		ArtistDTO a;
         a = ar.getArtistById(artwork.getartistid());
         if(artwork.getartistid() == a.getid()) {
        	 obras.add(artwork);
         }
         else {
        	 throw new ArtworkCreationException("el artista no esta comprendido entre la élite");


         }
		
	}


	

}
