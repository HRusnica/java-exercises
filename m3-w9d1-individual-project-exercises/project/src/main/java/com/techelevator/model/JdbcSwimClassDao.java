package com.techelevator.model;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import com.techelevator.model.SwimClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JdbcSwimClassDao implements SwimClassDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public JdbcSwimClassDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public SwimClass getClassDetails(Long id) {
		SwimClass swimClass = new SwimClass();
		String sqlSelectAllClasses = "SELECT * FROM class WHERE class_id=?";
		SqlRowSet classInfo = jdbcTemplate.queryForRowSet(sqlSelectAllClasses, id);
		if(classInfo.next()) {
			swimClass.setClassId(classInfo.getLong("class_id"));
			swimClass.setClassName(classInfo.getString("class_name"));
			swimClass.setSkill1(classInfo.getString("skill1"));
			swimClass.setSkill1Introduced(classInfo.getBoolean("skill1_introduced"));
			swimClass.setSkill1Description(classInfo.getString("skill1_description"));
			swimClass.setSkill2(classInfo.getString("skill2"));
			swimClass.setSkill2Introduced(classInfo.getBoolean("skill2_introduced"));
			swimClass.setSkill2Description(classInfo.getString("skill2_description"));
			swimClass.setSkill3(classInfo.getString("skill3"));
			swimClass.setSkill3Introduced(classInfo.getBoolean("skill3_introduced"));
			swimClass.setSkill3Description(classInfo.getString("skill3_description"));
			swimClass.setSkill4(classInfo.getString("skill4"));
			swimClass.setSkill4Introduced(classInfo.getBoolean("skill4_introduced"));
			swimClass.setSkill4Description(classInfo.getString("skill4_description"));
			swimClass.setSkill5(classInfo.getString("skill5"));
			swimClass.setSkill5Introduced(classInfo.getBoolean("skill5_introduced"));
			swimClass.setSkill5Description(classInfo.getString("skill5_description"));
			swimClass.setSkill6(classInfo.getString("skill6"));
			swimClass.setSkill6Introduced(classInfo.getBoolean("skill6_introduced"));
			swimClass.setSkill6Description(classInfo.getString("skill6_description"));
			swimClass.setSkill7(classInfo.getString("skill7"));
			swimClass.setSkill7Introduced(classInfo.getBoolean("skill7_introduced"));
			swimClass.setSkill7Description(classInfo.getString("skill7_description"));
			swimClass.setSkill8(classInfo.getString("skill8"));
			swimClass.setSkill8Introduced(classInfo.getBoolean("skill8_introduced"));
			swimClass.setSkill8Description(classInfo.getString("skill8_description"));
			swimClass.setSkill9(classInfo.getString("skill9"));
			swimClass.setSkill9Introduced(classInfo.getBoolean("skill9_introduced"));
			swimClass.setSkill9Description(classInfo.getString("skill9_description"));
		}
		return swimClass;
	}


	@Override
	public void update(SwimClass swimClass) {
		Boolean s1;
		Boolean s2;
		Boolean s3;
		Boolean s4;
		Boolean s5;
		Boolean s6;
		Boolean s7;
		Boolean s8;
		Boolean s9;
		String sqlUpdateClass = "Update class SET skill1_introduced = ?, skill2_introduced = ?, skill3_introduced = ?, skill4_introduced = ?,"
				+ "skill5_introduced = ?, skill6_introduced = ?, skill7_introduced = ?, skill8_introduced = ?, skill9_introduced = ? ";
		if(swimClass.getSkill1Introduced()){
			s1 = true;
		} else {s1 = false;
	}
	if(swimClass.getSkill2Introduced()){
		s2 = true;
	} else {s2 = false;
}
if(swimClass.getSkill3Introduced()){
	s3 = true;
} else {s3 = false;
}
if(swimClass.getSkill4Introduced()){
	s4 = true;
} else { s4 = false;
}
if(swimClass.getSkill5Introduced()){
	s5 = true;
} else {s5 = false;
}
if(swimClass.getSkill6Introduced()){
	s6 = true;
} else {s6 = false;
}
if(swimClass.getSkill7Introduced()){
	s7 = true;
} else { s7 = false;
}
if(swimClass.getSkill8Introduced()){
	s8 = true;
} else { s8 = false;
}
if(swimClass.getSkill9Introduced()){
	s9 = true;
} else {s9 = false;
}
		
		jdbcTemplate.update (sqlUpdateClass, 
				s1,
				s2,
				s3,
				s4,
				s5,
				s6,
				s7,
				s8,
				s9);
	}

	
	
}
