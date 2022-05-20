package negusse.abraham.server.domain.helpRequest.service;

import lombok.extern.slf4j.Slf4j;
import negusse.abraham.server.domain.helpRequest.model.HelpRequest;
import negusse.abraham.server.domain.helpRequest.repo.HelpRequestRepo;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
@Slf4j
public class HelpRequestServiceImpl implements HelpRequestService{

    private HelpRequestRepo repo;

    public HelpRequestServiceImpl(HelpRequestRepo repo){
        this.repo = repo;
    }

    @Override
    public HelpRequest create(HelpRequest helpRequest) {
        helpRequest = repo.save(helpRequest);
        log.info(helpRequest.toString());
        return helpRequest;
    }

    @Override
    public Iterable<HelpRequest> getAll() {
        return repo.findAll();
    }
}
