package co.edu.unicauca.saberpro.lifecycle.messaging.listener;

import co.edu.unicauca.saberpro.lifecycle.messaging.event.QuestionReviewSubmittedEvent;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ReviewQueueConsumer {

    @RabbitListener(queues = "${saberpro.events.queue}")
    public void processReviewNotification(QuestionReviewSubmittedEvent payloadEvent) {
        System.out.println("[Lifecycle-Service] Evento recibido para revisión. ID Pregunta: " + payloadEvent.getQuestionId());
    }
}
