package sn.ahiba.gmembrebacken.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import sn.ahiba.gmembrebacken.entities.Dahira;
import sn.ahiba.gmembrebacken.entities.Fonction;

import java.util.List;
import java.util.Optional;

@Repository
public interface FonctionRepository extends JpaRepository<Fonction,Long> {

    public Optional<Fonction> findByCode(String code);
    
    public ResponseEntity<?> deleteByCode(String code);
    public List<Fonction> findByMembreCode(String codeMembre);

}
