package com.corespring;

/*import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.beans.BeansException;
import org.springframework.core.io.*;  */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {
	
	public static void main(String[] args) {  
        
       /* Resource r=new ClassPathResource("applicationContext.xml");  
        BeanFactory factory=new XmlBeanFactory(r); 
        Employee s=(Employee)factory.getBean("emp");  
        s.show();  */
		
		ApplicationContext cont = new ClassPathXmlApplicationContext("com/corespring/configur.xml");  
        Employee e = (Employee) cont.getBean("emp");
        
        System.out.println(e);
       
          
    }  

}
