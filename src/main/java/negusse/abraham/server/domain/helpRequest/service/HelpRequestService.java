package negusse.abraham.server.domain.helpRequest.service;

import negusse.abraham.server.domain.helpRequest.model.HelpRequest;

import java.util.List;

public interface HelpRequestService {
    HelpRequest create(HelpRequest helpRequest);
    Iterable<HelpRequest> getAll();
//    HelpRequest delete(HelpRequest helpRequest);
}
