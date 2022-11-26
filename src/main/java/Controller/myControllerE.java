package Controller;

import Repo.EnterpreneurRepository;
import models.Enterpreneur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Enterpreneur")
public class myControllerE {
    @Autowired
    private EnterpreneurService enterpreneurService;

    public myControllerE() {
        this.enterpreneurService = enterpreneurRepository;
    }

    @PostMapping("/")
    public ResponseEntity<?> addEnterpreneur(@RequestBody Enterpreneur enterpreneur){
        Enterpreneur enterpreneur1=this.enterpreneurService.save(enterpreneur);
        return ResponseEntity.ok(enterpreneur1);
    }

    @GetMapping("/")
    public ResponseEntity<?> getpitches(){
        return ResponseEntity.ok(this.enterpreneurService.findAll());
    }
}
