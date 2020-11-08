package com.engine.fakau.springmongodb.service.serviceImpl;

import com.engine.fakau.springmongodb.domaine.Produit;
import com.engine.fakau.springmongodb.repository.ProduitRepository;
import com.engine.fakau.springmongodb.service.ProduitService;
import com.engine.fakau.springmongodb.service.dto.ProduitDTO;
import com.engine.fakau.springmongodb.service.mapper.ProduitMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class ProduitServiceImpl implements ProduitService {
    private final ProduitRepository produitRepository;
    private final ProduitMapper produitMapper;

    public ProduitServiceImpl(final ProduitRepository produitRepository, final ProduitMapper produitMapper) {
        this.produitRepository = produitRepository;
        this.produitMapper = produitMapper;
    }

    @Override
    public ProduitDTO save(ProduitDTO produitDTO) {
        Produit produit = produitMapper.toEntity(produitDTO);
        return produitMapper.toDto(produitRepository.save(produit));
    }

    @Override
    public List<ProduitDTO> findAll() {
        return produitRepository.findAll()
                .stream()
                .map(produitMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<ProduitDTO> search(String keyWord) {
        return produitRepository.search(keyWord)
                .stream()
                .map(produitMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<ProduitDTO> findOneById(Long id) {
        return produitRepository.findOneById(id)
                .map(produitMapper::toDto);
    }

    @Override
    public void delete(Long id) {
        produitRepository.deleteById(id);
    }
}
