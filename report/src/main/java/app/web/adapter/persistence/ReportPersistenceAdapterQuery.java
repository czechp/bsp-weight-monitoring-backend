package app.web.adapter.persistence;

import app.web.application.dto.ReportQueryDto;
import app.web.application.dto.ReportSimpleQueryDto;
import app.web.application.port.query.ReportPortQuery;
import app.web.domain.ReportFactory;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
class ReportPersistenceAdapterQuery implements ReportPortQuery {
    private final ReportRepository repository;

    @Override
    public List<ReportSimpleQueryDto> findAll(Pageable pageable) {
        return repository.findAll(pageable)
                .stream()
                .map(ReportFactory::toSimpleDto)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<ReportQueryDto> findById(long id) {
        return repository.findById(id)
                .map(ReportFactory::toDto);
    }
}
