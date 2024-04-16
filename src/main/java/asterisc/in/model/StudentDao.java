package asterisc.in.model;

import org.springframework.orm.hibernate3.HibernateTemplate;


public class StudentDao {

	HibernateTemplate temp;

	public HibernateTemplate getTemp() {
		return temp;
	}

	public void setTemp(HibernateTemplate temp) {
		this.temp = temp;
	}
	
	public void save(Student s)
	{
		temp.save(s);
	}

	
}
