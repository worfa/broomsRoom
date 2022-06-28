package org.electricBrooms.service;

import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;
import lombok.RequiredArgsConstructor;
import org.electricBrooms.entity.ServiceApp;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.Link;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DiscoverService {

    private final EurekaClient discoveryClient;

    public CollectionModel<ServiceApp> getServiceCollecitonModel(){
        List<Application> applications = discoveryClient.getApplications().getRegisteredApplications();
        List<ServiceApp> serviceDiscoverieList =
                applications
                        .stream()
                        .filter(application -> !application.getName().equals("GATEWAY"))
                        .map(application -> new ServiceApp(application.getName(), Link.of("http://localhost:8081/" + application.getName().toLowerCase())))
                        .collect(Collectors.toList());

        CollectionModel<ServiceApp> serviceAppCollectionModel = CollectionModel.of(serviceDiscoverieList);
        return serviceAppCollectionModel;
    }

}
