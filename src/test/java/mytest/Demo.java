package mytest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import java.net.URL;

public class Demo {
	public static void main(String[] args) {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
		MyTestBean bean=(MyTestBean) bf.getBean ( "myTestBean" );
		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
		MyTestBean myTestBean = (MyTestBean) beanFactory.getBean("myTestBean");
		System.out.println(myTestBean.getTestStr());
	}
}
