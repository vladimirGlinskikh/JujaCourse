package anotherExperiments.myBatis.maper;

import anotherExperiments.myBatis.dal.Subscriber;

import java.util.List;

public interface SubscriberMapper {
    Subscriber getSubscriberById(Integer id);

    List getSubscriber();

    List<Subscriber> getSubscribers();
}
