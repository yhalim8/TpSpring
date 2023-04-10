package ma.enset.gestion_patient.dao.repository;

import ma.enset.gestion_patient.dao.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepo extends JpaRepository<Medecin,Long> {
    Medecin findByNom(String nom);
}
