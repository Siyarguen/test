package com.example.demo;

import java.io.File;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import metisimport.View2;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class XmLconverterMariaDbApplicationTests {
	View2 v2;

	@Before
	public void setUp() {
		 v2=new View2(5, "testZtitel", "2018", "testKurzZeichen", "Siyar",1, "testBedeutung", 2,
				new Date(2018,9,06),  "testBand 1","testHeft", "testQtitel", 
				"testLieferantNameKurz", "testDoktitel"); 
	}

	@Test
	public void toSaveDataInXMLFile() throws JAXBException
	{
		Marshaller marshaller;
		JAXBContext jaxbContext = JAXBContext.newInstance(View2.class);
		marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(v2, new File("Dokument.xml"));
		marshaller.marshal(v2, System.out);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
