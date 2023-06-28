package com.example.mobilityfordev;

import com.example.mobilityfordev.entities.Employe;
import com.example.mobilityfordev.entities.Equipe;
import com.example.mobilityfordev.entities.Manager;
import com.example.mobilityfordev.repository.Employerepository;
import com.example.mobilityfordev.repository.Equiperepository;
import com.example.mobilityfordev.repository.ManagerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class MobilityfordevApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobilityfordevApplication.class, args);
	}
	int a=0,b=0;
	@Bean
	CommandLineRunner Start(Employerepository employerepository, Equiperepository equiperepository, ManagerRepository managerRepository){
		return args->{

			managerRepository.save(new Manager(null,"chaimae","rhiyate",4,new ArrayList<>()));
			managerRepository.save(new Manager(null,"siham","laklalech",4,new ArrayList<>()));
			managerRepository.save(new Manager(null,"Adil","sayouti",4,new ArrayList<>()));

			Manager manger1=managerRepository.findById(1L).get();
			Manager manger2=managerRepository.findById(2L).get();
			Manager manger3=managerRepository.findById(3L).get();

			equiperepository.save(new Equipe(null,"C2S",60,new ArrayList<>(),manger1));
			equiperepository.save(new Equipe(null,"PAR",12,new ArrayList<>(),manger2));
			equiperepository.save(new Equipe(null,"ASEQ",15,new ArrayList<>(),manger3));

			equiperepository.findAll().forEach(ee->{
				this.a++;

				Employe emp=new Employe();
				Stream.of("khadija","fraules","Taha").forEach(k->{
					this.b++;
					emp.setCin(null);
					emp.setName(k);
					emp.setPrenom(k+"hap");
					emp.setNbrexperience(20);
					emp.setEquipe(ee);

					employerepository.save(emp);
				});

			});
			System.out.println(a+"  "+b);
//		equiperepository.findAll().forEach(equipe->{
//				Stream.of("yassine","khadija","fraules").forEach(ee->{
//					Employe em=new Employe(null,ee,ee,30,equipe);
//					employerepository.save((em));
//
//			});
//			});
//			employerepository.save(new Employe(1L,"yassine","elmoukhantar",3));
//			employerepository.save(new Employe(2L,"youssef","elouafi",5));
//			employerepository.save(new Employe(3L,"omar","elazami",2));
//			employerepository.save(new Employe(4L,"khadija","jenhaji",3));
		//	equiperepository.save(new Equipe(1L,"C2S",50,new Arra));
			//Equipe a=new Equipe(1L,"C2S",50,null);
//			List<Equipe> lequipe=new ArrayList<>();
//
//			lequipe.add(new Equipe(1L,"C2S",50,null));
//			lequipe.add(new Equipe(2L,"ASEQ",40,null));
//			lequipe.add(new Equipe(3L,"K2H",20,null));
//			lequipe.forEach(e->{
//				//https://www.youtube.com/watch?v=Kfv_7m8INlU&list=RDCMUCCwIYNpQVHZTd3Vx_krnmdA&index=7
//				employerepository.save(new Employe(1L,"yassine","elmoukhantar",3,e));
//				employerepository.save(new Employe(2L,"fatiha","oukessou",1,e));
//				employerepository.save(new Employe(3L,"abdellatif","bagar",2,e));
//			});
			//equiperepository.save(lequipe.forEach(h->{});)


		};
	}
}
