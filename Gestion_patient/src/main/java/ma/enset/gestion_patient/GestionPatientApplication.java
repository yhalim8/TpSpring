package ma.enset.gestion_patient;

import ma.enset.gestion_patient.dao.entities.*;
import ma.enset.gestion_patient.dao.service.Ihospital;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class GestionPatientApplication  {


    public static void main(String[] args) {SpringApplication.run(GestionPatientApplication.class,args);}
    @Bean
    CommandLineRunner start(Ihospital service){ //injection des dependence
        return args -> {

           Stream.of("najat","hamid","achraf")
                    .forEach(name->{
                        Patient patient2 = new Patient();
                              patient2.setNom(name);
                              patient2.setDateNaissance(new Date());
                              patient2.setMalade(true);
                              service.savePatient(patient2); //ajouter des patient
                        System.out.println("patient added");
                    });
            Stream.of("hanan","aachrad","jamal")
                    .forEach(name->{
                        Medecin medecin = new Medecin();
                        medecin.setNom(name);
                        medecin.setEmail(name+"@outlook.fr");
                        medecin.setSpecialite(Math.random()>0.5?"cardio":"churergie dentaire");
                        service.saveMedcin(medecin);  //ajouter des medecin
                        System.out.println("medecin added");
                    });
           Patient patient2=service.findPatientbyNom("hamid"); //chercher un patient par son nom
            Medecin medecin = service.findMedcinbyNom("hanan");
            RendezVous rendezVous = new RendezVous();
            rendezVous.setPatient(patient2);
            rendezVous.setStatusRDV(StatusRDV.PENDING);
            rendezVous.setMedecin(medecin);
            rendezVous.setDate(new Date());
            service.saveRendezVous(rendezVous); //ajouter rendez vous

            System.out.println(rendezVous.getId());
            RendezVous red2 = service.findallRdv().get(0);
            Consultation consultation = new Consultation();
            consultation.setDateConsultation(new Date());
            consultation.setRdv(red2);
            consultation.setRapport("rapport de consultation");
            service.saveConsultation(consultation);  //ajouter consultation

            Patient patientdelete = service.findPatientbyNom("najat");
            service.deletePatient(patientdelete);//supprimer un patient

            //mettre a jour patient
            service.updatePatient(3L,"luffy",false);
    };
}

}