package com.engine.fakau.springmongodb.service.serviceImpl;

import com.engine.fakau.springmongodb.domaine.Categorie;
import com.engine.fakau.springmongodb.repository.CategorieRepository;
import com.engine.fakau.springmongodb.service.CategorieService;
import com.engine.fakau.springmongodb.service.dto.CategorieDTO;
import com.engine.fakau.springmongodb.service.mapper.CategorieMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class CategorieServiceImpl implements CategorieService {

    private final CategorieRepository categorieRepository;
    private final CategorieMapper categorieMapper;

    public  CategorieServiceImpl (final CategorieRepository categorieRepository,
                                  final CategorieMapper categorieMapper){
        this.categorieRepository = categorieRepository;
        this.categorieMapper = categorieMapper;
    }

    @Override
    public CategorieDTO save(CategorieDTO categorieDTO) {
        Categorie categorie = categorieMapper.toEntity(categorieDTO);
        return categorieMapper.toDto(categorieRepository.save(categorie));
    }

    @Override
    public List<CategorieDTO> findAll() {
        return categorieRepository.findAll()
                .stream()
                .map(categorieMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<CategorieDTO> findOneById(Long id) {
        return categorieRepository.findOneById(id)
                .map(categorieMapper::toDto);
    }

    @Override
    public Optional<CategorieDTO> findOneByNom(String nom) {
        return categorieRepository.findOneByNom(nom)
                .map(categorieMapper::toDto);
    }

    @Override
    public void delete(Long id) {
        categorieRepository.deleteById(id);
    }
}
