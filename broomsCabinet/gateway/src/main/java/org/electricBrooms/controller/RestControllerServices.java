package org.electricBrooms.controller;

import com.netflix.discovery.shared.Application;
import lombok.RequiredArgsConstructor;
import org.electricBrooms.entity.ServiceApp;
import org.electricBrooms.service.DiscoverService;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class RestControllerServices {

    private final DiscoverService discoverService;

    @RequestMapping(value = "/", produces = { "application/hal+json" })
    public CollectionModel<ServiceApp> serviceDiscoveryList() {
        return discoverService.getServiceCollecitonModel();
    }

}
