//package com.orquestrador.serie.api.application.mapper;
//
//import com.anime.api.application.presentation.representation.AnimeRequestRepresentation;
//import com.anime.api.application.presentation.representation.AnimeResponseRepresentation;
//import com.anime.api.application.repository.jpa.entity.AnimeEntity;
//import com.anime.api.domain.domain.Anime;
//import com.orquestrador.serie.api.application.presentation.representation.AnimeRequestRepresentation;
//import com.orquestrador.serie.api.application.presentation.representation.AnimeResponseRepresentation;
//import lombok.experimental.UtilityClass;
//import org.apache.logging.log4j.util.Supplier;
//import org.jetbrains.annotations.NotNull;
//import org.modelmapper.ModelMapper;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static java.util.Objects.nonNull;
//
//@UtilityClass
//public class AnimeMapper {
//
//    private final Supplier<ModelMapper> modelMapperSupplier = ModelMapper::new;
//
//    public Anime paraDominio(AnimeRequestRepresentation representation) {
//        return modelMapperSupplier.get().map(representation, Anime.class);
//    }
//
//    public AnimeResponseRepresentation paraRepresentacao(Anime anime){
//        return modelMapperSupplier.get().map(anime, AnimeResponseRepresentation.class);
//    }
//
//    public AnimeEntity paraEntity(Anime anime) {
//        return modelMapperSupplier.get().map(anime, AnimeEntity.class);
//    }
//
//    public Anime entityParaDominio(AnimeEntity entity) {
//        if (nonNull(entity)){
//            return modelMapperSupplier.get().map(entity, Anime.class);
//
//        }
//        return null;
//    }
//
//    public List<AnimeResponseRepresentation> paraAnimeRespostaRepresentacaoLista(@NotNull List<Anime> animeList) {
//        List<AnimeResponseRepresentation> animeRepresentationList = new ArrayList<>();
//        animeList.forEach(anime -> {
//            animeRepresentationList.add(paraRepresentacao(anime));
//        });
//
//        return animeRepresentationList;
//    }
//
//    public  List<Anime> paraListaDominio(List<AnimeEntity> animeEntity) {
//        List<Anime> animeList = new ArrayList<>();
//        for (AnimeEntity anime : animeEntity) {
//            animeList.add(entityParaDominio(anime));
//        }
//
//        return animeList;
//    }
//
//}
