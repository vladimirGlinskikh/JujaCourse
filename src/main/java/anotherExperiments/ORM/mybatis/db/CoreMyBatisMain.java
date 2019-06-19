package anotherExperiments.ORM.mybatis.db;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;
import java.util.List;

public class CoreMyBatisMain {
    public static void main(String[] args) {
        try {
            CoreMyBatisMain main = new CoreMyBatisMain();
// Printing pets data
            List<PetDVO> allPets = main.getAllPetsData();
            System.out.println("--- allPets ----" + allPets.size());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static SqlSession getSqlSession() throws Exception {
        SqlSessionFactory sqlSessionFactory;
        String resource = "core-mybatis-config.xml";
        Reader reader =
                Resources.getResourceAsReader(resource);
        sqlSessionFactory = new
                SqlSessionFactoryBuilder().build(reader);
        return sqlSessionFactory.openSession();
    }

    public List<PetDVO> getAllPetsData() throws Exception {
        return getSqlSession().selectList("getAllPets");
    }
}
