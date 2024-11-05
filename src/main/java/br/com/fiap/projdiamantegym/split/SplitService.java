package br.com.fiap.projdiamantegym.split;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SplitService {
    private final SplitRepository splitRepository;

    public SplitService(SplitRepository splitRepository) {
        this.splitRepository = splitRepository;
    }

    public List<Split> findAll(){
        return splitRepository.findAll();
    }
}
