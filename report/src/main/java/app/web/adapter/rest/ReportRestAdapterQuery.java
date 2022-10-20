package app.web.adapter.rest;

import app.web.application.dto.ReportQueryDto;
import app.web.application.dto.ReportSimpleQueryDto;
import app.web.application.query.ReportQuery;
import app.web.exception.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reports")
@CrossOrigin("*")
@AllArgsConstructor
class ReportRestAdapterQuery {
    private final ReportQuery reportQuery;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<ReportSimpleQueryDto> findAll(@PageableDefault(sort = {"reportDate", "lineName"}, direction = Sort.Direction.DESC) Pageable pageable) {
        return reportQuery.findAll(pageable);
    }

    @GetMapping("/{id}")
    ReportQueryDto findById(@PathVariable(name = "id") long reportId) {
        return reportQuery.findById(reportId)
                .orElseThrow(() -> new NotFoundException("Raport z id: " + reportId + " nie istnieje"));
    }
}
