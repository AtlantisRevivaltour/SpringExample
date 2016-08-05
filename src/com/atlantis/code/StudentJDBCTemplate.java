package com.atlantis.code;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by IntelliJ IDEA
 * StudentJDBCTemplate class
 * Description: 请添加描述。
 * User: Atlantis
 * Date: 16/7/30
 * Time: 上午1:51
 */

public class StudentJDBCTemplate implements StudentDAO{
//    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
//    private SimpleJdbcCall jdbcCall;
//    private PlatformTransactionManager platformTransactionManager;

    @Override
    public void setDataSource(DataSource ds) {
//        this.dataSource = ds;
//        this.jdbcTemplate = new JdbcTemplate(dataSource);
        this.jdbcTemplate = new JdbcTemplate(ds);
//        this.jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("getRecord");
    }

//    public void setPlatformTransactionManager (PlatformTransactionManager platformTransactionManager){
//        this.platformTransactionManager = platformTransactionManager;
//    }

    @Override
    public void create(String name, Integer age,Integer marks, Integer year) {
//        String sql = "insert into Student (name, age) values (?, ?)";
//        jdbcTemplate.update(sql, name, age);
//        System.out.println("Create Record. Name = " + name + "  Age = " + age);
//        return;
//
//            TransactionDefinition def = new DefaultTransactionDefinition();
//            TransactionStatus status = platformTransactionManager.getTransaction(def);
        try {
            String SQL1 = "insert into Student (name, age) values (?, ?)";
            jdbcTemplate.update( SQL1, name, age);

            String SQL2 = "select max(id) from Student";
            Integer sid = jdbcTemplate.queryForObject(SQL2, Integer.class);
            sid = null!=sid ? sid:0;
            String SQL3 = "insert into marks(sid,marks,year)" + "values(?,?,?)";
            jdbcTemplate.update(SQL3, sid, marks, year);
            System.out.println("Created Name = " + name + ", Age = " + age);
//            platformTransactionManager.commit(status);
//      -----      throw new RuntimeException("simulate Error condition") ;
        }catch (DataAccessException e) {
            System.out.println("Error in creating record, rolling back");
//            platformTransactionManager.rollback(status);
            throw e;
        }
    }



    @Override
    public List<StudentMarks> listStudents() {
        String SQL = "select * from Student, Marks where Student.id=Marks.sid";
        List<StudentMarks> studentMarkses = jdbcTemplate.query(SQL,new StudentMarksMapper());
        return studentMarkses;
    }


}
