package Com.examen.fs.service;

import java.util.ArrayList;
import Com.examen.fs.model.ArtworkDTO;

public interface artworkService {
	ArrayList<ArtworkDTO> getAllArtworks();
	void createArtwork(ArtworkDTO artworkDTO);
}
