package negusse.abraham.server.domain.helpRequest.controller;

import lombok.extern.slf4j.Slf4j;
import negusse.abraham.server.domain.helpRequest.model.HelpRequest;
import negusse.abraham.server.domain.helpRequest.service.HelpRequestService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/help")
@CrossOrigin("*")
public class HelpRequestController {

    private HelpRequestService service;

    public HelpRequestController(HelpRequestService service){
        this.service = service;
    }

    @GetMapping("")
    public ResponseEntity<Iterable<HelpRequest>> getAll(){
        Iterable<HelpRequest> allRequest = service.getAll();
        return new ResponseEntity<>(allRequest, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<HelpRequest> create(@RequestBody HelpRequest helpRequest){
        helpRequest = service.create(helpRequest);
        return new ResponseEntity<>(helpRequest, HttpStatus.CREATED);
    }

}
