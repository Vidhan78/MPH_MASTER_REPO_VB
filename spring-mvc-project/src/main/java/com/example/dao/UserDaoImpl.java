package com.example.dao;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import javax.sql.DataSource;
import com.example.dao.*;
import com.example.model.User;
@Repository
public class UserDaoImpl implements UserDao {
     private JdbcTemplate jdbcTemplate;
     public void setDataSource(DataSource datasource) {
    	 this.jdbcTemplate=new JdbcTemplate(datasource);
    	 
     }
     @Autowired
	public UserDaoImpl(JdbcTemplate jdbcTemplate){
    	 this.jdbcTemplate=jdbcTemplate;
     }
     @Override
     public List<User> getUsers(){
    	 return jdbcTemplate.query("Select* from users",(rs,rowNum)->new User(rs.getInt("id"),rs.getString("name")));
		// TODO Auto-generated constructor stub
	}
     @Override
     public void addUser(User user) {
    	 jdbcTemplate.update("Insert Into users (name)values(?)",user.getName());
     }

}