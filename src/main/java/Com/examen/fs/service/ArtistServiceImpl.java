package Com.examen.fs.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import Com.examen.fs.model.ArtistDTO;
@Service
public class ArtistServiceImpl implements ArtistService{
	ArrayList<ArtistDTO> artists = new ArrayList<>();

	ArtistDTO ar = new ArtistDTO(1, "Goya");

	ArtistDTO ar2 = new ArtistDTO(2, "Picasso");

	ArtistDTO ar3 = new ArtistDTO(3, "Dalí");

	ArtistDTO ar4 = new ArtistDTO(4, "Miró");

	public ArtistServiceImpl(){

	artists.add(ar);

	artists.add(ar2);

	artists.add(ar3);

	artists.add(ar4);

	}
	@Override
	public ArtistDTO getArtistById(int id) {
		  for(ArtistDTO a : artists) {
	            if(a.getid() == id) {
	                return a;
	            }
	        }
	        return null;
	    }
	}


