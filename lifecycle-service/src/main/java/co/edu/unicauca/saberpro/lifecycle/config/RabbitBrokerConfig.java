package co.edu.unicauca.saberpro.lifecycle.config;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitBrokerConfig {

    @Value("${saberpro.events.exchange}")
    private String eventExchangeName;

    @Value("${saberpro.events.queue}")
    private String reviewQueueName;

    @Value("${saberpro.events.routing-key}")
    private String submitRoutingKey;

    @Bean
    public TopicExchange questionTopicExchange() {
        return new TopicExchange(eventExchangeName);
    }

    @Bean
    public Queue questionReviewQueue() {
        return new Queue(reviewQueueName, true);
    }

    @Bean
    public Binding reviewQueueBinding(Queue questionReviewQueue, TopicExchange questionTopicExchange) {
        return BindingBuilder.bind(questionReviewQueue).to(questionTopicExchange).with(submitRoutingKey);
    }
}
