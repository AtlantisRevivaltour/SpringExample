package com.atlantis.code;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by IntelliJ IDEA
 * StudentDAO 接口
 * Description: 请添加描述。
 * User: Atlantis
 * Date: 16/7/30
 * Time: 上午1:35
 */
public interface StudentDAO {
    public  void setDataSource(DataSource ds);

    public  void create(String name , Integer age,Integer marks, Integer year);


    public List<StudentMarks> listStudents();
}
