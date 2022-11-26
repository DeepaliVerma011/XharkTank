package services;

import Repo.EnterpreneurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Enterpreneur {
    @Autowired
    private EnterpreneurRepository enterpreneurRepository;

}
