package com.jsp.sampleMaven;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("springjdbc.xml");
    	//access object of jdbc template
    	JdbcTemplate template=context.getBean(JdbcTemplate.class);
    	
    	//String query ="insert into employee values(202,'XYZ',40000,25)";
    	String delete="delete from employee where empid=101";
    	int number=template.update(delete);
    	//int status=template.update(query);
    	System.out.println(number);
    	if(number!=0)
    	{
    		//System.out.println("Record inserted");
        System.out.println( "RECORD deleted" );
    	}
    	else {
    		System.out.println("record not deleted");
    	}
    }
}
