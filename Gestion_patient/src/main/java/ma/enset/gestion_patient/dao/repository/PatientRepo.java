package ma.enset.gestion_patient.dao.repository;

import ma.enset.gestion_patient.dao.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientRepo extends JpaRepository<Patient , Long> {
    Patient findByNom(String nom);
    @Query("select p from Patient p where p.nom like :x")
    List<Patient> searchbyNom (@Param("x") String mc);


}
