package com.aantivero.eeff;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class EeffApplication {

	public static void main(String[] args) {
		SpringApplication.run(EeffApplication.class, args);
	}

	@Bean
	ApplicationRunner initEntidades(EntidadRepository repository) {
		return args -> {
			this.eeff.forEach((k, v) -> {
				Entidad entidad = new Entidad();
				entidad.setCodigo(k);
				entidad.setDenominacion(v);
				entidad.setCodigoNumerico(Integer.parseInt(k));
				repository.save(entidad);
			});
			repository.findAll().forEach(System.out::println);
		};
	}

	private static final Map<String, String> eeff;
	static {
		eeff = new HashMap<String, String>();
		eeff.put("00007", "BANCO DE GALICIA Y BUENOS AIRES S.A.");
		eeff.put("00011", "BANCO DE LA NACION ARGENTINA");
		eeff.put("00014", "BANCO DE LA PROVINCIA DE BUENOS AIRES");
		eeff.put("00015", "INDUSTRIAL AND COMMERCIAL BANK OF CHINA");
		eeff.put("00016", "CITIBANK N.A.");
		eeff.put("00017", "BBVA BANCO FRANCES S.A.");
		eeff.put("00018", "THE BANK OF TOKYO-MITSUBISHI UFJ, LTD.");
		eeff.put("00020", "BANCO DE LA PROVINCIA DE CORDOBA S.A.");
		eeff.put("00027", "BANCO SUPERVIELLE S.A.");
		eeff.put("00029", "BANCO DE LA CIUDAD DE BUENOS AIRES");
		eeff.put("00034", "BANCO PATAGONIA S.A.");
		eeff.put("00044", "BANCO HIPOTECARIO S.A.");
		eeff.put("00045", "BANCO DE SAN JUAN S.A.");
		eeff.put("00060", "BANCO DEL TUCUMAN S.A.");
		eeff.put("00065", "BANCO MUNICIPAL DE ROSARIO");
		eeff.put("00072", "BANCO SANTANDER RIO S.A.");
		eeff.put("00083", "BANCO DEL CHUBUT S.A.");
		eeff.put("00086", "BANCO DE SANTA CRUZ S.A.");
		eeff.put("00093", "BANCO DE LA PAMPA SOCIEDAD DE ECONOMÍA MIXTA");
		eeff.put("00094", "BANCO DE CORRIENTES S.A.");
		eeff.put("00097", "BANCO PROVINCIA DEL NEUQUÉN SOCIEDAD ANÓNIMA");
		eeff.put("00147", "BANCO INTERFINANZAS S.A.");
		eeff.put("00150", "HSBC BANK ARGENTINA S.A.");
		eeff.put("00165", "JPMORGAN CHASE BANK, NATIONAL ASSOCIATION");
		eeff.put("00191", "BANCO CREDICOOP COOPERATIVO LIMITADO");
		eeff.put("00198", "BANCO DE VALORES S.A.");
		eeff.put("00247", "BANCO ROELA S.A.");
		eeff.put("00254", "BANCO MARIVA S.A.");
		eeff.put("00259", "BANCO ITAU ARGENTINA S.A.");
		eeff.put("00262", "BANK OF AMERICA, NATIONAL ASSOCIATION");
		eeff.put("00266", "BNP PARIBAS");
		eeff.put("00268", "BANCO PROVINCIA DE TIERRA DEL FUEGO");
		eeff.put("00269", "BANCO DE LA REPUBLICA ORIENTAL DEL URUGUAY");
		eeff.put("00277", "BANCO SAENZ S.A.");
		eeff.put("00281", "BANCO MERIDIAN S.A.");
		eeff.put("00285", "BANCO MACRO S.A.");
		eeff.put("00299", "BANCO COMAFI SOCIEDAD ANONIMA");
		eeff.put("00300", "BANCO DE INVERSION Y COMERCIO EXTERIOR S.A.");
		eeff.put("00301", "BANCO PIANO S.A.");
		eeff.put("00303", "BANCO FINANSUR S.A.");
		eeff.put("00305", "BANCO JULIO SOCIEDAD ANONIMA");
		eeff.put("00309", "BANCO RIOJA SOCIEDAD ANONIMA UNIPERSONAL");
		eeff.put("00310", "BANCO DEL SOL S.A.");
		eeff.put("00311", "NUEVO BANCO DEL CHACO S. A.");
		eeff.put("00312", "BANCO VOII S.A.");
		eeff.put("00315", "BANCO DE FORMOSA S.A.");
		eeff.put("00319", "BANCO CMF S.A.");
		eeff.put("00321", "BANCO DE SANTIAGO DEL ESTERO S.A.");
		eeff.put("00322", "BANCO INDUSTRIAL S.A.");
		eeff.put("00325", "DEUTSCHE BANK S.A.");
		eeff.put("00330", "NUEVO BANCO DE SANTA FE SOCIEDAD ANONIMA");
		eeff.put("00331", "BANCO CETELEM ARGENTINA S.A.");
		eeff.put("00332", "BANCO DE SERVICIOS FINANCIEROS S.A.");
		eeff.put("00336", "BANCO BRADESCO ARGENTINA S.A.");
		eeff.put("00338", "BANCO DE SERVICIOS Y TRANSACCIONES S.A.");
		eeff.put("00339", "RCI BANQUE S.A.");
		eeff.put("00340", "BACS BANCO DE CREDITO Y SECURITIZACION S.A.");
		eeff.put("00341", "BANCO MASVENTAS S.A.");
		eeff.put("00386", "NUEVO BANCO DE ENTRE RÍOS S.A.");
		eeff.put("00389", "BANCO COLUMBIA S.A.");
		eeff.put("00426", "BANCO BICA S.A.");
		eeff.put("00431", "BANCO COINAG S.A.");
		eeff.put("00432", "BANCO DE COMERCIO S.A.");
		eeff.put("44059", "FORD CREDIT COMPAÑIA FINANCIERA S.A.");
		eeff.put("44077", "COMPAÑIA FINANCIERA ARGENTINA S.A.");
		eeff.put("44088", "VOLKWAGEN FINANCIAL SERVICES CIA.FIN.S.A");
		eeff.put("44090", "CORDIAL COMPAÑÍA FINANCIERA S.A.");
		eeff.put("44092", "FCA COMPAÑIA FINANCIERA S.A.");
		eeff.put("44093", "GPAT COMPAÑIA FINANCIERA S.A.");
		eeff.put("44094", "MERCEDES-BENZ COMPAÑÍA FINANCIERA ARGENTINA");
		eeff.put("44095", "ROMBO COMPAÑÍA FINANCIERA S.A.");
		eeff.put("44096", "JOHN DEERE CREDIT COMPAÑÍA FINANCIERA S.A.");
		eeff.put("44098", "PSA FINANCE ARGENTINA COMPAÑÍA FINANCIERA");
		eeff.put("44099", "TOYOTA COMPAÑÍA FINANCIERA DE ARGENTINA");
		eeff.put("44100", "FINANDINO COMPAÑIA FINANCIERA S.A.");
		eeff.put("45056", "MONTEMAR COMPAÑIA FINANCIERA S.A.");
		eeff.put("45072", "MULTIFINANZAS COMPAÑIA FINANCIERA S.A.");
		eeff.put("65203", "CAJA DE CREDITO CUENCA COOPERATIVA LIMITADA");
	}
}
