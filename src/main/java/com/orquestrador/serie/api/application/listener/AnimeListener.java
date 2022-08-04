package com.orquestrador.serie.api.application.listener;

import com.orquestrador.serie.api.application.presentation.representation.AnimeResponseRepresentation;
import com.orquestrador.serie.api.domain.util.JsonUtil;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;


@Component
public class AnimeListener {
    @RabbitListener(queues = {"${queue.name}"})
    public void receive(@Payload String mensagem) {
        AnimeResponseRepresentation animes = JsonUtil.deJson(mensagem, AnimeResponseRepresentation.class);
        System.out.println("Message " + animes.toString());
    }
}
