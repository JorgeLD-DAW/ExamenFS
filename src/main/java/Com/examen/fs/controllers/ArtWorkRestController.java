package Com.examen.fs.controllers;
import java.net.URI;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import Com.examen.fs.model.ArtworkDTO;
import Com.examen.fs.service.artworkService;

@RestController
@RequestMapping("/ArtWork")
public class ArtWorkRestController {
	 @Autowired
	 artworkService artworkService;

	 public ArtWorkRestController (artworkService servicio) {
		 this.artworkService=servicio;
	 }
	 @GetMapping
	 public ResponseEntity<ArrayList<?>> VerObras(){
		 ArrayList<ArtworkDTO> array = artworkService.getAllArtworks();
	     return ResponseEntity.ok(array);
	 }
	 @PostMapping
	 public ResponseEntity<ArtworkDTO> CrearObra(@RequestBody @Validated ArtworkDTO obraCreada){
		 artworkService.createArtwork(obraCreada);
		 URI a = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obraCreada.getid()).toUri(); 
	     return ResponseEntity.created(a).build();
	 }
}
