package org.electricBrooms.entity;

import com.netflix.appinfo.InstanceInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.RepresentationModel;

import java.util.List;

@Data
@AllArgsConstructor
public class ServiceApp extends RepresentationModel<ServiceApp> {

    private String nameService;
    private Link link;
}
