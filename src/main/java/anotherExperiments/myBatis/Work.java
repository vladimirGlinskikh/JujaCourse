package anotherExperiments.myBatis;

import anotherExperiments.myBatis.dal.Subscriber;
import anotherExperiments.myBatis.maper.SubscriberMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class Work {
    public static void main(String[] args) {
        SqlSessionFactory sqlSessionFactory;
        SubscriberMapper subscriberMapper;
        Reader reader = null;
        try {
            reader = Resources
                    .getResourceAsReader("mybatis-config.xml"); //Читаем файл с настройками подключения и настройками MyBatis
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            subscriberMapper = sqlSessionFactory.openSession().getMapper(SubscriberMapper.class); //Создаем маппер, из которого и будем вызывать методы getSubscriberById и getSubscribers
            List<Subscriber> subscribers = subscriberMapper.getSubscribers();
            Subscriber subscriber = subscriberMapper.getSubscriberById(101);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
