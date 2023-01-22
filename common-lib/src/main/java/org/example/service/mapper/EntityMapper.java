package org.example.service.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;
import java.util.Set;

public interface EntityMapper<D, E> {
    E toEntity(D dto);
    D toDTO(E entity);
    List<E> toEntities(List<D> dtoList);
    List<D> toDTOs(List<E> entityList);
    Set<E> toEntities(Set<D> dtoList);
    Set<D> toDTOs(Set<E> entityList);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void partialUpdate(@MappingTarget E entity, D dto);
}
