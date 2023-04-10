package ma.enset.gestion_patient.dao.service;

import ma.enset.gestion_patient.dao.entities.Consultation;
import ma.enset.gestion_patient.dao.entities.Medecin;
import ma.enset.gestion_patient.dao.entities.Patient;
import ma.enset.gestion_patient.dao.entities.RendezVous;

import java.util.List;

public interface Ihospital {
    public Patient savePatient(Patient p);
    public Medecin saveMedcin(Medecin m);
    public RendezVous saveRendezVous(RendezVous rdv);
    public Consultation saveConsultation(Consultation consultation);
    public Patient findPatientbyNom(String nom);
    public Medecin findMedcinbyNom(String nom);
    public RendezVous findRdvById(Long l);
    public List<RendezVous> findallRdv();
    public List<Patient> findallPatient();
    public void deletePatient(Patient patient);
    public void updatePatient(Long l,String nom,Boolean malade);



}
