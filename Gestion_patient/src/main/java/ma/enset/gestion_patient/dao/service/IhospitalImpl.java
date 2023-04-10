package ma.enset.gestion_patient.dao.service;

import ma.enset.gestion_patient.dao.entities.Consultation;
import ma.enset.gestion_patient.dao.entities.Medecin;
import ma.enset.gestion_patient.dao.entities.Patient;
import ma.enset.gestion_patient.dao.entities.RendezVous;
import ma.enset.gestion_patient.dao.repository.ConsultationRepo;
import ma.enset.gestion_patient.dao.repository.MedecinRepo;
import ma.enset.gestion_patient.dao.repository.PatientRepo;
import ma.enset.gestion_patient.dao.repository.RendezVousRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class IhospitalImpl implements Ihospital {
    private PatientRepo patientRepo;
    private RendezVousRepo rdvRepo;
    private ConsultationRepo consultationRepo;
    private MedecinRepo medecinRepo;

    public IhospitalImpl(PatientRepo patientRepo, RendezVousRepo rdvRepo, ConsultationRepo consultationRepo, MedecinRepo medecinRepo) {
        this.patientRepo = patientRepo;
        this.rdvRepo = rdvRepo;
        this.consultationRepo = consultationRepo;
        this.medecinRepo = medecinRepo;
    }

    @Override
    public Patient savePatient(Patient p) {
        return patientRepo.save(p);
    }

    @Override
    public Medecin saveMedcin(Medecin m) {
        return medecinRepo.save(m);
    }

    @Override
    public RendezVous saveRendezVous(RendezVous rdv) {
        rdv.setId(UUID.randomUUID().toString());

        return rdvRepo.save(rdv);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepo.save(consultation);
    }

    @Override
    public Patient findPatientbyNom(String nom) {
        return patientRepo.findByNom(nom);
    }

    @Override
    public Medecin findMedcinbyNom(String nom) {
        return medecinRepo.findByNom(nom);
    }

    @Override
    public RendezVous findRdvById(Long l) {
        return rdvRepo.findById(l).orElse(null);
    }

    @Override
    public List<RendezVous> findallRdv() {
        return rdvRepo.findAll();
    }

    @Override
    public List<Patient> findallPatient() {
        return patientRepo.findAll();
    }

    @Override
    public  void deletePatient(Patient patient) {
         patientRepo.delete(patient);
    }

    @Override
    public void updatePatient(Long l,String nom,Boolean malade) {
        Patient patient = patientRepo.findById(l).orElse(null);
        System.out.println(patient.getNom());
        patient.setMalade(malade);
        patient.setNom(nom);
        patientRepo.save(patient);
    }
}
