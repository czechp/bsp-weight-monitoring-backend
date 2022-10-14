package app.web.adapter.rest;

import app.web.application.dto.DosingDeviceQueryDto;
import app.web.application.query.DosingDeviceQuery;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/dosing-devices")
@CrossOrigin("*")
@AllArgsConstructor
class DosingDeviceRestAdapterQuery {
    private final DosingDeviceQuery dosingDeviceQuery;

    @GetMapping("/first")
    List<DosingDeviceQueryDto> findAllFirst(Pageable pageable){
        return dosingDeviceQuery.findAllFirst(pageable);
    }


    @GetMapping("/last")
    List<DosingDeviceQueryDto> findAllLast(Pageable pageable){
        return dosingDeviceQuery.findAllLast(pageable);
    }
}
