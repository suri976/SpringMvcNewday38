package ai.jobiak.mvc;
import java.sql.*;
import org.springframework.jdbc.core.*;

public class UserDao {
	private JdbcTemplate mysqlTemplate;

	public JdbcTemplate getMysqlTemplate() {
		return mysqlTemplate;
	}

	public void setMysqlTemplate(JdbcTemplate mysqlTemplate) {
		this.mysqlTemplate = mysqlTemplate;
	}

	public Boolean insertRow(String fname,long mobile,String email) 
	{
		String query="insert into signup values(?,?,?)";
		return mysqlTemplate.execute(query,new PreparedStatementCallback<Boolean>()
			{
public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException
	{
		ps.setString(1, fname);
		ps.setString(3, email);
		ps.setLong(2, mobile);
		return ps.execute();
	}	
	});
}
}

