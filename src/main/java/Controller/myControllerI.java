package Controller;


import Repo.InvestorRepository;
import models.Investor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Investor")
public class myControllerI {
    @Autowired
    public InvestorRepository investorRepository;

    @PostMapping("/")
    public ResponseEntity<?> addInvestor(@RequestBody Investor investor){
        Investor investor1=this.investorRepository.save(investor);
        return ResponseEntity.ok(investor1);
    }


}
