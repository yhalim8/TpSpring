package ma.enset.gestion_patient.dao.repository;

import ma.enset.gestion_patient.dao.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepo extends JpaRepository<Consultation,Long> {
}
