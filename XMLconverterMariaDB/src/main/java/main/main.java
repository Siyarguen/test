package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.Marshaller;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import metis.Controller;
import metisimport.ImportController;
import metis.*;

@SpringBootApplication(scanBasePackages = { "metis", "metisimport", "metismodel", "metisimportmodel", "Config" })
public class main {

	public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
		ConfigurableApplicationContext cxt = SpringApplication.run(main.class, args);
	
		XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newFactory();
	
		
		ImportController dao = cxt.getBean(ImportController.class);
		Controller c = cxt.getBean(Controller.class);
		List<metisimport.View1> s = dao.v1.findAll();
		
		//for(metisimport.View1 d:s)
		for(int i=0;i<10;i++)
		{
		//	d.Importview1ToXML(xmlOutputFactory,i);
					s.get(i).Importview1ToXML(xmlOutputFactory,i);
		}
		
		List<Object> o = new ArrayList<>();
		o.addAll(s);

		// metisImportToXML(o);
	}

	
	
	
	
	
	
	
	
	
	
	public static void metisToXML(List<Object> l) {
		Marshaller marshaller;
		JAXBContext jaxbContext;
		try {
			for (int i = 0; i < 10; i++) {
				jaxbContext = JAXBContext.newInstance(View3.class, View2.class, View1.class);
				marshaller = jaxbContext.createMarshaller();
				marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				marshaller.marshal(l.get(i), new File("Dokument" + i + ".xml"));
				marshaller.marshal(l.get(i), System.out);
			}
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	public static void metisImportToXML(List<Object> l) {
		Marshaller marshaller;
		JAXBContext jaxbContext;
		try {
			for (int i = 0; i < 10; i++) {
				jaxbContext = JAXBContext.newInstance(metisimport.View2.class, metisimport.View1.class);
				marshaller = jaxbContext.createMarshaller();
				marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				marshaller.marshal(l.get(i), new File("Dokument" + i + ".xml"));
				marshaller.marshal(l.get(i), System.out);
			}
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	
}
